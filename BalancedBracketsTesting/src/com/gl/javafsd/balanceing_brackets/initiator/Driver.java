package com.gl.javafsd.balanceing_brackets.initiator;

import java.util.Scanner;

import com.gl.javafsd.balanceing_brackets.check.BalancedBracketsChecker;

public class Driver {

	public static void main(String[] args) {

		// String expression = "( ()[ { } ] )";

		System.out.println("Enter a Bracket expression:");
		Scanner scan = new Scanner(System.in);
		String expression = scan.nextLine();

		BalancedBracketsChecker checker = new BalancedBracketsChecker(expression);

		boolean result = checker.check();
		if (result) {
			System.out.printf("Expression %s is Balanced", expression);
		} else {
			System.out.printf("Expression %s is NOT Balanced", expression);
		}

	}

}
