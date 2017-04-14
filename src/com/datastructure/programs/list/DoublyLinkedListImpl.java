package com.datastructure.programs.list;

public class DoublyLinkedListImpl {

	private Node head;
	private Node tail;
	private int size;
	
	public DoublyLinkedListImpl(){
		head = null;
		tail = null;
	}
	
	static class Node {
		int data;
		Node next;
		Node prev;
		
		public Node (int value){
			data = value;
			next = null;
			prev = null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
