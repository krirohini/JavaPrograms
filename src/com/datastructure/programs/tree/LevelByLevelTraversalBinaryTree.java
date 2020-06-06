/**
 * 
 */
package com.datastructure.programs.tree;

import java.util.LinkedList;
import java.util.Queue;


/**
 * @author rohini
 *
 */
public class LevelByLevelTraversalBinaryTree {

	/**
	 * @param args
	 */

	// Root node pointer. Will be null for an empty tree.
	private Node root;

	/*
	 * --Node-- The binary tree is built using this nested node class. 
	 * Each node stores one data element, and has left and right sub-tree pointer 
	 * which may be null. 
	 * The node is a "dumb" nested class -- we just use it for
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
	public LevelByLevelTraversalBinaryTree() {
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

	/*
	 * This method is used printing the nodes level by level for a tree.
	 * Approach - Using two queues. 
	 */
	public static void printNodesLevelByLevel(Node root){
		if(root == null){
			return;
		}
		
		Queue<Node> que_1 = new LinkedList<Node>();
		Queue<Node> que_2 = new LinkedList<Node>();

		que_1.add(root);
		
		while(!que_1.isEmpty() || !que_2.isEmpty()){
			
			while(!que_1.isEmpty()){
				root = que_1.poll();
				System.out.print(root.data + " ");
				
				if(root.left != null){
					que_2.add(root.left);
				}
				if(root.right != null){
					que_2.add(root.right);
				}
				
			}
			
			System.out.println();
			
			while(!que_2.isEmpty()){
				root = que_2.poll();
				System.out.print(root.data + " ");
				
				if(root.left != null){
					que_1.add(root.left);
				}
				if(root.right != null){
					que_1.add(root.right);
				}
				//System.out.println();
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Let us create binary tree shown in above diagram 
	       /*            28 
	                   /   \ 
	                  7      10 
	                /   \     \ 
	               53    15    36 
	        */

		Node root = new Node(28); 
        root.left = new Node(7); 
        root.right = new Node(10); 
        root.left.left = new Node(53); 
        root.left.right = new Node(15); 
        root.right.right = new Node(36); 
          
        printNodesLevelByLevel(root); 
	}

}
