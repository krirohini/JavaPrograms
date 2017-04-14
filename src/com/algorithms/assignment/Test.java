package com.algorithms.assignment;

public class Test {
	
	
	/*You are given a sorted (from smallest to largest) array A of n distinct integers 
	which can be positive, negative, or zero.
	You want to decide whether or not there is an index i such that A[i] = i. 
	Design the fastest algorithm that you can for solving this problem. */

	public boolean anIndexAndNumberExit( int a[], int n, int inValue) {
		
		if ( (inValue < 0) || (inValue>n) ) {
			System.out.println("Not a valid index");
			return false;
		}
		
		if ( a[inValue] == inValue ) {
			return true;
		}
		
		return false;
	}
	
	// ####################################################################
	
	/*You are a given a unimodal array of n distinct elements, 
	meaning that its entries are in increasing order up until its maximum element, 
	after which its elements are in decreasing order. 
	Give an algorithm to compute the maximum element that runs in O(log n) time.*/
	
	public int maxElement(int a[], int n) {
		int mid=0;
		if (n<=0) {
			System.out.println("Invalid size");
			return 0;
		}
		else {
			mid = (n-1)/2;
//			int index = mid + 1;
			System.out.println(+a[mid]);
			return a[mid];
		}
	}
	
	
	public static void main(String[] args) {
		
		int b[] = {-4, -3, 0, 2, 4, 6, 7, 8, 9, 13, 45, 48, 56,};
		Test t = new Test();
		System.out.println("Availavility of the given number at same index is ..." + t.anIndexAndNumberExit(b, 7, 4));
		
		// ####################################################################
		int c[] = {-5, -3, -2, 0, 4, 7, 9, 12, 9, 7, 4, 0, -2, -3, -5 };
		System.out.println("Maximum element of the arrray is ...." + t.maxElement(c, 15));

		

	}

}
