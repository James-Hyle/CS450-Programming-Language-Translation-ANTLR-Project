// Generated from /Users/jameshyle/Documents/Boise_State/BSU_Spring_2026/cs450/ProjectMilestone4/src/esjc/parser/ExtendedStaticJava.g4 by ANTLR 4.13.2
package esjc.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtendedStaticJavaParser}.
 */
public interface ExtendedStaticJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ExtendedStaticJavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ExtendedStaticJavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(ExtendedStaticJavaParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(ExtendedStaticJavaParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(ExtendedStaticJavaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(ExtendedStaticJavaParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CustomClassDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#simpleClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCustomClassDeclaration(ExtendedStaticJavaParser.CustomClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CustomClassDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#simpleClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCustomClassDeclaration(ExtendedStaticJavaParser.CustomClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainMethodDeclaration(ExtendedStaticJavaParser.MainMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainMethodDeclaration(ExtendedStaticJavaParser.MainMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PublicDecLaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#publicFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPublicDecLaration(ExtendedStaticJavaParser.PublicDecLarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PublicDecLaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#publicFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPublicDecLaration(ExtendedStaticJavaParser.PublicDecLarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldDec}
	 * labeled alternative in {@link ExtendedStaticJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDec(ExtendedStaticJavaParser.FieldDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldDec}
	 * labeled alternative in {@link ExtendedStaticJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDec(ExtendedStaticJavaParser.FieldDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDec}
	 * labeled alternative in {@link ExtendedStaticJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDec(ExtendedStaticJavaParser.MethodDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDec}
	 * labeled alternative in {@link ExtendedStaticJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDec(ExtendedStaticJavaParser.MethodDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CustomType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterCustomType(ExtendedStaticJavaParser.CustomTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CustomType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitCustomType(ExtendedStaticJavaParser.CustomTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidReturn}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterVoidReturn(ExtendedStaticJavaParser.VoidReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidReturn}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitVoidReturn(ExtendedStaticJavaParser.VoidReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeReturn}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterTypeReturn(ExtendedStaticJavaParser.TypeReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeReturn}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitTypeReturn(ExtendedStaticJavaParser.TypeReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(ExtendedStaticJavaParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(ExtendedStaticJavaParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#basicType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(ExtendedStaticJavaParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#basicType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(ExtendedStaticJavaParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(ExtendedStaticJavaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(ExtendedStaticJavaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ExtendedStaticJavaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ExtendedStaticJavaParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(ExtendedStaticJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(ExtendedStaticJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalDeclaration(ExtendedStaticJavaParser.LocalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalDeclaration(ExtendedStaticJavaParser.LocalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(ExtendedStaticJavaParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(ExtendedStaticJavaParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(ExtendedStaticJavaParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(ExtendedStaticJavaParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(ExtendedStaticJavaParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(ExtendedStaticJavaParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvokeStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInvokeStmt(ExtendedStaticJavaParser.InvokeStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvokeStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInvokeStmt(ExtendedStaticJavaParser.InvokeStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RetStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRetStmt(ExtendedStaticJavaParser.RetStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RetStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRetStmt(ExtendedStaticJavaParser.RetStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(ExtendedStaticJavaParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(ExtendedStaticJavaParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStmt(ExtendedStaticJavaParser.DoWhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStmt(ExtendedStaticJavaParser.DoWhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncDecStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIncDecStmt(ExtendedStaticJavaParser.IncDecStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncDecStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIncDecStmt(ExtendedStaticJavaParser.IncDecStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#incDecStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncDecStatement(ExtendedStaticJavaParser.IncDecStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#incDecStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncDecStatement(ExtendedStaticJavaParser.IncDecStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#incDec}.
	 * @param ctx the parse tree
	 */
	void enterIncDec(ExtendedStaticJavaParser.IncDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#incDec}.
	 * @param ctx the parse tree
	 */
	void exitIncDec(ExtendedStaticJavaParser.IncDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(ExtendedStaticJavaParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(ExtendedStaticJavaParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(ExtendedStaticJavaParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(ExtendedStaticJavaParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ExtendedStaticJavaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ExtendedStaticJavaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(ExtendedStaticJavaParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(ExtendedStaticJavaParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#forInits}.
	 * @param ctx the parse tree
	 */
	void enterForInits(ExtendedStaticJavaParser.ForInitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#forInits}.
	 * @param ctx the parse tree
	 */
	void exitForInits(ExtendedStaticJavaParser.ForInitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(ExtendedStaticJavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(ExtendedStaticJavaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#forUpdates}.
	 * @param ctx the parse tree
	 */
	void enterForUpdates(ExtendedStaticJavaParser.ForUpdatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#forUpdates}.
	 * @param ctx the parse tree
	 */
	void exitForUpdates(ExtendedStaticJavaParser.ForUpdatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ExtendedStaticJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ExtendedStaticJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#invokeExpStatement}.
	 * @param ctx the parse tree
	 */
	void enterInvokeExpStatement(ExtendedStaticJavaParser.InvokeExpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#invokeExpStatement}.
	 * @param ctx the parse tree
	 */
	void exitInvokeExpStatement(ExtendedStaticJavaParser.InvokeExpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(ExtendedStaticJavaParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(ExtendedStaticJavaParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ExtendedStaticJavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ExtendedStaticJavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpArray}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNewExpArray(ExtendedStaticJavaParser.NewExpArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpArray}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNewExpArray(ExtendedStaticJavaParser.NewExpArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccessExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExp(ExtendedStaticJavaParser.ArrayAccessExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccessExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExp(ExtendedStaticJavaParser.ArrayAccessExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvokeExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInvokeExp(ExtendedStaticJavaParser.InvokeExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvokeExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInvokeExp(ExtendedStaticJavaParser.InvokeExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExp(ExtendedStaticJavaParser.BinaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExp(ExtendedStaticJavaParser.BinaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteral(ExtendedStaticJavaParser.FalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteral(ExtendedStaticJavaParser.FalseLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIdExp(ExtendedStaticJavaParser.IdExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIdExp(ExtendedStaticJavaParser.IdExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExp(ExtendedStaticJavaParser.TernaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExp(ExtendedStaticJavaParser.TernaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteral(ExtendedStaticJavaParser.TrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteral(ExtendedStaticJavaParser.TrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewArrayInit}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNewArrayInit(ExtendedStaticJavaParser.NewArrayInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewArrayInit}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNewArrayInit(ExtendedStaticJavaParser.NewArrayInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenExp(ExtendedStaticJavaParser.ParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenExp(ExtendedStaticJavaParser.ParenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(ExtendedStaticJavaParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(ExtendedStaticJavaParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(ExtendedStaticJavaParser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(ExtendedStaticJavaParser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldAccess}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(ExtendedStaticJavaParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldAccess}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(ExtendedStaticJavaParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(ExtendedStaticJavaParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(ExtendedStaticJavaParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNewExp(ExtendedStaticJavaParser.NewExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNewExp(ExtendedStaticJavaParser.NewExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#invoke}.
	 * @param ctx the parse tree
	 */
	void enterInvoke(ExtendedStaticJavaParser.InvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#invoke}.
	 * @param ctx the parse tree
	 */
	void exitInvoke(ExtendedStaticJavaParser.InvokeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayInitilizationStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitilizationStatement(ExtendedStaticJavaParser.ArrayInitilizationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayInitilizationStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitilizationStatement(ExtendedStaticJavaParser.ArrayInitilizationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExtendedStaticJavaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(ExtendedStaticJavaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExtendedStaticJavaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(ExtendedStaticJavaParser.ArgsContext ctx);
}