package esjc.ast;

import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.eclipse.jdt.core.dom.*;

import esjc.parser.ExtendedStaticJavaBaseVisitor;
import esjc.parser.ExtendedStaticJavaParser;
import esjc.parser.ExtendedStaticJavaParser.CompilationUnitContext;

/**
 * This class builds JDT AST from ANTLR Parse Tree produced by
 * ExtendedStaticJava parser.
 *
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ExtendedStaticJavaASTBuilder extends
        ExtendedStaticJavaBaseVisitor<ASTNode> {

  static CompilationUnit ast(final CompilationUnitContext ctx) {
    final ExtendedStaticJavaASTBuilder builder = new ExtendedStaticJavaASTBuilder();
    return builder.build(ctx);
  }

  final static HashMap<String, InfixExpression.Operator> binopMap;

  final static HashMap<String, PrefixExpression.Operator> unopMap;

  final static HashMap<String, PostfixExpression.Operator> postopMap;
  static {
    binopMap = new HashMap<>(16);
    ExtendedStaticJavaASTBuilder.binopMap.put(
            "||",
            InfixExpression.Operator.CONDITIONAL_OR);
    ExtendedStaticJavaASTBuilder.binopMap.put(
            "&&",
            InfixExpression.Operator.CONDITIONAL_AND);
    ExtendedStaticJavaASTBuilder.binopMap.put("==", InfixExpression.Operator.EQUALS);
    ExtendedStaticJavaASTBuilder.binopMap
            .put("!=", InfixExpression.Operator.NOT_EQUALS);
    ExtendedStaticJavaASTBuilder.binopMap.put("<", InfixExpression.Operator.LESS);
    ExtendedStaticJavaASTBuilder.binopMap.put(">", InfixExpression.Operator.GREATER);
    ExtendedStaticJavaASTBuilder.binopMap.put(
            "<=",
            InfixExpression.Operator.LESS_EQUALS);
    ExtendedStaticJavaASTBuilder.binopMap.put(
            ">=",
            InfixExpression.Operator.GREATER_EQUALS);
    ExtendedStaticJavaASTBuilder.binopMap.put("+", InfixExpression.Operator.PLUS);
    ExtendedStaticJavaASTBuilder.binopMap.put("-", InfixExpression.Operator.MINUS);
    ExtendedStaticJavaASTBuilder.binopMap.put("*", InfixExpression.Operator.TIMES);
    ExtendedStaticJavaASTBuilder.binopMap.put("/", InfixExpression.Operator.DIVIDE);
    ExtendedStaticJavaASTBuilder.binopMap.put("%", InfixExpression.Operator.REMAINDER);
    ExtendedStaticJavaASTBuilder.binopMap.put("<<", InfixExpression.Operator.LEFT_SHIFT);
    ExtendedStaticJavaASTBuilder.binopMap.put(">>", InfixExpression.Operator.RIGHT_SHIFT_SIGNED);
    ExtendedStaticJavaASTBuilder.binopMap.put(">>>", InfixExpression.Operator.RIGHT_SHIFT_UNSIGNED);

    unopMap = new HashMap<>(4);
    ExtendedStaticJavaASTBuilder.unopMap.put("+", PrefixExpression.Operator.PLUS);
    ExtendedStaticJavaASTBuilder.unopMap.put("-", PrefixExpression.Operator.MINUS);
    ExtendedStaticJavaASTBuilder.unopMap.put("!", PrefixExpression.Operator.NOT);
    ExtendedStaticJavaASTBuilder.unopMap.put("~", PrefixExpression.Operator.COMPLEMENT);

    postopMap = new HashMap<>(2);
    ExtendedStaticJavaASTBuilder.postopMap.put("++", PostfixExpression.Operator.INCREMENT);
    ExtendedStaticJavaASTBuilder.postopMap.put("--", PostfixExpression.Operator.DECREMENT);
  }

  protected AST ast = AST.newAST(AST.JLS10);

  private ExtendedStaticJavaASTBuilder() {
  }

  @SuppressWarnings("unchecked")
  private void add(@SuppressWarnings("rawtypes") final List l, final Object o) {
    l.add(o);
  }

  @SuppressWarnings("unchecked")
  private <T extends ASTNode> T build(final ParserRuleContext tree) {
    return (T) visit(tree);
  }

  private <E extends ParserRuleContext> void builds(
          @SuppressWarnings("rawtypes") final List l, final List<E> trees) {
    if (trees != null) {
      for (final E e : trees) {
        add(l, build(e));
      }
    }
  }

  @Override
  public ExpressionStatement visitAssignStatement(
          final ExtendedStaticJavaParser.AssignStatementContext ctx) {
    final Assignment a = this.ast.newAssignment();
    final ExpressionStatement result = this.ast.newExpressionStatement(a);

    a.setLeftHandSide(this.build(ctx.lhs()));
    a.setRightHandSide(this.build(ctx.exp()));
//    System.out.println("RHS: " + a.getRightHandSide());

    return result;
  }

  @Override
  public Expression visitLhs(ExtendedStaticJavaParser.LhsContext ctx) {
    if (ctx.ID() != null && ctx.getChildCount() == 1) {
      return ast.newSimpleName(ctx.ID().getText());
    }

    if (ctx.ID() != null) {
      FieldAccess result = ast.newFieldAccess();
      result.setExpression(build(ctx.exp(0)));
      result.setName(ast.newSimpleName(ctx.ID().getText()));
      return result;
    }

    ArrayAccess result = ast.newArrayAccess();
    result.setArray(build(ctx.exp(0)));
    result.setIndex(build(ctx.exp(1)));
    return result;
  }

  @Override
  public InfixExpression visitBinaryExp(final ExtendedStaticJavaParser.BinaryExpContext ctx) {
    final InfixExpression result = this.ast.newInfixExpression();

//    System.out.println("PARSE TREE: " + ctx.getText() + " OP: " + ctx.op.getText());
//    System.out.println("  e1: " + ctx.e1.getText());
//    System.out.println("  e2: " + ctx.e2.getText());

    result.setLeftOperand(this.build(ctx.e1));
    result.setOperator(ExtendedStaticJavaASTBuilder.binopMap.get(ctx.op.getText()));
    result.setRightOperand(this.build(ctx.e2));

    return result;
  }

  @Override
  public ArrayAccess visitArrayAccessExp(ExtendedStaticJavaParser.ArrayAccessExpContext ctx) {
    ArrayAccess result = this.ast.newArrayAccess();
    result.setArray(build(ctx.e1));
    result.setIndex(build(ctx.e2));
    return result;
  }

  @Override
  public PrimitiveType visitBooleanType(final ExtendedStaticJavaParser.BooleanTypeContext ctx) {
    return this.ast.newPrimitiveType(PrimitiveType.BOOLEAN);
  }

  @Override
  public TypeDeclaration visitClassDefinition(final ExtendedStaticJavaParser.ClassDefinitionContext ctx) {
    final TypeDeclaration result = this.ast.newTypeDeclaration();

    add(result.modifiers(), this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
    result.setName(this.ast.newSimpleName(ctx.ID().getText()));
    add(result.bodyDeclarations(), this.<MethodDeclaration>build(ctx.mainMethodDeclaration()));

    final List<ExtendedStaticJavaParser.MemberDeclarationContext> memberDeclarations = ctx.memberDeclaration();
    if (memberDeclarations != null) {
      builds(result.bodyDeclarations(), memberDeclarations);
    }

    return result;
  }

  @Override
  public FieldDeclaration visitPublicDecLaration(final ExtendedStaticJavaParser.PublicDecLarationContext ctx) {
    final VariableDeclarationFragment result = this.ast.newVariableDeclarationFragment();
    final FieldDeclaration fd = this.ast.newFieldDeclaration(result);
    add(fd.modifiers(), this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
    fd.setType(this.build(ctx.type()));
    result.setName(this.ast.newSimpleName(ctx.ID().getText()));
    return fd;
  }

  @Override
  public CompilationUnit visitCompilationUnit(final CompilationUnitContext ctx) {
    final CompilationUnit result = this.ast.newCompilationUnit();

    for (int i = 0; i < ctx.getChildCount(); i++) {
      if (ctx.getChild(i) instanceof ParserRuleContext) {
        ASTNode node = build((ParserRuleContext) ctx.getChild(i));
        if (node instanceof TypeDeclaration) {
          add(result.types(), node);
        }
      }
    }

    return result;
  }

  @Override
  public BooleanLiteral visitFalseLiteral(final ExtendedStaticJavaParser.FalseLiteralContext ctx) {
    return this.ast.newBooleanLiteral(false);
  }

  @Override
  public FieldDeclaration visitFieldDec(final ExtendedStaticJavaParser.FieldDecContext ctx) {
    final VariableDeclarationFragment vdf = this.ast.newVariableDeclarationFragment();
    final FieldDeclaration result = this.ast.newFieldDeclaration(vdf);

    add(result.modifiers(), this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
    result.setType(this.build(ctx.t));
    vdf.setName(this.ast.newSimpleName(ctx.ID().getText()));

    return result;
  }

  @Override
  public SimpleName visitIdExp(final ExtendedStaticJavaParser.IdExpContext ctx) {
    return this.ast.newSimpleName(ctx.ID().getText());
  }

  @Override
  public IfStatement visitIfStatement(final ExtendedStaticJavaParser.IfStatementContext ctx) {
    final IfStatement result = this.ast.newIfStatement();
    final Block thenBlock = this.ast.newBlock();
    final List<ExtendedStaticJavaParser.StatementContext> ts = ctx.ts;
    final Block elseBlock = this.ast.newBlock();

    result.setThenStatement(thenBlock);
    result.setElseStatement(elseBlock);
    result.setExpression(this.build(ctx.exp()));

    if (ts != null) {
      builds(thenBlock.statements(), ts);
    }

    final List<ExtendedStaticJavaParser.StatementContext> fs = ctx.fs;
    if (fs != null) {
      builds(elseBlock.statements(), fs);
    }

    return result;
  }

  @Override
  public NumberLiteral visitIntLiteral(final ExtendedStaticJavaParser.IntLiteralContext ctx) {
    final NumberLiteral result = this.ast.newNumberLiteral();

    result.setToken(ctx.getText());

    return result;
  }

  @Override
  public PrimitiveType visitIntType(final ExtendedStaticJavaParser.IntTypeContext ctx) {
    return this.ast.newPrimitiveType(PrimitiveType.INT);
  }

  @Override
  public ExpressionStatement visitIncDecStmt(final ExtendedStaticJavaParser.IncDecStmtContext ctx) {
    return ast.newExpressionStatement(build(ctx.incDecStatement().incDec()));

  }

  @Override
  public PostfixExpression visitIncDec(ExtendedStaticJavaParser.IncDecContext ctx) {

    PostfixExpression result = ast.newPostfixExpression();
    result.setOperand(build(ctx.e));
    result.setOperator(postopMap.get(ctx.op.getText()));

    return result;
  }

  @Override
  public Expression visitNewExp(final ExtendedStaticJavaParser.NewExpContext ctx) {

    ClassInstanceCreation result = this.ast.newClassInstanceCreation();
    result.setType(this.ast.newSimpleType(this.ast.newSimpleName(ctx.id.getText())));

    return result;
  }

  @Override
  public Expression visitNewExpArray(final ExtendedStaticJavaParser.NewExpArrayContext ctx) {

    ArrayCreation result = this.ast.newArrayCreation();
    Type baseType = this.build(ctx.t);
    result.setType(this.ast.newArrayType(baseType));

    if (ctx.e != null) {
      result.dimensions().add(this.build(ctx.e));
    }

    return result;
  }

  @Override
  public Expression visitNewArrayInit(final ExtendedStaticJavaParser.NewArrayInitContext ctx) {
    ArrayCreation result = this.ast.newArrayCreation();
    result.setType(this.ast.newArrayType(this.build(ctx.t)));
    result.setInitializer(build(ctx.a));

    return result;
  }

  @Override
  public ArrayInitializer visitArrayInitilizationStatement(final ExtendedStaticJavaParser.ArrayInitilizationStatementContext ctx) {
    ArrayInitializer result = this.ast.newArrayInitializer();
    builds(result.expressions(), ctx.exp());

    return result;
  }

  @Override
  public FieldAccess visitFieldAccess(ExtendedStaticJavaParser.FieldAccessContext ctx) {
    FieldAccess result = this.ast.newFieldAccess();
    result.setExpression(build(ctx.e));
    result.setName(this.ast.newSimpleName(ctx.id.getText()));

    return result;
  }

  @Override
  public MethodInvocation visitInvoke(final ExtendedStaticJavaParser.InvokeContext ctx) {
    final MethodInvocation result = this.ast.newMethodInvocation();
    final ExtendedStaticJavaParser.ArgsContext args = ctx.args();

    if (ctx.id1 != null) {
      result.setExpression(this.ast.newSimpleName(ctx.id1.getText()));
    }

    result.setName(this.ast.newSimpleName(ctx.id2.getText()));

    if (args != null) {
      builds(result.arguments(), args.exp());
    }

    return result;
  }

  @Override
  public MethodInvocation visitInvokeExp(final ExtendedStaticJavaParser.InvokeExpContext ctx) {
    return this.build(ctx.invoke());
  }

  @Override
  public ExpressionStatement visitInvokeExpStatement(final ExtendedStaticJavaParser.InvokeExpStatementContext ctx) {
    return this.ast.newExpressionStatement(this.<MethodInvocation>build(ctx.invoke()));
  }

  @Override
  public VariableDeclarationStatement visitLocalDeclaration(final ExtendedStaticJavaParser.LocalDeclarationContext ctx) {
    final VariableDeclarationFragment vdf = this.ast.newVariableDeclarationFragment();
    final VariableDeclarationStatement result = this.ast.newVariableDeclarationStatement(vdf);

    result.setType(this.build(ctx.type()));
    vdf.setName(this.ast.newSimpleName(ctx.ID().getText()));

    return result;
  }

  @Override
  public MethodDeclaration visitMainMethodDeclaration(
          final ExtendedStaticJavaParser.MainMethodDeclarationContext ctx) {
    final MethodDeclaration result = this.ast.newMethodDeclaration();
    add(result.modifiers(), this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
    add(result.modifiers(), this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
    result.setReturnType2(this.ast.newPrimitiveType(PrimitiveType.VOID));
    result.setName(this.ast.newSimpleName("main"));

    final SingleVariableDeclaration svd = this.ast.newSingleVariableDeclaration();

    svd.setType(this.ast.newArrayType(this.ast.newSimpleType(this.ast.newSimpleName("String"))));
    svd.setName(this.ast.newSimpleName(ctx.id3.getText()));
    add(result.parameters(), svd);
    result.setBody(this.build(ctx.methodBody()));

    return result;
  }

  @Override
  public Block visitMethodBody(final ExtendedStaticJavaParser.MethodBodyContext ctx) {
    final Block result = this.ast.newBlock();

    final List<ExtendedStaticJavaParser.LocalDeclarationContext> localDeclarations = ctx.localDeclaration();
    if (localDeclarations != null) {
      builds(result.statements(), localDeclarations);
    }

    final List<ExtendedStaticJavaParser.StatementContext> statements = ctx.statement();
    if (statements != null) {
      builds(result.statements(), statements);
    }

    return result;
  }

  @Override
  public MethodDeclaration visitMethodDec(final ExtendedStaticJavaParser.MethodDecContext ctx) {
    final MethodDeclaration result = this.ast.newMethodDeclaration();
    add(result.modifiers(),this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

    result.setReturnType2(this.build(ctx.returnType()));
    result.setName(this.ast.newSimpleName(ctx.ID().getText()));

    final ExtendedStaticJavaParser.ParamsContext params = ctx.params();

    if (params != null) {
      builds(result.parameters(), params.param());
    }

    result.setBody(this.build(ctx.methodBody()));

    return result;
  }

  @Override
  public Type visitTypeReturn(final ExtendedStaticJavaParser.TypeReturnContext ctx) {
    return this.build(ctx.type());
  }

  @Override
  public TypeDeclaration visitCustomClassDeclaration(final ExtendedStaticJavaParser.CustomClassDeclarationContext ctx) {
    TypeDeclaration result = this.ast.newTypeDeclaration();
    result.setName(this.ast.newSimpleName(ctx.ID().getText()));
    builds(result.bodyDeclarations(), ctx.publicFieldDeclaration());

    return result;
  }

  @Override
  public Type visitCustomType(final ExtendedStaticJavaParser.CustomTypeContext ctx) {
    Type result;

    if (ctx.bt != null) {
      result = build(ctx.bt);
    } else {
      result = this.ast.newSimpleType(this.ast.newSimpleName(ctx.id.getText()));
    }

    if (ctx.getChildCount() >= 3) {
      return this.ast.newArrayType(result);
    }

    return result;
  }

  @Override
  public NullLiteral visitNullLiteral(final ExtendedStaticJavaParser.NullLiteralContext ctx) {
    return this.ast.newNullLiteral();
  }

  @Override
  public SingleVariableDeclaration visitParam(final ExtendedStaticJavaParser.ParamContext ctx) {
    final SingleVariableDeclaration result = this.ast.newSingleVariableDeclaration();

    result.setType(this.build(ctx.type()));
    result.setName(this.ast.newSimpleName(ctx.ID().getText()));

    return result;
  }

  @Override
  public ParenthesizedExpression visitParenExp(final ExtendedStaticJavaParser.ParenExpContext ctx) {
    final ParenthesizedExpression result = this.ast.newParenthesizedExpression();

    result.setExpression(this.build(ctx.exp()));

    return result;
  }

  @Override
  public ReturnStatement visitReturnStatement(final ExtendedStaticJavaParser.ReturnStatementContext ctx) {
    final ReturnStatement result = this.ast.newReturnStatement();
    final ExtendedStaticJavaParser.ExpContext exp = ctx.exp();

    if (exp != null) {
      result.setExpression(this.build(exp));
    }

    return result;
  }

  @Override
  public BooleanLiteral visitTrueLiteral(final ExtendedStaticJavaParser.TrueLiteralContext ctx) {
    return this.ast.newBooleanLiteral(true);
  }

  @Override
  public PrefixExpression visitUnaryExp(final ExtendedStaticJavaParser.UnaryExpContext ctx) {
    final PrefixExpression result = this.ast.newPrefixExpression();

    result.setOperator(ExtendedStaticJavaASTBuilder.unopMap.get(ctx.op.getText()));
//    System.out.println("Result Operator: " + result.getOperator());
    result.setOperand(this.build(ctx.exp()));
//    System.out.println("Result Operand: " + result.getOperand());

    return result;
  }

  @Override
  public ConditionalExpression visitTernaryExp(final ExtendedStaticJavaParser.TernaryExpContext ctx) {
    final ConditionalExpression result = this.ast.newConditionalExpression();

    result.setExpression(this.build(ctx.e1));
    result.setThenExpression(this.build(ctx.e2));
    result.setElseExpression(this.build(ctx.e3));

    return result;
  }

  @Override
  public PrimitiveType visitVoidReturn(final ExtendedStaticJavaParser.VoidReturnContext ctx) {
    return this.ast.newPrimitiveType(PrimitiveType.VOID);
  }

  @Override
  public ForStatement visitForDeclaration(ExtendedStaticJavaParser.ForDeclarationContext ctx) {
    ForStatement result = ast.newForStatement();

    if (ctx.fi != null) {
      builds(result.initializers(), ctx.fi.forInit());
    }

    if (ctx.e != null) {
      result.setExpression(build(ctx.e));
    }

    if (ctx.fu != null) {
      builds(result.updaters(), ctx.fu.incDec());
    }

    Block body = ast.newBlock();
    builds(body.statements(), ctx.statement());
    result.setBody(body);

    return result;
  }

  @Override
  public Assignment visitForInit(ExtendedStaticJavaParser.ForInitContext ctx) {
    Assignment result = this.ast.newAssignment();
    result.setLeftHandSide(this.build(ctx.lh));
    result.setRightHandSide(this.build(ctx.e));
    return result;
  }

  @Override
  public DoStatement visitDoWhileStatement(final ExtendedStaticJavaParser.DoWhileStatementContext ctx) {
    DoStatement result = this.ast.newDoStatement();
    Block doWhileBody = this.ast.newBlock();

    if (ctx.s != null) {
      builds(doWhileBody.statements(), ctx.statement());
    }
    result.setBody(doWhileBody);
    result.setExpression(this.build(ctx.e));

    return result;
  }

  @Override
  public WhileStatement visitWhileStatement(final ExtendedStaticJavaParser.WhileStatementContext ctx) {
    final WhileStatement result = this.ast.newWhileStatement();
    final Block whileBody = this.ast.newBlock();
    final List<ExtendedStaticJavaParser.StatementContext> statements = ctx.statement();

    result.setExpression(this.build(ctx.exp()));
    if (statements != null) {
      builds(whileBody.statements(), statements);
    }

    result.setBody(whileBody);
    return result;
  }
}