package src.parse;
// Generated from JSON.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSONVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(JSONParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fullObject}
	 * labeled alternative in {@link JSONParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullObject(JSONParser.FullObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyObject}
	 * labeled alternative in {@link JSONParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyObject(JSONParser.EmptyObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(JSONParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fullArray}
	 * labeled alternative in {@link JSONParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullArray(JSONParser.FullArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyArray}
	 * labeled alternative in {@link JSONParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyArray(JSONParser.EmptyArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plain}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlain(JSONParser.PlainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueObject}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueObject(JSONParser.ValueObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueArray}
	 * labeled alternative in {@link JSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueArray(JSONParser.ValueArrayContext ctx);
}