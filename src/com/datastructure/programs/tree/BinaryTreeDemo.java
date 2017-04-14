/**
 * 
 */
package com.datastructure.programs.tree;


public class BinaryTreeDemo {

	private static Node ROOT;
	private static int HEIGHT;
		
	private static class Node {
		int data;
		Node left;
		Node right;
		
		Node(int value){
			data = value;
			left = null;
			right = null;			
		}
	}
	
	public BinaryTreeDemo(){
		ROOT = null;
	}
	
	public void insert(int data){
		ROOT = insert(ROOT, data);
	}
	
	private Node insert (Node node, int data){
		if(node == null){
			node = new Node(data);		
		}else {
			if( data <= node.data ){
				node.left = insert(node.left, data);
			}else {
				node.right = insert(node.right, data);
			}
		}		
		return (node);
	}
		
	public boolean lookup (int data){
		return (lookup(ROOT,data));
	}
	
	private boolean lookup (Node node, int data){
		if(node == null){
			return (false);
		}
		if( data == node.data ){
			return (true);
		}else if(data < node.data ){
			
			return (lookup(node.left, data));
		}else {
			return (lookup(node.right, data));
		}
		
	}
	
	public void printTreeInOrder(){
		printTreeInOrder(ROOT);
		System.out.println();
	}	
	private void printTreeInOrder(Node node){
		if(node == null){
			return;
		}
		printTreeInOrder(node.left);
		System.out.println(node.data + " ");
		printTreeInOrder(node.right);
	}
	
	//maxDepth() OR height() of the tree
	public int maxDepth(){
		return maxDepth(ROOT);
	}
	private int maxDepth(Node node){
		if(ROOT == null){
			return 0;
		}else{
			int ldepth = maxDepth(node.left);
			int rdepth = maxDepth(node.right);
			HEIGHT = Math.max(ldepth, rdepth) + 1;
			return HEIGHT;
		}
	}
	
	// Level Order Traversal OR BFS (Breadh First Search Traversal) of the Tree
	public void printLevelOrderTravarsal(){
		for(int i=0; i<= HEIGHT; i++){
			printNodeAtGivenLevel(ROOT);
		}
	}
	public void printNodeAtGivenLevel(Node node){
		if(node == null){
			return ;
		}
		if(HEIGHT == 1) {
			System.out.println(node.data);
		}else{
			if(HEIGHT > 1){
				printNodeAtGivenLevel(node.left);
				printNodeAtGivenLevel(node.right);
			}
		}
	}
	
		
	public static void main(String[] args) {
		
		BinaryTreeDemo obj = new BinaryTreeDemo();
		obj.insert(5);
	//	obj.insert(3);
		//obj.insert(23);
		//obj.insert(8);
		
		obj.printLevelOrderTravarsal();
		//obj.printTreeInOrder();
		//obj.lookup(3);
	}

}
