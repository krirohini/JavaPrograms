package com.common.sorting;

public class MergeSortVikash {
	
	public void mergeSort ( int a[] ) {
		mSort(a, 0, a.length -1);
	}
	
	public void mSort ( int a[], int lowerBound, int upperBound ) {

		if ( lowerBound < upperBound ) {		
			int mid = (lowerBound+upperBound)/2 ;
			mSort (a, lowerBound, mid);
			mSort (a, mid+1, upperBound);
			merge (a, lowerBound, mid, upperBound);
		}
	}

	public void merge(int[] inputArray, int lowerBound, int mid, int upperBound) {

		int leftArraySize = mid -lowerBound +1;
		int rightArraySize = upperBound-mid +1;
		int n3 = mid+1;

		int[] left = new int[leftArraySize] ;			
		int[] right = new int[rightArraySize];
		int[] sortAraay = new int[leftArraySize+rightArraySize];
		
		for ( int i=0; i<leftArraySize; i++) {	left [i] = inputArray[i];		}
		
		for ( int j=0; j<rightArraySize; j++) {	right[j] = inputArray[n3+j];		}
		
		int i =0;
		int j =0;
		
		for ( int k=0; k< (left.length + right.length); k++) {			
			try {
				if ( (i<left.length)  && (j<right.length) ) {				
					int temp;
					if ( left[i] < right[j]) {
						inputArray[k] = left[i];
				
	//					sortAraay[k] = left[i];
						
						i = i+1;
						System.out.println(inputArray[k]);											
					} 
					else {
						inputArray[k] =  right[j];
						/*sortAraay[k] = right[j];*/
						temp = right[j];
						right[j] = left[i];
						left[i] = temp;
						j=j+1;
						
						System.out.println(inputArray[k]);						
					}
			}
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		} 		
	}
	
	/*public void mergeSort2 (int a[]) {
		int q ;
		if ( p < r ) {
			q = (p+r)/2;
			int q2 = q+1;
			mergeSort (a, p, q);
			mergeSort (a, q+1, r);
			merge (a, p, q, r);
			merge (a, p, q2, r);
		}
		
	}*/

	public static void main(String[] args) {
		
		int b[] = { 23, 56, 21, 7, 9, 26, 47, 38, 4 };
		
		MergeSortVikash m = new MergeSortVikash();
		System.out.println("The sorted array is .....\n");
		m.mergeSort(b);
		
	}

}
