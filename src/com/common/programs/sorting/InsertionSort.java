package com.common.sorting;

public class InsertionSort {
	
	public void insertionSort(int a[]) {
				
		if (a.length==1) {
			System.out.println("Array is Sorted");
			return;
		}
		
		if (a.length<1 ) {
			System.out.println("Invalid Array Size");
			return;
		}
		
		System.out.println("Given Array is ........");		
		for ( int i=0; i<a.length; i++) {
			System.out.print(" | " + a[i]);
		}
		
		int nextIndex ;
		int prevIndex ;
		
		for ( nextIndex=1; nextIndex<a.length; nextIndex++) {
			int key = a[nextIndex];
			prevIndex = nextIndex-1;
			
			while ( (prevIndex >= 0) && ( a[prevIndex] > key) ) {
				a[prevIndex+1] = a[prevIndex] ;
				prevIndex = prevIndex -1;				
			}		
			
			a[prevIndex+1] = key;			
		}	
		
		System.out.println("\n \n Sorted elements are...."   );
		for ( int i=0; i<a.length; i++) {
			System.out.print(" | " + a[i]);
		}
	}
	
	

	public static void main(String[] args) {
		
		int[] b = { 3, 7 ,1, 0, 8, 89, 23, 70, 12 };
		
		InsertionSort insertionSort = new InsertionSort();
		
		insertionSort.insertionSort(b);
		
	}

}
