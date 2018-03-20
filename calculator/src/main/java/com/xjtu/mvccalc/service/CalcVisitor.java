package com.xjtu.mvccalc.service;
// Generated from Calc.g4 by ANTLR 4.4

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T>
 *            The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code number} labeled alternative in
	 * {@link CalcParser#expr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CalcParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by the {@code parens} labeled alternative in
	 * {@link CalcParser#expr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitParens(CalcParser.ParensContext ctx);

	/**
	 * Visit a parse tree produced by the {@code MulDiv} labeled alternative in
	 * {@link CalcParser#expr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(CalcParser.MulDivContext ctx);

	/**
	 * Visit a parse tree produced by the {@code AddSub} labeled alternative in
	 * {@link CalcParser#expr}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(CalcParser.AddSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link CalcParser#prog}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitProg(CalcParser.ProgContext ctx);

	/**
	 * Visit a parse tree produced by the {@code printExpr} labeled alternative
	 * in {@link CalcParser#stat}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(CalcParser.PrintExprContext ctx);
}