package com.gl.javafsd.tree_project.check;

import java.util.LinkedHashSet;
import java.util.Set;

import com.gl.javafsd.tree_project.build.BstCreation;
import com.gl.javafsd.tree_project.build.Node;

public class BstNodePairFinder {

	private BstCreation tree;
	private int sum;
	private boolean matchingNodesIdentified = false;

	public BstNodePairFinder(BstCreation tree, int sum) {

		this.tree = tree;
		this.sum = sum;
	}

	public void findPairOfNodes() {

		Set<Integer> data = new LinkedHashSet<>();

		findPairOfNodes(tree.getRoot(), data);

		if (!matchingNodesIdentified) {
			System.out.printf("For the given sum %s, Matching Nodes NOT Found", sum);
		}
	}

	boolean findPairOfNodes(Node node, Set<Integer> data) {

		if (node == null) {
			return false;
		}

		boolean result = findPairOfNodes(node.getLeft(), data);
		if (result) {
			return true;
		}

		int difference = sum - node.getData();

		System.out.printf("Difference value is %d for the node %d %n", difference, node.getData());
		if (data.contains(difference)) {

			System.out.printf("For the give sum %d, the matching nodes are %d and %d %n", sum, node.getData(),
					difference);
			matchingNodesIdentified = true;

			return matchingNodesIdentified;
		} else {

			data.add(node.getData());
			System.out.printf("Adding the node %d to the collection [%s] %n", node.getData(), data);
			;
		}

		if (!matchingNodesIdentified) {

			result = findPairOfNodes(node.getRight(), data);
			return result;
		} else {
			return true;
		}

	}

}
