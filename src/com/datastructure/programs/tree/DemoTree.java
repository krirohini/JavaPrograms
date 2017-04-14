package com.datastructure.programs.tree;

public class DemoTree {
	
	private static Node ROOT;
	
	private static class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int value){
			data = value;
		}
	}
	
	public DemoTree(){
		ROOT = null;
	}
	
	public void insert(int data){
		ROOT = insert(ROOT, data);
	}
	private Node insert(Node node, int data){
		if(node == null){
			  node = new Node(data);
		}else {
			if(data <= node.data) {
				 node.left = insert(node.left, data);
			}else{
				 node.right = insert(node.right, data);
			}
		}
		return (node);
	}
	
	
	public void printInOrder(){
		printInOrder(ROOT);
	}
	private void printInOrder(Node node){
		if(node == null){
			return;
		}else{
			printInOrder(node.left);
			System.out.println(node.data + " ");
			printInOrder(node.right);
		}
	}
	
	public static void main(String[] args) {
		
		DemoTree tree = new DemoTree();
		tree.insert(7);
		tree.insert(45);
		tree.insert(8);
		tree.insert(12);
		
		tree.printInOrder();
		System.out.println("GGG");
		
		//tree.lookup(7);

	}

}
