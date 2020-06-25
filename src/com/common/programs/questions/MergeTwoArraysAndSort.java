/**
 * 
 */
package com.rohini.common.questions;

/**
 * @author rohini
 *
 */
public class MergeTwoArraysAndSort {

	/**
	 * @param args
	 */
	
	public static int[] mergeAndSortForTwoGivenArrays(int[] a, int b[]) {
		int[] mergedArrays = new int[a.length + b.length ];
		int[] sortArrays = new int[a.length + b.length ];
		
		if(a.length != 0 || b.length != 0) {
			int i = 0;
			int j = 0;
			
				while(i<a.length){
					mergedArrays[i] = a[i];
					//System.out.print(  i + "\t" + mergedArrays[i] +  "\n");
					i ++;
					if(i==a.length){
						j=i;
					}
				}
			
				for(int k=0; k<b.length; k++){
					mergedArrays[j] = b[k];
					//System.out.print(j + "\t" + mergedArrays[j] + "\n");

					j++;
					if(j == (a.length + b.length)){
						break;
					}
				}
		}

		sortArrays = sortArray(mergedArrays);
		
		return sortArrays;
		
		
	}
	
	public static int[] sortArray(int[] a){
		//int[] sortedArray = new int[a.length];
		
		for(int i=0; i<a.length-1; i++ ){
			for(int j=i+1; j<a.length; j++){
				if(a[i] > a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a;
		
	}
	
	public static void printArray(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + "\t");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayA = new int[] {7, -5, 3, 8, -4, 11, -19, 21};
        
        int[] arrayB = new int[] {6, 13, -7, 0, 11, -4, 3, -5};
        
        int[] sort = mergeAndSortForTwoGivenArrays(arrayA, arrayB);
        printArray(sort);

	}

}
