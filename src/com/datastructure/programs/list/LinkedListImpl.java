package com.datastructure.programs.list;

//import java.util.Random;

public class LinkedListImpl {

	private Node head;
	
	static class Node {
		int data;
		Node next=null;

		Node(int value) {
			data = value;
			next = null;
		}

		public int size(Node head) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	
	public LinkedListImpl() {
		head = null;
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
	
	public int size() {
		int count = 0;
		if(head == null) {
			return count;
		}
		Node curNode = head;
		while (curNode != null) {
			//count = count++;
			count = count +1;
			curNode = curNode.next;
		}
		return count;
	}
	
	public void reverseList() {
		Node preNode=null;
		Node curNode=head;
		Node nextNode=curNode.next;
		while(curNode != null){
			nextNode = curNode.next;
			curNode.next = preNode;
			preNode = nextNode;			
			/*if(nextNode==null){
				break;
			}*/
			System.out.print(curNode.data + " -> ");
		}
	}	
	
	public void copyList(){
		LinkedListImpl clist = new LinkedListImpl();
		Node curNode = head;
		//Node copyCurNode = head;
		
		while( curNode != null ){
			clist.addAtEnd(curNode.data);
			curNode = curNode.next;
		}		
	}
	
	
	
	/**
	 * There is linked list of millions of node and you do not know the length of it. 
	 * Write a function which will return a random number from the list.
	 */
	/*public int randomNode(){
			Random ran = new Random();
			int ranNode = ((Object) head).get(ran.nextInt((head).size(head)));
			return ranNode;
	}
		*/
	
	/**
	 * Given two linked lists, return the intersection of the two lists: 
	 * i.e. return a list containing only the elements that occur in both of the input lists.
	 */
	//public void commonElementsOfTwoList(Node node1, Node node2){
	public void commonElementsOfTwoList(LinkedListImpl list1, LinkedListImpl list2){
		Node comnNode;
		LinkedListImpl comnListData = new LinkedListImpl();
		if(list1 == null || list2 == null) {
			System.out.println("One of the list is Empty.");
		}else{
			//Node curNode2 = head2;
			Node curNode = head;
			Node curNode2 = head;
			
			//System.out.print("|");
			while (curNode != null) {
				while(curNode2 != null){
					if(curNode.data == curNode2.data){
						comnNode = new Node(curNode.data);
						comnListData.addAtBeg(comnNode.data);
						
							//comnNode.data = curNode.data;							
					}
					//comnNode.next=null;
				}//curNode2 = curNode2.next;
				//System.out.print(comnNode.data + "|->|");
				//curNode = curNode.next;
			}
			//System.out.println("null|");
			comnListData.traverse();
		}
			
		//return comnNode;
	}
	
	/*public void deleteNode(int dNode){
		if(head==null){
			System.out.println("List is Empty");
		}
		Node curNode = head;
		while(curNode.next != null){
			if(curNode.next.data == dNode){
				curNode = curNode.next.next;
			}			
		}
	}*/
	
	public static void main(String[] args) { 
		LinkedListImpl list = new LinkedListImpl();
		list.addAtBeg(5);
		list.addAtBeg(4);
		list.addAtEnd(9);
		list.traverse();
		//list.deleteNode(4);
		list.traverse();
		System.out.println("Size of the list is " +list.size());
		//list.reverseList();
		
		/*LinkedListImpl list2 = new LinkedListImpl();
		list2.addAtBeg(5);
		list2.addAtBeg(4);
		list2.addAtEnd(9);
		list2.addAtEnd(23);
		list2.traverse();
		System.out.println("Size of the list2 is " +list2.size());
		//list.reverseList();
		//list.commonElementsOfTwoList(list, list2);
		*/
		LinkedListImpl list3 = new LinkedListImpl();
		//list3.commonElementsOfTwoList(list, list2);
		list3.copyList();
		list3.traverse();

	}

}
