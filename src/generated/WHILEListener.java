// Generated from /Users/hyeockjinkim/dev/MyProjects/CalculationANTLR/src/generated/WHILE.g4 by ANTLR 4.7
package generated;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WHILEParser}.
 */
public interface WHILEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WHILEParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WHILEParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WHILEParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WHILEParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WHILEParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(WHILEParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WHILEParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(WHILEParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WHILEParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(WHILEParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link WHILEParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(WHILEParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(WHILEParser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WHILEParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(WHILEParser.AexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WHILEParser#aexpr2}.
	 * @param ctx the parse tree
	 */
	void enterAexpr2(WHILEParser.Aexpr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link WHILEParser#aexpr2}.
	 * @param ctx the parse tree
	 */
	void exitAexpr2(WHILEParser.Aexpr2Context ctx);
}