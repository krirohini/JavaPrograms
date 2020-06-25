/**
 * 
 */
package com.rohini.common.questions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author rohini
 *
 */
public class TreeTraversal {

	/**
	 * @param args
	 */
	static Node root = null;

	private static class Node {
		int data;
		Node left;
		Node right;

		Node(int newData) {
			data = newData;
			left = null;
			right = null;
		}
	}

	/**
	 * Creates an empty tree -- a null root pointer.
	 */
	public TreeTraversal() {
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

	public void printPreOrderTraversal(Node node) {
		if (node == null) return;
		
		System.out.println("InOrder Binary Tree Traverssal \n");
		
		Deque<Node> stack = new ArrayDeque<Node>();
		stack.add(root);
		
		while( !stack.isEmpty()){
			root = stack.poll();
			System.out.print(root.data + " ");
		
			if(root.right != null){
				stack.push(root.right);
			}
			
			if(root.left != null){
				stack.push(root.left);
			}
		}
	}
	
	public void printPostOrderTraversal(Node node){
		if (node== null) return;
		
		System.out.println("\n\nPostOrder Binary Tree Traverssal \n");
		
		Deque<Node> stack_1 = new ArrayDeque<Node>();
		Deque<Node> stack_2 = new ArrayDeque<Node>();
		
		stack_1.push(root);
		
		while( ! stack_1.isEmpty() ){
			root = stack_1.poll();
			stack_2.push(root);
			
			if(root.left != null){
				stack_1.push(root.left);
			}
			if(root.right != null){
				stack_1.push(root.right);
			}
		}
		
		while( ! stack_2.isEmpty() ){
			root = stack_2.poll();
			System.out.println(" " + root.data);
		}
	}
	
	public void printInOrderTraversal(Node node){
		System.out.println("\n\n InOrder Traversal \n");
		
		if(node == null) return;
	
		Deque<Node> stack = new ArrayDeque<Node>();
		
		while( true ){
			if( root != null ){
				stack.push(root);
				root = root.left;
			}else{
				if( stack.isEmpty() ) break;
				root = stack.poll();
				System.out.println(root.data + " ");
				root = root.right;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeTraversal binaryTree = new TreeTraversal();
		binaryTree.insert(4);
		binaryTree.insert(9);
		binaryTree.insert(18);
		binaryTree.insert(43);
		binaryTree.insert(26);
		binaryTree.insert(-3);
		binaryTree.insert(85);
		
		//binaryTree.printPreOrderTraversal(root);
		//binaryTree.printPostOrderTraversal(root);
		binaryTree.printInOrderTraversal(root);
	}

}
