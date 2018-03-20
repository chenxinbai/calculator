package com.xjtu.mvccalc.service;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends CalcBaseVisitor<String> {
	Map<String, String> memory = new HashMap<String, String>();

	// expr
	@Override
	public String visitPrintExpr(CalcParser.PrintExprContext ctx) {
		Double value = Double.parseDouble(visit(ctx.expr()));
		// 保留两位有数字的方法
		DecimalFormat df = new DecimalFormat("#.##");
		String s_value = df.format(value);
		return s_value;
	}

	// Number
	@Override
	public String visitNumber(CalcParser.NumberContext ctx) {
		int size = ctx.getChildCount();
		if (size == 2) {
			if (ctx.sign.getType() == CalcParser.SUB) {
				return "-" + ctx.getChild(1).getText();
			} else {
				return ctx.getChild(1).getText();
			}
		} else {
			return ctx.getChild(0).getText();
		}
	}

	// expr op=('*'|'/') expr
	@Override
	public String visitMulDiv(CalcParser.MulDivContext ctx) {
		Double left = Double.parseDouble(visit(ctx.expr(0)));
		Double right = Double.parseDouble(visit(ctx.expr(1)));
		if (ctx.op.getType() == CalcParser.MUL) {
			return String.valueOf(left * right);
		} else {
//			System.out.println(left / right);
			return String.valueOf(left / right);
		}
	}

	// expr op=('+'|'-') expr
	@Override
	public String visitAddSub(CalcParser.AddSubContext ctx) {
		Double left = Double.parseDouble(visit(ctx.expr(0)));
		Double right = Double.parseDouble(visit(ctx.expr(1)));
		if (ctx.op.getType() == CalcParser.ADD)
			return String.valueOf(left + right);
		return String.valueOf(left - right);
	}

	// '(' expr ')'
	@Override
	public String visitParens(CalcParser.ParensContext ctx) {
		return visit(ctx.expr());
	}

}
