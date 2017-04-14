package com.datastructure.programs.queue;

public class QueueImplementation {
	
	public int size = 10;
	public int head = 0;
	public int tail = -1;
	public int[] queue = new int[size];

	/** add(int data) Inserts the specified element into this queue 
	 * if it is possible to do so immediately without violating capacity restrictions,
	 * returning true upon success and throwing an IllegalStateException 
	 * if no space is currently available.	
	 */
	public void add(int data){
		if(tail == -1){
			tail++;
			queue[tail] = data;
		}else {
			tail++;
			queue[tail] = data;
		}		
	}
	
	// remove() Retrieves and removes the head of this queue.
	public void remove(){
		if(head < 0 || tail < 0) {
			System.out.println("Queue is Empty");
		}else if(tail == 0) {			
			System.out.println("Queue has Only One Element NOW");
			queue[tail]=0;
			tail--;			
		}else {
			for(int i=0; i<=tail; i++){
				queue[i] = queue[i+1];
				queue[i+1] = 0;
			}
			tail--;
		}
	}
	
	// element() Retrieves, but does not remove, the head of this queue.
	public int element(){ 
		System.out.println("Head elements of the Queue is...  " + queue[head]);
		return queue[head];
	}
	
	/** peek() Retrieves, but does not remove, the head of this queue, 
	 * or returns null if this queue is empty.
	 */
	public void peek(){ 	}
	
	/** poll() Retrieves and removes the head of this queue, 
	or returns null if this queue is empty.
	*/
	public int poll(){
		int removedItem = element();
		remove();
		return removedItem;
	}
	
	public void printQueue(){
		System.out.println("...Queue Elemnets...");
		for(int i=0; i<=tail; i++){
			System.out.println(queue[i]);
		}
	}
	

	public static void main(String[] args) {
		
		QueueImplementation obj = new QueueImplementation();
		obj.remove();
		obj.add(4);
		obj.add(34);
		obj.element();
		obj.poll();
		obj.printQueue();
		obj.remove();
		obj.element();
		obj.printQueue();
		obj.add(7);
		obj.printQueue();
		obj.add(56);
		obj.add(92);
		obj.remove();
		obj.remove();
		obj.printQueue();
		obj.element();
		obj.poll();
		
	}

}
