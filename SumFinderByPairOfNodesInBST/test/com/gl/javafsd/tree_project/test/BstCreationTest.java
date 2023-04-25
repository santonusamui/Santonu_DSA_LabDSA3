package com.gl.javafsd.tree_project.test;

import com.gl.javafsd.tree_project.build.BstCreation;

public class BstCreationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BstCreation tree = new BstCreation();

		// tree.insert(70);
		// tree.insert(50);
		// tree.insert(90);
		// tree.insert(30);
		// tree.insert(60);
		// tree.insert(80);
		// tree.insert(100);
		// tree.insert(20);
		// tree.insert(40);
		// tree.insert(90);

		tree.insert(51);
		tree.insert(16);
		tree.insert(63);
		tree.insert(6);
		tree.insert(25);
		tree.insert(59);
		tree.insert(92);
		tree.insert(4);
		tree.insert(9);
		tree.insert(21);
		tree.insert(38);
		tree.insert(61);
		// tree.insert(29);
		// tree.insert(19);
		// tree.insert(38);
		// tree.insert(9);
		// tree.insert(24);
		// tree.insert(34);
		// tree.insert(41);
		// tree.insert(14);
		// tree.insert(22);

		// System.out.printf("The Inorder representation of the BST:%n");
		// tree.inorder(tree.getRoot());

		// System.out.printf("The Preorder representation of the BST:%n");
		// tree.preorder(tree.getRoot());

		System.out.printf("The Postorder representation of the BST:%n");
		tree.postorder(tree.getRoot());

	}

}
