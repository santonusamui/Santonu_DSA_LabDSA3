package com.gl.javafsd.balanceing_brackets.test;

import com.gl.javafsd.balanceing_brackets.check.BalancedBracketsChecker;

public class BalancedBracketsCheckerTest {

	public static void main(String[] args) {

		String expression = "( ()[ { } ] )";

		BalancedBracketsChecker checker = new BalancedBracketsChecker(expression);

		boolean result = checker.check();
		if (result) {
			System.out.printf("Expression %s is Balanced", expression);
		} else {
			System.out.printf("Expression %s is NOT Balanced", expression);
		}

	}

}
