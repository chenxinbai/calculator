<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ANTLR计算器</title>
<!-- <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script> -->
<script type="text/javascript">
	function checkForm() {
		var num = document.getElementById("num").value.trim();
		if (num == "") {
			alert("输入不能为空,请重新输入!");
			return false;
		}
		var pattern1 = /[^0-9\.\+\-\*\/\(\)]/;
		if (pattern1.test(num)) {
			alert("字符串只能由半角数字、小数点、运算符和括号组成，请检查输入!");
			return false;
		}
		var pattern2 = /\)(\d|\.)/;
		if (pattern2.test(num)) {
			alert("不允许右括号后接数字或小数点，请检查输入!");
			return false;
		}
		var pattern3 = /[\+\-\*\/]([\+\-\*\/\)]|\.)/;
		if (pattern3.test(num)) {
			alert("不允许符号后面接符号或右括号或小数点，请检查输入!");
			return false;
		}
		var pattern4 = /\(([\*\/]|\.)/;
		if (pattern4.test(num)) {
			alert("不允许左括号后接运算符（正负号除外）和小数点，请检查输入!");
			return false;
		}
		var pattern5 = /(\d|\)|\.)\(/;
		if (pattern5.test(num)) {
			alert("不允许左括号前有数字或小数点或右括号，请检查输入!");
			return false;
		}
		var pattern6 = /^\d|\-|\+|\(/;
		if (!pattern6.test(num)) {
			alert("字符串开头必须是数字，正负号，左括号中的一个，请检查输入!");
			return false;
		}
		var pattern7 = /(\d|\.|\))$/;
		if (!pattern7.test(num)) {
			alert("结尾必须是数字或小数点或右括号，请检查输入!");
			return false;
		}
		var pattern8 = /^[0-9]+$/;
		for(i=1;i<num.split(".").length-1;i++)
			if (pattern8.test(num.split(".")[i])) {
				alert("不允许两个小数点之间全为数字，请检查输入!");
				return false;
			}
	}
</script>
</head>
<body>
	基于Spring MVC的ANTLR计算器
	<br>支持+、-、*、/和()运算，结果保留2位小数
	<%
	String result = (String) request.getAttribute("result");
	String input = (String) request.getAttribute("input");
%>
	<form name="form" action="<%=path%>/home/calculator" method="post"
		onsubmit="return checkForm()">
		<hr>
		<input id="num" size="64" name="input" type=text
			style="ime-mode: disabled"
			placeholder="请输入计算公式,例如:3.2*(1+4)-8/1.6"></input>
		<hr>
		<input type="submit" value="计算">
		<input type="reset" value="复位">
		<hr>
		${input}&nbsp;的计算结果是：${result}
	</form>
</body>
</html>