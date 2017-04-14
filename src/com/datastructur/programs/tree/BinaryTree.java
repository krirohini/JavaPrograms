package com.datastructur.programs.tree;


public class BinaryTree {
	// Root node pointer. Will be null for an empty tree.
	private Node root;

	/*
	 * --Node-- The binary tree is built using this nested node class. Each node
	 * stores one data element, and has left and right sub-tree pointer which
	 * may be null. The node is a "dumb" nested class -- we just use it for
	 * storage; it does not have any methods.
	 */
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
	public BinaryTree() {
		root = null;
	}

	/**
	 * Returns true if the given target is in the binary tree. Uses a recursive
	 * helper.
	 */
	public boolean lookup(int data) {
		return (lookup(root, data));
	}

	/**
	 * Recursive lookup -- given a node, recur down searching for the given
	 * data.
	 */
	private boolean lookup(Node node, int data) {
		if (node == null) {
			return (false);
		}
		if (data == node.data) {
			return (true);
		} else if (data < node.data) {
			return (lookup(node.left, data));
		} else {
			return (lookup(node.right, data));
		}
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
	/**
	 * Build 123 by calling insert() three times. Note that the '2' must be
	 * inserted first.
	 */
	/**
	 * 1. Build123() Returns the number of nodes in the tree. Uses a recursive
	 * helper that recurs down the tree and counts the nodes.
	 */
	public void build123c() {
		root = null;
		root = insert(root, 2);
		root = insert(root, 1);
		root = insert(root, 3);
	}

	
	/**
	 * 2. size() Returns the max root-to-leaf depth of the tree. Uses a
	 * recursive helper that recurs down to find the max depth.
	 */
	public int size() {
		return (size(root));
	}

	private int size(Node node) {
		if (node == null)
			return (0);
		else {
			return (size(node.left) + 1 + size(node.right));
		}
	}
	
	/**
	 * 3. maxDepth() Returns the min value in a non-empty binary search tree.
	 * Uses a helper method that iterates to the left to find the min value.
	 */
	public int maxDepth() {
		return (maxDepth(root));
	}
	private int maxDepth(Node node) {
		if (node == null) {
			return (0);
		} else {
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);
			// use the larger + 1
			return (Math.max(lDepth, rDepth) + 1);
		}
	}

	/**
	 * 4. minValue() Finds the min value in a non-empty binary search tree.
	 */
	public int minValue() {
		return (minValue(root));
	}
	
	private int minValue(Node node) {
		Node current = node;
		while (current.left != null) {
			current = current.left;
		}
		return (current.data);
	}

	/**
	 * 4 b. maxValue() Finds the max Value in a non-empty binary search tree.
	 */
	public int maxValue() {
		return (maxValue(root));
	}	
	private int maxValue(Node node) {
		Node current = node;
		while (current.right != null) {
			current = current.right;
		}
		return (current.data);
	}
	
	/**
	 * 5. printTree() Prints the node values in the "inorder" order. Uses a
	 * recursive helper to do the traversal. http://cslibrary.stanford.edu/110/
	 */
	public void printTree() {
		printTree(root);
		System.out.println();
	}

	private void printTree(Node node) {
		if (node == null)
			return;
		// left, node itself, right
		printTree(node.left);
		System.out.print(node.data + " ");
		printTree(node.right);
	}

	/**
	 * 6. printPostorder() Prints the node values in the "postorder" order. Uses
	 * a recursive helper to do the traversal.
	 */
	public void printPostorder() {
		printPostorder(root);
		System.out.println();
	}

	public void printPostorder(Node node) {
		if (node == null)
			return;
		// first recur on both subtrees
		printPostorder(node.left);
		printPostorder(node.right);
		// then deal with the node
		System.out.print(node.data + " ");
	}

	/**
	 * 7. hasPathSum() Given a tree and a sum, returns true if there is a path
	 * from the root down to a leaf, such that adding up all the values along
	 * the path equals the given sum. Strategy: subtract the node value from the
	 * sum when recurring down, and check to see if the sum is 0 when you run
	 * out of tree.
	 */
	public boolean hasPathSum(int sum) {
		return (hasPathSum(root, sum));
	}

	boolean hasPathSum(Node node, int sum) {
		// return true if we run out of tree and sum==0
		if (node == null) {
			return (sum == 0);
		} else {
			// otherwise check both subtrees
			int subSum = sum - node.data;
			return (hasPathSum(node.left, subSum) || hasPathSum(node.right,
					subSum));
		}
	}

	/**
	 * 8. printPaths() Given a binary tree, prints out all of its root-to-leaf
	 * paths, one per line. Uses a recursive helper to do the work.
	 */
	public void printPaths() {
		int[] path = new int[1000];
		printPaths(root, path, 0);
	}
	/**
	 * Recursive printPaths helper -- given a node, and an array containing the
	 * path from the root node up to but not including this node, prints out all
	 * the root-leaf paths.
	 */
	private void printPaths(Node node, int[] path, int pathLen) {
		if (node == null)
			return;
		// append this node to the path array
		path[pathLen] = node.data;
		pathLen++;
		// it's a leaf, so print the path that led to here
		if (node.left == null && node.right == null) {
			printArray(path, pathLen);
		} else {
			// otherwise try both subtrees
			printPaths(node.left, path, pathLen);
			printPaths(node.right, path, pathLen);
		}
	}

	/**
	 * Utility that prints ints from an array on one line.
	 */
	private void printArray(int[] ints, int len) {
		int i;
		for (i = 0; i < len; i++) {
			System.out.print(ints[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * 9. mirror() Changes the tree into its mirror image. So the tree... 4 / \
	 * 2 5 / \ 1 3 is changed to... 4 / \ 5 2 / \ 3 1 Uses a recursive helper
	 * that recurs over the tree, swapping the left/right pointers.
	 */
	public void mirror() {
		mirror(root);
	}

	private void mirror(Node node) {
		if (node != null) {
			// do the sub-trees
			mirror(node.left);
			mirror(node.right);
			// swap the left/right pointers
			Node temp = node.left;
			node.left = node.right;
			node.right = temp;
		}
	}

	/**
	 * 10. doubleTree() Changes the tree by inserting a duplicate node on each
	 * nodes's .left. So the tree... 2 / \ 1 3 Is changed to... 2 Binary Trees
	 * Page: 25 http://cslibrary.stanford.edu/110/ BinaryTrees.html / \ 2 3 / /
	 * 1 3 / 1 Uses a recursive helper to recur over the tree and insert the
	 * duplicates.
	 */
	public void doubleTree() {
		doubleTree(root);
	}

	private void doubleTree(Node node) {
		Node oldLeft;
		if (node == null)
			return;
		// do the subtrees
		doubleTree(node.left);
		doubleTree(node.right);
		// duplicate this node to its left
		oldLeft = node.left;
		node.left = new Node(node.data);
		node.left.left = oldLeft;
	}

	/**
	 * 11. sameTree() Compares the receiver to another tree to see if they are
	 * structurally identical.
	 */
	public boolean sameTree(BinaryTree other) {
		return (sameTree(root, other.root));
	}

	/**
	 * Recursive helper -- recurs down two trees in parallel, checking to see if
	 * they are identical.
	 */
	boolean sameTree(Node a, Node b) {
		// 1. both empty -> true
		if (a == null && b == null)
			return (true);
		// 2. both non-empty -> compare them
		else if (a != null && b != null) {
			return (a.data == b.data && sameTree(a.left, b.left) && sameTree(
					a.right, b.right));
		}

		// 3. one empty, one not -> false
		else
			return (false);
	}

	/**
	 * 12. countTrees() For the key values 1...numKeys, how many structurally
	 * unique binary search trees are possible that store those keys? Strategy:
	 * consider that each value could be the root. Recursively find the size of
	 * the left and right subtrees.
	 */
	public static int countTrees(int numKeys) {
		if (numKeys <= 1) {
			return (1);
		} else {
			// there will be one value at the root, with whatever remains
			// on the left and right each forming their own subtrees.
			// Iterate through all the values that could be the root...
			int sum = 0;
			int left, right, root;
			for (root = 1; root <= numKeys; root++) {
				left = countTrees(root - 1);
				right = countTrees(numKeys - root);
				// number of possible trees with this root == left*right
				sum += left * right;
			}
			return (sum);
		}
	}

	/**
	 * 13. isBST1() Tests if a tree meets the conditions to be a binary search
	 * tree (BST).
	 */
	public boolean isBST() {
		return (isBST(root));
	}

	/**
	 * Recursive helper -- checks if a tree is a BST using minValue() and
	 * maxValue() (not efficient).
	 */
	private boolean isBST(Node node) {
		if (node == null)
			return (true);
		// do the subtrees contain values that do not
		// agree with the node?
		if (node.left != null && maxValue(node.left) > node.data)
			return (false);
		if (node.right != null && minValue(node.right) <= node.data)
			return (false);
		// check that the subtrees themselves are ok
		return (isBST(node.left) && isBST(node.right));
	}

	/**
	 * 14. isBST2() Tests if a tree meets the conditions to be a binary search
	 * tree (BST). Uses the efficient recursive helper.
	 */
	public boolean isBST2() {
		return (isBST2(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	/**
	 * Efficient BST helper -- Given a node, and min and max values, recurs down
	 * the tree to verify that it is a BST, and that all its nodes are within
	 * the min..max range. Works in O(n) time -- visits each node only once.
	 */
	private boolean isBST2(Node node, int min, int max) {
		if (node == null) {
			return (true);
		} else {
			// left should be in range min...node.data
			boolean leftOk = isBST2(node.left, min, node.data);
			// if the left is not ok, bail out
			if (!leftOk)
				return (false);
			// right should be in range node.data+1..max
			boolean rightOk = isBST2(node.right, node.data + 1, max);
			return (rightOk);
		}
	}

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.build123c();
		binaryTree.insert( 6);
		binaryTree.printTree();
		
	}

	
}
