package com.xjtu.mvccalc.service;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	public String clac(String input) {
		CharStream in = CharStreams.fromString(input);
		CalcLexer lexer = new CalcLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CalcParser parser = new CalcParser(tokens);
		ParseTree tree = parser.prog();
		EvalVisitor eval = new EvalVisitor();
		if (eval.visit(tree).equals("∞") || eval.visit(tree).equals("-∞")) {
			return "除数不能为0，请重新输入。";
		} else {
			return eval.visit(tree);
		}
	}


}
