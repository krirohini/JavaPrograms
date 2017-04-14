package com.datastructure.programs.list;

public class DetectLoopAndRemove {

	private Node head;

	static class Node {
		int data;
		Node next; //= null;
		boolean flag = false;

		Node(int value) {
			data = value;
			next = null;
			flag = false;
		}

		public int size(Node head) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	public DetectLoopAndRemove() {
		// TODO Auto-generated constructor stub
		if(head == null) {
			System.out.println("empty list");
			return;
		}
		Node curNode = head;
		//System.out.print("|");
		while (curNode.flag == true){
			System.out.println("List has the loop");
		}
		while (curNode != null) {
				System.out.print(curNode.data + "|->|");
				curNode = curNode.next;
		}
		System.out.println("null|");
	}	
	
	public void addAtBeg(int num) {
		Node tNode = new Node(num);
		if (head == null) {
			head = tNode;
			return;
		} else {
			tNode.next = head;
			head = tNode;
		}
	}
	
	public void addAtEnd(int num) {
		Node tNode = new Node(num);
		if (head == null) {
			head = tNode;
			return;
		}
		Node curNode = head;
		while(curNode != null) {
			if(curNode.next == null) {
				curNode.next = tNode;
				return;
			}
			curNode = curNode.next;
		}
	}
	
	public void traverse() {
		if(head == null) {
			System.out.println("empty list");
			return;
		}
		Node curNode = head;
		System.out.print("|");
		while (curNode != null) {
				System.out.print(curNode.data + "|->|");
				curNode = curNode.next;
		}
		System.out.println("null|");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
