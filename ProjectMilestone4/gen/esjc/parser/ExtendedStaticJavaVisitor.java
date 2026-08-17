// Generated from /Users/jameshyle/Documents/Boise_State/BSU_Spring_2026/cs450/ProjectMilestone4/src/esjc/parser/ExtendedStaticJava.g4 by ANTLR 4.13.2
package esjc.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExtendedStaticJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExtendedStaticJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(ExtendedStaticJavaParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(ExtendedStaticJavaParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(ExtendedStaticJavaParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CustomClassDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#simpleClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomClassDeclaration(ExtendedStaticJavaParser.CustomClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethodDeclaration(ExtendedStaticJavaParser.MainMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PublicDecLaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#publicFieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicDecLaration(ExtendedStaticJavaParser.PublicDecLarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldDec}
	 * labeled alternative in {@link ExtendedStaticJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDec(ExtendedStaticJavaParser.FieldDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDec}
	 * labeled alternative in {@link ExtendedStaticJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDec(ExtendedStaticJavaParser.MethodDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CustomType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomType(ExtendedStaticJavaParser.CustomTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidReturn}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidReturn(ExtendedStaticJavaParser.VoidReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeReturn}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReturn(ExtendedStaticJavaParser.TypeReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(ExtendedStaticJavaParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(ExtendedStaticJavaParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(ExtendedStaticJavaParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ExtendedStaticJavaParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(ExtendedStaticJavaParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#localDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDeclaration(ExtendedStaticJavaParser.LocalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(ExtendedStaticJavaParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(ExtendedStaticJavaParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(ExtendedStaticJavaParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvokeStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeStmt(ExtendedStaticJavaParser.InvokeStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RetStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetStmt(ExtendedStaticJavaParser.RetStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(ExtendedStaticJavaParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStmt(ExtendedStaticJavaParser.DoWhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncDecStmt}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecStmt(ExtendedStaticJavaParser.IncDecStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#incDecStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecStatement(ExtendedStaticJavaParser.IncDecStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#incDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDec(ExtendedStaticJavaParser.IncDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(ExtendedStaticJavaParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(ExtendedStaticJavaParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ExtendedStaticJavaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(ExtendedStaticJavaParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#forInits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInits(ExtendedStaticJavaParser.ForInitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(ExtendedStaticJavaParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#forUpdates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdates(ExtendedStaticJavaParser.ForUpdatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ExtendedStaticJavaParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#invokeExpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeExpStatement(ExtendedStaticJavaParser.InvokeExpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(ExtendedStaticJavaParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ExtendedStaticJavaParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExpArray}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpArray(ExtendedStaticJavaParser.NewExpArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExp(ExtendedStaticJavaParser.ArrayAccessExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvokeExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeExp(ExtendedStaticJavaParser.InvokeExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExp(ExtendedStaticJavaParser.BinaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteral(ExtendedStaticJavaParser.FalseLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExp(ExtendedStaticJavaParser.IdExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExp(ExtendedStaticJavaParser.TernaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteral(ExtendedStaticJavaParser.TrueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewArrayInit}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArrayInit(ExtendedStaticJavaParser.NewArrayInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(ExtendedStaticJavaParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(ExtendedStaticJavaParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(ExtendedStaticJavaParser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldAccess}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(ExtendedStaticJavaParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(ExtendedStaticJavaParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewExp}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExp(ExtendedStaticJavaParser.NewExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#invoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoke(ExtendedStaticJavaParser.InvokeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayInitilizationStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#arrayInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitilizationStatement(ExtendedStaticJavaParser.ArrayInitilizationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExtendedStaticJavaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(ExtendedStaticJavaParser.ArgsContext ctx);
}