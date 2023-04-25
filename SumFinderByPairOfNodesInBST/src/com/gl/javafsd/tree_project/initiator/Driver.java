package com.gl.javafsd.tree_project.initiator;

import com.gl.javafsd.tree_project.build.BstCreation;
import com.gl.javafsd.tree_project.check.BstNodePairFinder;

public class Driver {

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
		// tree.insert(80);
		// tree.insert(50);
		tree.insert(40);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(30);
		tree.insert(50);
		tree.insert(70);

		System.out.println();
		BstNodePairFinder finder = new BstNodePairFinder(tree, 130);
		finder.findPairOfNodes();

	}

}
