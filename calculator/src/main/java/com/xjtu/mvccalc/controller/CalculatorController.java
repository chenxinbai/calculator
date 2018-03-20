package com.xjtu.mvccalc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xjtu.mvccalc.service.CalculatorService;

@Controller
@RequestMapping("/home")
public class CalculatorController {

	@RequestMapping("/welcome")
	public String welc() {
		return "home";
	}

	@Autowired
	private CalculatorService calculatorservice;

	@RequestMapping("/calculator")
	public String calc(String input,ModelMap map) {
		String result = calculatorservice.clac(input);
		map.put("result", result);
		map.put("input", input);
		return "home";
	}
}
