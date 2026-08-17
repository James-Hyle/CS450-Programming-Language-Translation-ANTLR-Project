// Generated from /Users/jameshyle/Documents/Boise_State/BSU_Spring_2026/cs450/Antlr/Lexer/src/ExpSimple.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpSimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpSimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpSimpleParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ExpSimpleParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link ExpSimpleParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(ExpSimpleParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link ExpSimpleParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(ExpSimpleParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryOp}
	 * labeled alternative in {@link ExpSimpleParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOp(ExpSimpleParser.BinaryOpContext ctx);
}