package sjc.ast;

import org.antlr.v4.runtime.ParserRuleContext;
import org.eclipse.jdt.core.dom.*;
import sjc.parser.StaticJavaV4BaseVisitor;
import sjc.parser.StaticJavaV4Parser;

import java.util.HashMap;
import java.util.List;
/**
 * This class builds JDT AST from ANTLR Parse Tree produced by StaticJavaV4
 * parser.
 *
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class StaticJavaASTBuilder extends StaticJavaV4BaseVisitor<ASTNode> {

  static CompilationUnit ast(final StaticJavaV4Parser.CompilationUnitContext ctx) {
    final StaticJavaASTBuilder builder = new StaticJavaASTBuilder();
    return builder.build(ctx);
  }

  final static HashMap<String, InfixExpression.Operator> binopMap;
  final static HashMap<String, PrefixExpression.Operator> unopMap;

  static {
    binopMap = new HashMap<>(16);
    StaticJavaASTBuilder.binopMap.put(
        "||",
        InfixExpression.Operator.CONDITIONAL_OR);
    StaticJavaASTBuilder.binopMap.put(
        "&&",
        InfixExpression.Operator.CONDITIONAL_AND);
    StaticJavaASTBuilder.binopMap
    .put("!=", InfixExpression.Operator.NOT_EQUALS);
    StaticJavaASTBuilder.binopMap.put("==", InfixExpression.Operator.EQUALS);
    StaticJavaASTBuilder.binopMap.put("<", InfixExpression.Operator.LESS);
    StaticJavaASTBuilder.binopMap.put(">", InfixExpression.Operator.GREATER);
    StaticJavaASTBuilder.binopMap.put(
        "<=",
        InfixExpression.Operator.LESS_EQUALS);
    StaticJavaASTBuilder.binopMap.put(
        ">=",
        InfixExpression.Operator.GREATER_EQUALS);
    StaticJavaASTBuilder.binopMap.put("+", InfixExpression.Operator.PLUS);
    StaticJavaASTBuilder.binopMap.put("-", InfixExpression.Operator.MINUS);
    StaticJavaASTBuilder.binopMap.put("*", InfixExpression.Operator.TIMES);
    StaticJavaASTBuilder.binopMap.put("/", InfixExpression.Operator.DIVIDE);
    StaticJavaASTBuilder.binopMap.put("%", InfixExpression.Operator.REMAINDER);

    unopMap = new HashMap<>(4);
    StaticJavaASTBuilder.unopMap.put("+", PrefixExpression.Operator.PLUS);
    StaticJavaASTBuilder.unopMap.put("-", PrefixExpression.Operator.MINUS);
    StaticJavaASTBuilder.unopMap.put("!", PrefixExpression.Operator.NOT);
  }

  protected AST ast = AST.newAST(AST.JLS10);

  private StaticJavaASTBuilder() {
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
      final StaticJavaV4Parser.AssignStatementContext ctx) {
    final Assignment a = this.ast.newAssignment();
    final ExpressionStatement result = this.ast.newExpressionStatement(a);

    a.setLeftHandSide(this.ast.newSimpleName(ctx.ID().getText()));

    a.setRightHandSide(this.build(ctx.exp()));

    return result;
  }

  @Override
  public InfixExpression visitBinaryExp(final StaticJavaV4Parser.BinaryExpContext ctx) {
    final InfixExpression result = this.ast.newInfixExpression();

    result.setLeftOperand(this.build(ctx.e1));

    result.setOperator(StaticJavaASTBuilder.binopMap.get(ctx.op.getText()));

    result.setRightOperand(this.build(ctx.e2));

    return result;
  }

  @Override
  public PrimitiveType visitBooleanType(final StaticJavaV4Parser.BooleanTypeContext ctx) {
    return this.ast.newPrimitiveType(PrimitiveType.BOOLEAN);
  }

  @Override
  public TypeDeclaration visitClassDefinition(final StaticJavaV4Parser.ClassDefinitionContext ctx) {
    final TypeDeclaration result = this.ast.newTypeDeclaration();
    add(
        result.modifiers(),
        this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));

    result.setName(this.ast.newSimpleName(ctx.ID().getText()));

    add(
        result.bodyDeclarations(),
        this.<MethodDeclaration> build(ctx.mainMethodDeclaration()));

    final List<StaticJavaV4Parser.MemberDeclarationContext> memberDeclarations = ctx
        .memberDeclaration();
    if (memberDeclarations != null) {
      builds(result.bodyDeclarations(), memberDeclarations);
    }

    return result;
  }

  @Override
  public CompilationUnit visitCompilationUnit(final StaticJavaV4Parser.CompilationUnitContext ctx) {
    final CompilationUnit result = this.ast.newCompilationUnit();

    add(result.types(), this.<TypeDeclaration> build(ctx.classDefinition()));

    return result;
  }

  @Override
  public BooleanLiteral visitFalseLiteral(final StaticJavaV4Parser.FalseLiteralContext ctx) {
    return this.ast.newBooleanLiteral(false);
  }

  @Override
  public FieldDeclaration visitFieldDeclaration(
      final StaticJavaV4Parser.FieldDeclarationContext ctx) {
    final VariableDeclarationFragment vdf = this.ast
        .newVariableDeclarationFragment();
    final FieldDeclaration result = this.ast.newFieldDeclaration(vdf);
    add(
        result.modifiers(),
        this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

    result.setType(this.build(ctx.type()));

    vdf.setName(this.ast.newSimpleName(ctx.ID().getText()));

    return result;
  }

  @Override
  public SimpleName visitIdExp(final StaticJavaV4Parser.IdExpContext ctx) {
    return this.ast.newSimpleName(ctx.ID().getText());
  }

  @Override
  public IfStatement visitIfStatement(final StaticJavaV4Parser.IfStatementContext ctx) {
    final IfStatement result = this.ast.newIfStatement();
    final Block thenBlock = this.ast.newBlock();
    result.setThenStatement(thenBlock);
    final Block elseBlock = this.ast.newBlock();
    result.setElseStatement(elseBlock);

    result.setExpression(this.build(ctx.exp()));

    final List<StaticJavaV4Parser.StatementContext> ts = ctx.ts;
    if (ts != null) {
      builds(thenBlock.statements(), ts);
    }

    final List<StaticJavaV4Parser.StatementContext> fs = ctx.fs;
    if (fs != null) {
      builds(elseBlock.statements(), fs);
    }

    return result;
  }

  @Override
  public NumberLiteral visitIntLiteral(final StaticJavaV4Parser.IntLiteralContext ctx) {
    final NumberLiteral result = this.ast.newNumberLiteral();
    result.setToken(ctx.getText());
    return result;
  }

  @Override
  public PrimitiveType visitIntType(final StaticJavaV4Parser.IntTypeContext ctx) {
    return this.ast.newPrimitiveType(PrimitiveType.INT);
  }

  @Override
  public MethodInvocation visitInvoke(final StaticJavaV4Parser.InvokeContext ctx) {
    final MethodInvocation result = this.ast.newMethodInvocation();

    if (ctx.id1 != null) {
      result.setExpression(this.ast.newSimpleName(ctx.id1.getText()));
    }

    result.setName(this.ast.newSimpleName(ctx.id2.getText()));

    final StaticJavaV4Parser.ArgsContext args = ctx.args();
    if (args != null) {
      builds(result.arguments(), args.exp());
    }

    return result;
  }

  @Override
  public MethodInvocation visitInvokeExp(final StaticJavaV4Parser.InvokeExpContext ctx) {
    return this.build(ctx.invoke());
  }

  @Override
  public ExpressionStatement visitInvokeExpStatement(
      final StaticJavaV4Parser.InvokeExpStatementContext ctx) {
    return this.ast.newExpressionStatement(this.<MethodInvocation> build(ctx
        .invoke()));
  }

  @Override
  public VariableDeclarationStatement visitLocalDeclaration(
      final StaticJavaV4Parser.LocalDeclarationContext ctx) {
    final VariableDeclarationFragment vdf = this.ast
        .newVariableDeclarationFragment();
    final VariableDeclarationStatement result = this.ast
        .newVariableDeclarationStatement(vdf);

    result.setType(this.build(ctx.type()));

    vdf.setName(this.ast.newSimpleName(ctx.ID().getText()));

    return result;
  }

  @Override
  public MethodDeclaration visitMainMethodDeclaration(
      final StaticJavaV4Parser.MainMethodDeclarationContext ctx) {
    final MethodDeclaration result = this.ast.newMethodDeclaration();
    add(
        result.modifiers(),
        this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
    add(
        result.modifiers(),
        this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
    result.setReturnType2(this.ast.newPrimitiveType(PrimitiveType.VOID));
    result.setName(this.ast.newSimpleName("main"));

    final SingleVariableDeclaration svd = this.ast
        .newSingleVariableDeclaration();
    svd.setType(this.ast.newArrayType(this.ast.newSimpleType(this.ast
        .newSimpleName("String"))));
    svd.setName(this.ast.newSimpleName(ctx.id3.getText()));
    add(result.parameters(), svd);

    result.setBody(this.build(ctx.methodBody()));

    return result;
  }

  @Override
  public Block visitMethodBody(final StaticJavaV4Parser.MethodBodyContext ctx) {
    final Block result = this.ast.newBlock();

    final List<StaticJavaV4Parser.LocalDeclarationContext> localDeclarations = ctx
        .localDeclaration();
    if (localDeclarations != null) {
      builds(result.statements(), localDeclarations);
    }

    final List<StaticJavaV4Parser.StatementContext> statements = ctx.statement();
    if (statements != null) {
      builds(result.statements(), statements);
    }

    return result;
  }

  @Override
  public MethodDeclaration visitMethodDeclaration(
      final StaticJavaV4Parser.MethodDeclarationContext ctx) {
    final MethodDeclaration result = this.ast.newMethodDeclaration();
    add(
        result.modifiers(),
        this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

    result.setReturnType2(this.build(ctx.returnType()));

    result.setName(this.ast.newSimpleName(ctx.ID().getText()));

    final StaticJavaV4Parser.ParamsContext params = ctx.params();
    if (params != null) {
      builds(result.parameters(), params.param());
    }

    result.setBody(this.build(ctx.methodBody()));

    return result;
  }

  @Override
  public Type visitNonVoidReturnType(final StaticJavaV4Parser.NonVoidReturnTypeContext ctx) {
    return this.build(ctx.type());
  }

  @Override
  public NullLiteral visitNullLiteral(final StaticJavaV4Parser.NullLiteralContext ctx) {
    return this.ast.newNullLiteral();
  }

  @Override
  public SingleVariableDeclaration visitParam(final StaticJavaV4Parser.ParamContext ctx) {
    final SingleVariableDeclaration result = this.ast
        .newSingleVariableDeclaration();

    result.setType(this.build(ctx.type()));

    result.setName(this.ast.newSimpleName(ctx.ID().getText()));

    return result;
  }

  @Override
  public ParenthesizedExpression visitParenExp(final StaticJavaV4Parser.ParenExpContext ctx) {
    final ParenthesizedExpression result = this.ast
        .newParenthesizedExpression();

    result.setExpression(this.build(ctx.exp()));

    return result;
  }

  @Override
  public ReturnStatement visitReturnStatement(final StaticJavaV4Parser.ReturnStatementContext ctx) {
    final ReturnStatement result = this.ast.newReturnStatement();

    final StaticJavaV4Parser.ExpContext exp = ctx.exp();
    if (exp != null) {
      result.setExpression(this.build(exp));
    }

    return result;
  }

  @Override
  public BooleanLiteral visitTrueLiteral(final StaticJavaV4Parser.TrueLiteralContext ctx) {
    return this.ast.newBooleanLiteral(true);
  }

  @Override
  public PrefixExpression visitUnaryExp(final StaticJavaV4Parser.UnaryExpContext ctx) {
    final PrefixExpression result = this.ast.newPrefixExpression();

    result.setOperator(StaticJavaASTBuilder.unopMap.get(ctx.op.getText()));

    result.setOperand(this.build(ctx.exp()));

    return result;
  }

  @Override
  public PrimitiveType visitVoidType(final StaticJavaV4Parser.VoidTypeContext ctx) {
    return this.ast.newPrimitiveType(PrimitiveType.VOID);
  }

  @Override
  public WhileStatement visitWhileStatement(final StaticJavaV4Parser.WhileStatementContext ctx) {
    final WhileStatement result = this.ast.newWhileStatement();
    final Block whileBody = this.ast.newBlock();
    result.setBody(whileBody);

    result.setExpression(this.build(ctx.exp()));

    final List<StaticJavaV4Parser.StatementContext> statements = ctx.statement();
    if (statements != null) {
      builds(whileBody.statements(), statements);
    }

    return result;
  }
}
