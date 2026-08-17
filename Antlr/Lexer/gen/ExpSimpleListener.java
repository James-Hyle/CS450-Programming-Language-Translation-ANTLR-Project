// Generated from /Users/jameshyle/Documents/Boise_State/BSU_Spring_2026/cs450/Antlr/Lexer/src/ExpSimple.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpSimpleParser}.
 */
public interface ExpSimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpSimpleParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ExpSimpleParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpSimpleParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ExpSimpleParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link ExpSimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenExp(ExpSimpleParser.ParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link ExpSimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenExp(ExpSimpleParser.ParenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link ExpSimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(ExpSimpleParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link ExpSimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(ExpSimpleParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryOp}
	 * labeled alternative in {@link ExpSimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(ExpSimpleParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryOp}
	 * labeled alternative in {@link ExpSimpleParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(ExpSimpleParser.BinaryOpContext ctx);
}