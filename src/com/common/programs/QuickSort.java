package com.common.programs;

public class QuickSort {	
	
	public int PARTITION(int a[], int p, int r) {
		int pivot = a[p];		
//		int pivot = a[a.length -1];
		int i = -1 ;
		int temp;
		int position = 0 ;
		for ( int j=0; j < r; j++) {
			if ( a[j]<pivot ) {
				i = i+1 ;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}			
		}		
		position = a[i+1];		
		a[i+1] = pivot;
		
		if(r!=0) {
			a[--r] = position;
		}
		
		/*for ( int k=0; k<r ; k++ ) {
			System.out.print("  "+ a[k]);
		}*/
		return i+1;
	}
	
	
	public void QUICKSORT (int a[], int p, int r) {
		int q = PARTITION(a, p, r);
		
		if (p<r) {			
			QUICKSORT(a, p, q);
			QUICKSORT(a, q+1, r);
		}else {
			System.out.println("Invalid Entry");
		}
	}
	
	public void printArray (int a[], int p, int r) {
		for ( int index =0; index <r; index ++ ) {
			System.out.print(" " + a[index]);
		}
	}
	

	public static void main(String[] args) {
		int b[] = { 23, 56, 4, 7, 9, 26, 47, 38, 21, 20, 15, 29, 33, 55, 11, 27 };

		QuickSort sort = new QuickSort();
		System.out.println("The sorted array is .....\n");
		sort.QUICKSORT(b, 0, b.length);
		
		sort.printArray(b, 0, b.length);
	}

}
