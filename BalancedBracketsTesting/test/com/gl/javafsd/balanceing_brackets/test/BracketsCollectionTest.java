package com.gl.javafsd.balanceing_brackets.test;

import java.util.Set;

import com.gl.javafsd.balanceing_brackets.collection.BracketsCollection;

public class BracketsCollectionTest {

	public static void main(String[] args) {

		BracketsCollection segregatedCollection = new BracketsCollection();

		segregatedCollection.maintainAllValidBalancedBrackets();

		Set<Character> allOpenBrackets = segregatedCollection.getAllOpenBrackets();

		System.out.println("Open Brackets ---->");
		for (Character openBracket : allOpenBrackets) {
			System.out.println(openBracket);
		}
		
		System.out.println();

		Set<Character> allClosedBrackets = segregatedCollection.getAllCloseBrackets();
		System.out.println("Closed Brackets ---->");
		for (Character closedBracket : allClosedBrackets) {
			System.out.println(closedBracket);
		}

	}

}
