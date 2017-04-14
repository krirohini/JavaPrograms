package com.datastructure.programs.queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {

	public static void main(String[] args) {
		
		//    head <- ########################## <- tail   (FIFO --- first in first out)
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(4);
		q1.add(38);
		q1.add(1398);
		q1.add(8977);
		q1.add(72);
		
		// head of the queue
		System.out.println(" Head of the queue q1 is " + q1.element());
System.out.println("###########################################################################");
		// Exception in thread "main" java.lang.IllegalStateException: Queue full
		//q1.add(5430);
		try {
			q1.add(5430);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add too many elements in the queue");
		}
System.out.println("###########################################################################");
		System.out.println("Elements of Queue q1 are....." + q1);
		
		// To remove elements from the queue
		q1.remove();
		q1.remove();
		q1.remove();
		q1.remove();		
		try {
			q1.remove();
		} catch (NoSuchElementException e) {
			System.out.println("Queue is empty, no more elements to remove");
		}
System.out.println("###########################################################################");
		
		System.out.println("Elements of Queue q1 are....." + q1);
		
		////////////////////////////////////////////////////////////
		q1.offer(45);
		q1.offer(24);
		q1.offer(19);
		q1.offer(378);
		q1.offer(8787);
System.out.println("###########################################################################");

		System.out.println("Elements of Queue q1 are....." + q1);
		
		// head of the queue
		System.out.println("Head of the queue q1 is " + q1.peek());
System.out.println("###########################################################################");
				
		// To remove elements from the queue
		q1.poll();
		q1.poll();
		q1.poll();
		q1.poll();		
		q1.poll();	
		q1.poll();
		System.out.println("Elements of Queue q1 are....." + q1);
				

		
		
		
		
	}

}
