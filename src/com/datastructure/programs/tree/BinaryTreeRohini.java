package com.datastructure.programs.tree;

//Binary Search Tree Implementation 
/**  FQA for INTERVIEWS
 * 1. Given two binary trees, write a compare function to check if they are equal or not. 
 *    Being equal means that they have the same value and same structure.
 * 
 * 2. Given a binary tree, programatically you need to prove it is a binary search tree.
 * 
 * 3. How do you find out the fifth maximum element in an Binary Search Tree in efficient manner. 
 *    Note: You should not use use any extra space. i.e sorting - - Binary Search Tree and 
 *    storing the results in an array and listing out the fifth element.
 *    
 * 4. How do you put a Binary Search Tree in an array in a efficient manner. 
 *    Hint :: If the node is stored at the ith position and its children are at 2i and 2i+1
 *    (I mean level order wise)Its not the most efficient way.)
 *    
 * 5. Write a program to find depth of binary search tree without using recursion.
 * 
 * 6. Height of the BST
 * 
 * 7. Delete a node in BST
 * 
 * 8. Find the position and height of a particular node in BST

*/
public class BinaryTreeRohini {

		// Root node pointer. Will be null for an empty tree.
		private Node root;

		/**
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
		public BinaryTreeRohini() {
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
				System.out.println("YES");
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
		 * Build 123 by calling insert() three times. Note that the '2' must be
		 * inserted first.
		 */
		public void build123c() {
			root = null;
			root = insert(root, 2);
			root = insert(root, 1);
			root = insert(root, 3);
		}
		
		/**
		 * isBST2() Tests if a tree meets the conditions to be a binary search
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
		 * maxDepth() Returns the min value in a non-empty binary search tree.
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
		 * minValue() Finds the min value in a non-empty binary search tree.
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
		 * maxValue() Finds the min value in a non-empty binary search tree.
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
		
		
		/*public int nthHighest(int nth){
			return (highest(root));
		}
		
		private Node highest(Node node) {
			if(maxDepth=) {
				
			}
		}*/

		/**
		 * sameTree() Compares the receiver to another tree to see if they are
		 * structurally identical.
		 */
		public boolean sameTree(BinaryTreeRohini other) {
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
		
		public int atPlace(int data){
			return (atPlace(root));
		}
		
		private int atPlace(Node node){
			if(node==null){
				return (0);
			}else {
				int place=atPlace(node);
			}
			
			return maxDepth(node);
		}
		
	public static void main(String[] args) {
		
		BinaryTreeRohini binaryTree = new BinaryTreeRohini();
		binaryTree.build123c();
		binaryTree.insert( 6);
		binaryTree.insert( 10);
		binaryTree.insert(164);
		binaryTree.insert(4);
		binaryTree.printTree();
		boolean isBST=binaryTree.isBST2();
		System.out.println(isBST);
		binaryTree.lookup(5);
		System.out.println("Size of BST is  .. " +binaryTree.size());
		System.out.println("Depth of BST is  .. " +binaryTree.maxDepth());
		
		BinaryTreeRohini otherBinaryTree= new BinaryTreeRohini();
		otherBinaryTree.build123c();
		otherBinaryTree.insert( 6);
		otherBinaryTree.insert( 10);
		otherBinaryTree.insert(164);
		//otherBinaryTree.insert(4);
		
		System.out.println("SameTree Function..."+otherBinaryTree.sameTree(binaryTree));
		System.out.println("Root is ..."+binaryTree.root.data);
		//System.out.println("Position of 10..."+binaryTree.position(6));
		
		
	}
}
