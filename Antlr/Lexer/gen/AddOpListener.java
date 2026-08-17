// Generated from /Users/jameshyle/Documents/Boise_State/BSU_Spring_2026/cs450/Antlr/Lexer/src/AddOp.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AddOpParser}.
 */
public interface AddOpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AddOpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AddOpParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AddOpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AddOpParser.ExprContext ctx);
}