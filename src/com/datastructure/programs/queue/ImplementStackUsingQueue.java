package com.datastructure.programs.queue;

public class ImplementStackUsingQueue {

	public int max_size = 5;
	public int head = 0;
	public static int tail = -1;
	public int[] queue = new int[max_size];
	public int[] stack = new int[max_size];

	/** enqueue(int data) Inserts the specified element into this queue 
	 * if it is possible to do so immediately without violating capacity restrictions,
	 * returning true upon success and throwing an IllegalStateException 
	 * if no space is currently available.	
	 */
	public void enqueue(int data){
		if(tail == -1){
			tail++;
			queue[tail] = data;
		}else {
			tail++;
			queue[tail] = data;
		}		
	}
	
	// dequeue() Retrieves and removes the head of this queue.
	public void dequeue(){
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
	
	/** poll() Retrieves and removes the head of this queue, 
	or returns null if this queue is empty.
	*/
	public int poll(){
		int removedItem = element();
		dequeue();
		return removedItem;
	}
	
	public void printQueue(){
		System.out.println("...Queue Elemnets...");
		for(int i=0; i<=tail; i++){
			System.out.println(queue[i]);
		}
	}
	
		
	//========================STACK=================
	public  int size = 0;
	public  int[] stkAry = new int[max_size];
	
	public void push(int pushNum) throws IndexOutOfBoundsException {
		if(size >= max_size) {
			System.out.println("Stack overFlow...");
			throw new IndexOutOfBoundsException();
		}
		
		System.out.println("Top is at posiotion ..  "+size +"  PUSH  " +pushNum);
		stkAry[size++] = pushNum;	
		printStack();
	}

	public int pop() throws IndexOutOfBoundsException  {
		if(size <= 0) {
			System.out.println("Stack UnderFlow...");
			throw new IndexOutOfBoundsException();
		}else{
			int topVal = stkAry[size-1];
			--size;
			System.out.println("...POP...Now, Position of TOP is .."+size);
			printStack();
			return topVal;
		}
		
	}
	
	public void printStack() {
		System.out.print("Bottom | ");
		for(int i=0; i< size; i++){
			System.out.print(stkAry[i] + "|");
		}
		System.out.println("Top");
	}

	public boolean isEmpty() {
		if(size <= 0){
			System.out.println("STACK is EMPTY");
			return true;
		}
		System.out.println("STACK is not EMPTY");
		return false;
		
	}
	
	public int peek() {
		System.out.println("...PEEK...Top object is "+stkAry[size]);
		return stkAry[size-1];
	}
	
	public boolean search(int num) {
		boolean hasElement=true;
		for(int i=0; i<size; i++) {
			if(stkAry[i]==num){
				System.out.println("Yes, Stack has element  " +num);
				hasElement=true;
				break;
			}else {				
				hasElement=false;
			}
		}
		return hasElement;
	}	
	
	public void getMin(int[] ary) {
		int min = stkAry[0];
		for(int i=1; i<max_size-1; i++) {			
			if(min>stkAry[i+1]){
				min=stkAry[i];
			}else{
				min=stkAry[i+1];
			}
		}
		System.out.println("Minimum is .. " +min);
			
		
	}
	
	public static void main(String[] args) {
		
		ImplementStackUsingQueue obj = new ImplementStackUsingQueue();
		obj.enqueue(35);
		obj.enqueue(58);
		//int temp = obj.poll();
		obj.enqueue(81);
		obj.printQueue();
		for(int count=0; count<=tail; count++){
			int temp = obj.poll();
			obj.push(temp);
		}
		obj.printStack();
		//obj.push(temp);
		
	}

}
