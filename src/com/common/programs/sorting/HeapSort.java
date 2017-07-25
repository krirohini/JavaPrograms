package com.common.sorting;

public class HeapSort {	
	
	public static int heapSize ;	
	
	public void MAX_HEAPIFY (int a[]) {		
		int left = 0 ;
		int right = 0 ;				
		int temp =0;		
		for ( int k=0; k < heapSize/2 ; k++ ) {			
			left = 2*k + 1;
			right = 2*k + 2  ;				
			if ( left< heapSize) {
				if(a[k] < a[left]){
					temp = a[k];
					a[k] = a[left];
					a[left] = temp;
				}
			}			
			if (  right<heapSize ) {
				if(a[k] < a[right]) {
					temp = a[k];
					a[k] = a[right];
					a[right] = temp;
				}
			}				
		}		
		do {
			int heapify = a[0];			
			a[0] = a[heapSize-1];
			a[heapSize-1] = heapify;
			System.out.print("   "+ heapify);
			heapSize--;
		} while (heapSize==1);		
	}	
	
	public void BUILD_MAX_HEAP (int a[]) {		
		for ( int i = heapSize; i >= 0 ; i-- ) {
			do {
				MAX_HEAPIFY(a);
			} while ( i <= 1) ;
		}
	}

	public void HEAP_SORT ( int a[] ) {		
		for ( int j = heapSize ; j>=1; j-- ) {
			do {
					MAX_HEAPIFY(a);
					BUILD_MAX_HEAP(a);
			} while (heapSize==1) ;
		}
	}
	
	public static void main(String[] args) {
		int b[] = { 23, 56, 4, 7, 34, 9, 0, 75 };
		heapSize=b.length;

		HeapSort sort = new HeapSort();
		System.out.println("The sorted array is .....\n");
		sort.HEAP_SORT(b);
	}
}
