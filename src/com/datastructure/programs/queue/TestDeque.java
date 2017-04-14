package com.datastructure.programs.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {

	public static void main(String[] args) {
		
		// To add elements in the dequeue, addFirst() and addLast() , Throws exception method
		Deque<Integer> d1 = new ArrayDeque<Integer>();
		d1.addFirst(429);
		d1.addFirst(7673);
		d1.addFirst(429);
		d1.addFirst(3650);
		d1.addFirst(487899);
		d1.addLast(42049);
		// d1.addFirst(null); it can't be.....		
		System.out.println("Elements of the Deque d1 are ....." + d1);
		System.out.println("##########################################################");
		
		// head and tail of the dequeue, Throws exception
		System.out.println("Head of the dequeue is...." + d1.getFirst() + " ....... " +  " Tail of the deque is ...." + d1.getLast());
		System.out.println("##########################################################");

		// Removing first and last element of the dequeue, Throws exception
		System.out.println("Removing first from the dequeue is...." + d1.removeFirst() + " ....... " +  " Removing last from the deque is ...." + d1.removeLast());
		System.out.println("##########################################################");
		System.out.println("Elements of the Deque d1 are ....." + d1);
		System.out.println("##########################################################");
		d1.removeFirst();
		d1.removeFirst();
		d1.removeFirst();
		d1.removeFirst();
		// d1.removeFirst(); ....... java.util.NoSuchElementException
		
		
		//To add elements in the dequeue, Special value
		
		d1.offerFirst(429);
		d1.offerFirst(7673);
		d1.offerFirst(429);
		d1.offerFirst(3650);
		d1.offerFirst(487899);
		d1.offerLast(42049);
		d1.offerFirst(959430099);
		System.out.println("Elements of the Deque d1 are ....." + d1);
		System.out.println("##########################################################");
		
		// head and tail of the dequeue
		System.out.println("Head of the dequeue is...." + d1.peekFirst() + " ....... " +  " Tail of the deque is ...." + d1.peekLast());
		System.out.println("##########################################################");

		// Removing first and last element of the dequeue
		System.out.println("Removing first from the dequeue is...." + d1.pollFirst() + " ....... " +  " Removing last from the deque is ...." + d1.pollLast());
		System.out.println("##########################################################");
		System.out.println("Elements of the Deque d1 are ....." + d1);
		System.out.println("##########################################################");

		d1.poll();
		d1.poll();
		d1.poll();
				
		// Using stack method
		d1.pop();
		d1.pop();
		//d1.pop();
		d1.poll();
		//d1.pollLast();
		//d1.pop();
		
		System.out.println("Elements of the Deque d1 are ....." + d1);
		System.out.println("##########################################################");		

	}

}
