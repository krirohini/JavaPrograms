/**
 * 
 */
package com.rohini.common.questions;

/**
 * @author rohini
 *
 */
public class SecondHighestInArray {

	/**
	 * @param args
	 */
	
	/*
	 * 
	 * Find Second Largest Number in an Array
	 * Ex:-
	 * Input:- int[] a = {10, 5, 9, -2, -1, 11, 7, 26, 3};
	 * Output:- 11
	 */
	
	public static int secondMax(int[] a){
		int max = a[0];
		int secondMax = a[0];

		for(int i=1; i<a.length; i++){
			if(max < a[i]){
				max = a[i];
			}
		}
		
		for(int i=1; i<a.length; i++){
			if(a[i] < max){
				if(a[i] > secondMax ){
					secondMax = a[i];
				}
			}
		}
		return secondMax;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10, 5, 9, -2, -1, 11, 7, 26, 3};
		
		System.out.println(secondMax(a));

	}

}
