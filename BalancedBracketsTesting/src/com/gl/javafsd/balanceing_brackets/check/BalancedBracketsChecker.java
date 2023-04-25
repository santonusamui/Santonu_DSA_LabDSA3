package com.gl.javafsd.balanceing_brackets.check;

import java.util.Set;
import java.util.Stack;

import com.gl.javafsd.balanceing_brackets.collection.BracketsCollection;

public class BalancedBracketsChecker {

	private String expression;

	public BalancedBracketsChecker(String expression) {

		this.expression = expression;
	}

	public boolean check() {

		// By the help of the Expression length we can quick check

		// if (expression.length() % 2 != 0) {
		//
		// System.out.println("Quick Check -> Expression is not balanced..");
		// return false;
		// }

		BracketsCollection segregatedCollection = new BracketsCollection();
		segregatedCollection.maintainAllValidBalancedBrackets();

		Set<Character> allOpenBrackets = segregatedCollection.getAllOpenBrackets();
		Set<Character> allClosedBrackets = segregatedCollection.getAllCloseBrackets();

		boolean balancedExpression = true;

		Stack<Character> stack = new Stack<>();

		// [{}]
		for (int index = 0; index < expression.length(); index++) {

			char visitedChar = expression.charAt(index);

			// Ignoring blank Space

			if (visitedChar == ' ') {

				continue;

			}
			// C1

			if (allOpenBrackets.contains(visitedChar)) {

				// Open Brackets - [ { (

				stack.push(visitedChar);

			} else if (allClosedBrackets.contains(visitedChar)) {

				// Closed bracket char--)}]
				Character poppedItem = null;

				// Stack check
				if (!stack.isEmpty()) {
					// C2
					poppedItem = stack.pop();
				}

				else {
					balancedExpression = false;
					return balancedExpression;
				}
				

				// C3
				Character openBracket = segregatedCollection.getOpenBracket(visitedChar);

				if (poppedItem.equals(openBracket)) {

					// Match scenario
				} else {

					// No Match Scenario
					balancedExpression = false;
					break;
				}
			} else {

				balancedExpression = false;
				break;
			}
			
		}

		return balancedExpression;
	}

}
