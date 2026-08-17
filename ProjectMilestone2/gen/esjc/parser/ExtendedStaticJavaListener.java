// Generated from /Users/jameshyle/Documents/Boise_State/BSU_Spring_2026/cs450/ProjectMilestone2/src/esjc/parser/ExtendedStaticJava.g4 by ANTLR 4.13.2
package esjc.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExtendedStaticJavaParser}.
 */
public interface ExtendedStaticJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code EntryPoint}
	 * labeled alternative in {@link ExtendedStaticJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterEntryPoint(ExtendedStaticJavaParser.EntryPointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EntryPoint}
	 * labeled alternative in {@link ExtendedStaticJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitEntryPoint(ExtendedStaticJavaParser.EntryPointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ExtendedStaticJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ExtendedStaticJavaParser.ClassDeclarationContext ctx);
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
	 * Enter a parse tree produced by the {@code FieldMemberDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldMemberDeclaration(ExtendedStaticJavaParser.FieldMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldMemberDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldMemberDeclaration(ExtendedStaticJavaParser.FieldMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodMemberDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodMemberDeclaration(ExtendedStaticJavaParser.MethodMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodMemberDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodMemberDeclaration(ExtendedStaticJavaParser.MethodMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MainStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainStatement(ExtendedStaticJavaParser.MainStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MainStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainStatement(ExtendedStaticJavaParser.MainStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassFieldDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassFieldDeclaration(ExtendedStaticJavaParser.ClassFieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassFieldDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassFieldDeclaration(ExtendedStaticJavaParser.ClassFieldDeclarationContext ctx);
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
	 * Enter a parse tree produced by the {@code TypeDec}
	 * labeled alternative in {@link ExtendedStaticJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeDec(ExtendedStaticJavaParser.TypeDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeDec}
	 * labeled alternative in {@link ExtendedStaticJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeDec(ExtendedStaticJavaParser.TypeDecContext ctx);
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
	 * Enter a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(ExtendedStaticJavaParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(ExtendedStaticJavaParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonVoidReturnType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterNonVoidReturnType(ExtendedStaticJavaParser.NonVoidReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonVoidReturnType}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitNonVoidReturnType(ExtendedStaticJavaParser.NonVoidReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link ExtendedStaticJavaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParamList(ExtendedStaticJavaParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamList}
	 * labeled alternative in {@link ExtendedStaticJavaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParamList(ExtendedStaticJavaParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parameter}
	 * labeled alternative in {@link ExtendedStaticJavaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ExtendedStaticJavaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parameter}
	 * labeled alternative in {@link ExtendedStaticJavaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ExtendedStaticJavaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Method}
	 * labeled alternative in {@link ExtendedStaticJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethod(ExtendedStaticJavaParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Method}
	 * labeled alternative in {@link ExtendedStaticJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethod(ExtendedStaticJavaParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ExtendedStaticJavaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#localDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ExtendedStaticJavaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentState(ExtendedStaticJavaParser.AssignmentStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentState(ExtendedStaticJavaParser.AssignmentStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfState(ExtendedStaticJavaParser.IfStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfState(ExtendedStaticJavaParser.IfStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileState(ExtendedStaticJavaParser.WhileStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileState(ExtendedStaticJavaParser.WhileStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvocationState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInvocationState(ExtendedStaticJavaParser.InvocationStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvocationState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInvocationState(ExtendedStaticJavaParser.InvocationStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnState(ExtendedStaticJavaParser.ReturnStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnState(ExtendedStaticJavaParser.ReturnStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForState(ExtendedStaticJavaParser.ForStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForState(ExtendedStaticJavaParser.ForStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileState(ExtendedStaticJavaParser.DoWhileStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileState(ExtendedStaticJavaParser.DoWhileStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncDecState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIncDecState(ExtendedStaticJavaParser.IncDecStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncDecState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIncDecState(ExtendedStaticJavaParser.IncDecStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncDecDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#incDecStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncDecDeclaration(ExtendedStaticJavaParser.IncDecDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncDecDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#incDecStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncDecDeclaration(ExtendedStaticJavaParser.IncDecDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link ExtendedStaticJavaParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ExtendedStaticJavaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link ExtendedStaticJavaParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ExtendedStaticJavaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignOperator}
	 * labeled alternative in {@link ExtendedStaticJavaParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignOperator(ExtendedStaticJavaParser.AssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignOperator}
	 * labeled alternative in {@link ExtendedStaticJavaParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignOperator(ExtendedStaticJavaParser.AssignOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncDecOperator}
	 * labeled alternative in {@link ExtendedStaticJavaParser#incDec}.
	 * @param ctx the parse tree
	 */
	void enterIncDecOperator(ExtendedStaticJavaParser.IncDecOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncDecOperator}
	 * labeled alternative in {@link ExtendedStaticJavaParser#incDec}.
	 * @param ctx the parse tree
	 */
	void exitIncDecOperator(ExtendedStaticJavaParser.IncDecOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LhsState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhsState(ExtendedStaticJavaParser.LhsStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LhsState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhsState(ExtendedStaticJavaParser.LhsStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AccessState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterAccessState(ExtendedStaticJavaParser.AccessStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AccessState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitAccessState(ExtendedStaticJavaParser.AccessStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccessState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessState(ExtendedStaticJavaParser.ArrayAccessStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccessState}
	 * labeled alternative in {@link ExtendedStaticJavaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessState(ExtendedStaticJavaParser.ArrayAccessStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfDeclaration(ExtendedStaticJavaParser.IfDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfDeclaration(ExtendedStaticJavaParser.IfDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileDeclaration(ExtendedStaticJavaParser.WhileDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileDeclaration(ExtendedStaticJavaParser.WhileDeclarationContext ctx);
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
	 * Enter a parse tree produced by the {@code ForInitStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#forInits}.
	 * @param ctx the parse tree
	 */
	void enterForInitStatement(ExtendedStaticJavaParser.ForInitStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInitStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#forInits}.
	 * @param ctx the parse tree
	 */
	void exitForInitStatement(ExtendedStaticJavaParser.ForInitStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#forUpdates}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateStatement(ExtendedStaticJavaParser.ForUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#forUpdates}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateStatement(ExtendedStaticJavaParser.ForUpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InvokeDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#invokeExpStatement}.
	 * @param ctx the parse tree
	 */
	void enterInvokeDeclaration(ExtendedStaticJavaParser.InvokeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvokeDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#invokeExpStatement}.
	 * @param ctx the parse tree
	 */
	void exitInvokeDeclaration(ExtendedStaticJavaParser.InvokeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileDeclaration(ExtendedStaticJavaParser.DoWhileDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileDeclaration(ExtendedStaticJavaParser.DoWhileDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnDeclaration(ExtendedStaticJavaParser.ReturnDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnDeclaration}
	 * labeled alternative in {@link ExtendedStaticJavaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnDeclaration(ExtendedStaticJavaParser.ReturnDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code New}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNew(ExtendedStaticJavaParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code New}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNew(ExtendedStaticJavaParser.NewContext ctx);
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
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(ExtendedStaticJavaParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link ExtendedStaticJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(ExtendedStaticJavaParser.ArrayAccessContext ctx);
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
	 * Enter a parse tree produced by the {@code InvokeStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#invoke}.
	 * @param ctx the parse tree
	 */
	void enterInvokeStatement(ExtendedStaticJavaParser.InvokeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InvokeStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#invoke}.
	 * @param ctx the parse tree
	 */
	void exitInvokeStatement(ExtendedStaticJavaParser.InvokeStatementContext ctx);
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
	 * Enter a parse tree produced by the {@code ArgStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgStatement(ExtendedStaticJavaParser.ArgStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgStatement}
	 * labeled alternative in {@link ExtendedStaticJavaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgStatement(ExtendedStaticJavaParser.ArgStatementContext ctx);
}