package com.gl.javafsd.balanceing_brackets.test;

import com.gl.javafsd.balanceing_brackets.collection.BalancedBracketPair;

public class BalancedBracketPairTest {

	public static void main(String[] args) {

		BalancedBracketPair pair1 = new BalancedBracketPair('[', ']');

		BalancedBracketPair pair2 = new BalancedBracketPair('{', '}');

		BalancedBracketPair pair3 = new BalancedBracketPair('(', ')');

		System.out.println("Open Squre Bracket--->" + pair1.getOpenBracket());
		System.out.println("Close Squre Bracket--->" + pair1.getCloseBracket());

		System.out.println("Open Curly Brace--->" + pair2.getOpenBracket());
		System.out.println("Close Curly Brace--->" + pair2.getCloseBracket());

		System.out.println("Open Function Bracket--->" + pair3.getOpenBracket());
		System.out.println("Close Function Bracket--->" + pair3.getCloseBracket());
	}

}
