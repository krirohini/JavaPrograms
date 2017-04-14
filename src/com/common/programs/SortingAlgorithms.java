package com.common.programs;

public class SortingAlgorithms {

	public void myInsertionSort (int a[], int n) {
		System.out.println("######################");
		int temp;
		int j;
		
		for (int i=1; i<n; i++) {				
			temp = a[i];
			j=i;
			while ( ( j>0 ) && ( a[j-1] > temp ) ) {				
					a[j] = a[j-1];
					j = j-1;
			}
			a[j] = temp;	
			System.out.println(a[j]);
		}		
	}	
	
	public void otherInserstionSort_1 ( int a[], int n) {
		System.out.println("/////////////////////");
		int temp = 0;
		for(int i=0; i<n-1; i++) {
			int j=i;
			while ((j>0) &&  (a[j-1] > temp)) {
				a[j] = a[j-1];
				j= j-1;
				a[j] = temp;
				System.out.println(+a[j]);
			}
//			System.out.println(a[j]);
			
		}
	}
	
	public void otherInsertionSort_2 (int a[], int n) {
		System.out.println("///////////////////");
		int key;
		int i;
		for (int j=2; j<=n; j++) {
			key = a[j];
			i= j-1;
			while ((i>0) && (a[i]> key)) {
				a[i+1] = a [i];
				i= i-1;
				
			}
			a[i+1] = key;
			System.out.println(a[i]);
			
		}
	}
	
	public static void main (String args[]) {
		
		SortingAlgorithms sa = new SortingAlgorithms();
		int[] b = { 3, 7 ,1, 0, 8 };
		
		System.out.println("Sorted elements are...."   );
		sa.myInsertionSort(b,5);
		sa.otherInsertionSort_2(b,5);
	}
}
