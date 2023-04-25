package com.gl.javafsd.tree_project.test;

import com.gl.javafsd.tree_project.build.BstCreation;
import com.gl.javafsd.tree_project.check.BstNodePairFinder;

public class BstNodePairFinderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BstCreation tree = new BstCreation();

		tree.insert(70);
		tree.insert(50);
		tree.insert(90);
		tree.insert(30);
		tree.insert(60);
		tree.insert(80);
		tree.insert(100);
		tree.insert(20);
		tree.insert(40);
		tree.insert(80);

		// tree.insert(29);
		// tree.insert(19);
		// tree.insert(38);
		// tree.insert(9);
		// tree.insert(24);
		// tree.insert(34);
		// tree.insert(41);
		// tree.insert(14);
		// tree.insert(22);

		System.out.println();
		BstNodePairFinder finder = new BstNodePairFinder(tree, 100);
		finder.findPairOfNodes();

	}

}
