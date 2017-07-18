package com.datastructure.programs.queue;

public class CircularQueue {
	
	public static int size = 10;
	public static int[] queue = new int[size];
	public static int  front = -1;
	public static int rear = -1;
	public static int last = size -1;
	
	public static void enQueue(int a){
		
		if(rear == last) {
			System.out.println("Queue is Overflow");
		}
		
		if(front == -1 || rear == -1) {
			front++;
			rear++;
			queue[front] = a;
		}else {
			rear++;
			queue[rear] = a;
		}
		
		if(front < 0 ) {
			last = size - 1; 
		}else {}
			
		
	}
	
	public static void dequeue(){
		if(rear == -1) {
			System.out.println("Queue is Underflow");
		}
		queue[rear] = 0;
		--rear;
	}
	
	public static void printQueue(){
		for(int i=0; i<rear; i++){
			System.out.print(" | " + queue[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CircularQueue obj = new CircularQueue();
		enQueue(4);
		enQueue(7);
		dequeue();
		printQueue();
		
	}

}
