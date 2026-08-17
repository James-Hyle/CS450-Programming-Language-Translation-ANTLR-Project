// Generated from /Users/jameshyle/Documents/Boise_State/BSU_Spring_2026/cs450/Antlr/Lexer/src/Exp.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ExpParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(ExpParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentExp}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentExp(ExpParser.ParentExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link ExpParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExp(ExpParser.BinaryExpContext ctx);
}