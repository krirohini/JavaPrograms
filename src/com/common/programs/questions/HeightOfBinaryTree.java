/**
 * 
 */
package com.rohini.common.questions;

/**
 * @author rohini
 *
 */
public class HeightOfBinaryTree {

	/**
	 * @param args
	 */

	// Root node pointer. Will be null for an empty tree.
	private Node root;

	private static class Node {
		Node left;
		Node right;
		int data;

		Node(int newData) {
			left = null;
			right = null;
			data = newData;
		}
	}

	/**
	 * Creates an empty binary tree -- a null root pointer.
	 */
	public HeightOfBinaryTree() {
		root = null;
	}

	/**
	 * Inserts the given data into the binary tree. Uses a recursive helper.
	 */
	public void insert(int data) {
		root = insert(root, data);
	}

	/**
	 * Recursive insert -- given a node pointer, recur down and insert the given
	 * data into the tree. Returns the new node pointer (the standard way to
	 * communicate a changed pointer back to the caller).
	 */
	private Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		} else {
			if (data <= node.data) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
		}
		return (node); // in any case, return the new pointer to the caller
	}

	public static int heightOfTree(Node node) {
		if (node == null)
			return 0;

		/* compute the height/depth of each subtree */
		int leftHeight = heightOfTree(node.left);
		int rightHeight = heightOfTree(node.right);
		
		int height =  Math.max(leftHeight, rightHeight) ;
		return height+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node(28);
		root.left = new Node(7);
		root.right = new Node(10);
		root.left.left = new Node(53);
		root.left.right = new Node(15);
		root.right.right = new Node(36);
		
		System.out.println(heightOfTree(root));
	}

}
