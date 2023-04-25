package com.gl.javafsd.tree_project.build;

public class BstCreation {

	private Node root;

	public BstCreation() {
		root = null;
	}

	public void insert(Integer data) {

		root = insert(root, data);
	}

	Node insert(Node root, Integer data) {

		if (root == null) {

			Node newNode = createNewNode(data);
			return newNode;
		} else if (data < root.getData()) {

			// Left Side
			Node newNode = insert(root.getLeft(), data);
			root.setLeft(newNode);

			return root;
		} else if (data > root.getData()) {

			// Right Side
			Node newNode = insert(root.getRight(), data);
			root.setRight(newNode);

			return root;
		} else {
			System.out.printf("Value %d already exists!!!%n", data);
			return root;
		}

	}

	Node createNewNode(Integer data) {

		// System.out.printf("New Node Creation %d %n", nodeValue);
		Node newNode = new Node(data);
		return newNode;
	}

	public Node getRoot() {
		return root;
	}

	public void inorder(Node root) {

		if (root == null)
			return;
		else {
			inorder(root.getLeft());
			System.out.print(root.getData() + " ");
			inorder(root.getRight());
		}
	}

	public void preorder(Node root) {

		if (root == null)
			return;
		else {
			System.out.print(root.getData() + " ");
			preorder(root.getLeft());
			preorder(root.getRight());
		}
	}

	public void postorder(Node root) {

		if (root == null)
			return;
		else {

			postorder(root.getLeft());
			postorder(root.getRight());
			System.out.print(root.getData() + " ");
		}
	}

}
