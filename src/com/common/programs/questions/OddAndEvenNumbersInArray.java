/**
 * 
 */
package com.rohini.common.questions;

/**
 * @author rohini
 *
 */
public class OddAndEvenNumbersInArray {

	/**
	 * @param args
	 */
	
	public static int[] placeOddAndEven(int[] a){
		
		int currentIndex = 0;
		for(int i=1; i<a.length; i++){
			if(a[currentIndex] %2 != 0 && a[i] %2 == 0){
				int temp = a[currentIndex];
				a[currentIndex] = a[i];
				a[i] = temp;
				currentIndex ++;
				
			}
		}
		return a;
	}
	
	public static void printArray(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print("\t" + a[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a  = {3,2,5,7,6,1,4};
		printArray(placeOddAndEven(a));
	}

}
