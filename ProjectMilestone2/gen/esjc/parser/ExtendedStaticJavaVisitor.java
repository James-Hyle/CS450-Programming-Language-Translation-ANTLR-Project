// Generated from /Users/jameshyle/Documents/Boise_State/BSU_Spring_2026/cs450/ProjectMilestone2/src/esjc/parser/ExtendedStaticJava.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by the {@code EntryPoint}
	 * labeled alternative in {@link ExtendedStaticJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryPoint(ExtendedStaticJavaParser.EntryPointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ExtendedStaticJavaParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CustomClassDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#simpleClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomClassDeclaration(ExtendedStaticJavaParser.CustomClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PublicDecLaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#publicFieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicDecLaration(ExtendedStaticJavaParser.PublicDecLarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldMemberDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldMemberDeclaration(ExtendedStaticJavaParser.FieldMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodMemberDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodMemberDeclaration(ExtendedStaticJavaParser.MethodMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MainStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStatement(ExtendedStaticJavaParser.MainStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassFieldDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassFieldDeclaration(ExtendedStaticJavaParser.ClassFieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDec}
	 * labeled alternative in {@link ExtendedStaticJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDec(ExtendedStaticJavaParser.MethodDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeDec}
	 * labeled alternative in {@link ExtendedStaticJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDec(ExtendedStaticJavaParser.TypeDecContext ctx);
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
	 * Visit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(ExtendedStaticJavaParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonVoidReturnType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonVoidReturnType(ExtendedStaticJavaParser.NonVoidReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link ExtendedStaticJavaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(ExtendedStaticJavaParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parameter}
	 * labeled alternative in {@link ExtendedStaticJavaParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ExtendedStaticJavaParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Method}
	 * labeled alternative in {@link ExtendedStaticJavaParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(ExtendedStaticJavaParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#localDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ExtendedStaticJavaParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentState(ExtendedStaticJavaParser.AssignmentStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfState(ExtendedStaticJavaParser.IfStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileState(ExtendedStaticJavaParser.WhileStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvocationState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocationState(ExtendedStaticJavaParser.InvocationStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnState(ExtendedStaticJavaParser.ReturnStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForState(ExtendedStaticJavaParser.ForStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileState(ExtendedStaticJavaParser.DoWhileStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncDecState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecState(ExtendedStaticJavaParser.IncDecStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncDecDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#incDecStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecDeclaration(ExtendedStaticJavaParser.IncDecDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link ExtendedStaticJavaParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ExtendedStaticJavaParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignOperator}
	 * labeled alternative in {@link ExtendedStaticJavaParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOperator(ExtendedStaticJavaParser.AssignOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncDecOperator}
	 * labeled alternative in {@link ExtendedStaticJavaParser#incDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecOperator(ExtendedStaticJavaParser.IncDecOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LhsState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhsState(ExtendedStaticJavaParser.LhsStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AccessState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessState(ExtendedStaticJavaParser.AccessStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessState(ExtendedStaticJavaParser.ArrayAccessStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDeclaration(ExtendedStaticJavaParser.IfDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileDeclaration(ExtendedStaticJavaParser.WhileDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(ExtendedStaticJavaParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInitStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#forInits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInitStatement(ExtendedStaticJavaParser.ForInitStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdateStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#forUpdates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdateStatement(ExtendedStaticJavaParser.ForUpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InvokeDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#invokeExpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeDeclaration(ExtendedStaticJavaParser.InvokeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileDeclaration(ExtendedStaticJavaParser.DoWhileDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnDeclaration(ExtendedStaticJavaParser.ReturnDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code New}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(ExtendedStaticJavaParser.NewContext ctx);
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
	 * Visit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(ExtendedStaticJavaParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteral(ExtendedStaticJavaParser.TrueLiteralContext ctx);
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
	 * Visit a parse tree produced by the {@code InvokeStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#invoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeStatement(ExtendedStaticJavaParser.InvokeStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayInitilizationStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#arrayInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitilizationStatement(ExtendedStaticJavaParser.ArrayInitilizationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgStatement(ExtendedStaticJavaParser.ArgStatementContext ctx);
}