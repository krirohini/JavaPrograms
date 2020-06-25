package com.rohini.common.questions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindAllPairs {

	/*
	 * Given an array of integers, and a number ‘sum’, print all pairs in the
	 * array whose sum is equal to ‘sum’.
	 * 
	 * Examples : Input : arr[] = {1, 5, 7, -1, 5}, sum = 6 Output : (1, 5) (7,
	 * -1) (1, 5)
	 * 
	 * Input : arr[] = {2, 5, 17, -1}, sum = 7 Output : (2, 5)
	 */

	public static void allPairsOfGivenSum(int[] givenArray, int sum) {

		int len = givenArray.length;

		System.out.println("Given Sum ... " + sum);

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < len; i++) {
			int remain = sum - givenArray[i];
			
			// checking for condition 
            if (set.contains(remain)) { 
                System.out.println( 
                    "Pair with given sum "
                    + sum + " is (" + givenArray[i] 
                    + ", " + remain + ")"); 
            } 
            set.add(givenArray[i]); 	
		}
	}

	/*
	 * Given an array of integers, and a number ‘diff’, print all pairs in the
	 * array whose difference is equal to ‘diff’.
	 * 
	 * Examples : 
	 * Input : arr[] = {5, 9, -7, -3}, diff = 2 
	 * Output : (5, -3) (9,-7) 
	 */
	public static void allPairsOfGivenDifference(int[] givenArray, int diff) {

		int len = givenArray.length;

		System.out.println("Given Diff ... " + diff);

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < len; i++) {
			if (!set.contains(givenArray[i])) {
				set.add(givenArray[i]);
			}
		}

		System.out.print("Set .. ");

		for (Integer temp : set) {
			System.out.print(temp + "\t");
		}

		Iterator<Integer> iterate = set.iterator();
		while (iterate.hasNext()) {
			int current = iterate.next();
			int remain = diff - current;

			if (set.contains(remain)) {
				System.out.println("\n" + "Pair ... " + remain + " and " + current);
				System.out.print("--------------------------");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 6, 13, 5, 4, 3, 9, 0, 2, 2, 5, -1, 8 };
		int b[] = { 5, 9, -7, 2, -3, 0, 1 };
		allPairsOfGivenSum(a, 7);
		System.out.println("\n================================================== \n" );
		//allPairsOfGivenDifference(b, 2);

	}

}