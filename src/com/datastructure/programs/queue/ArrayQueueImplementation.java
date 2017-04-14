package com.datastructure.programs.queue;

public class ArrayQueueImplementation {

	private final static int size = 20;
	private int front = 0;
	private static int rear = -1;
	private static int[] queue = new int[size];
	
	public void enqueue(int data){
		if(rear == -1) {
			rear++;
			queue[front] = data;
		}else {
			if(rear < size){
				rear++;
				queue[rear] = data;
			}
		}
	}

	public void dequeue(){
		if(rear == -1){
			System.out.println("..Queue is UnderFlow..");
		}else{
			System.out.println("After dequeue()...");
			for(int i=0; i<rear; i++){
				queue[i]=queue[i+1];
			}
			--rear;
		}
	}
	
	public int length(){
	
		int len=0;
		return len;
	}
	
	public void traverseQueue(){
		for(int i=0; i <= rear; i++){
			System.out.print("  "+ queue[i]);
		}
		System.out.println();
	}
	
	public boolean contain(int number){
		return true;
	}
	
	
	public static void main(String[] args) {
		ArrayQueueImplementation obj = new ArrayQueueImplementation();
		obj.enqueue(4);
		obj.enqueue(8);
		obj.enqueue(5);
		obj.traverseQueue();
		obj.dequeue();
		obj.traverseQueue();

	}

}
