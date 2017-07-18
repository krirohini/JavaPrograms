package com.common.programs.array;

import java.util.HashSet;

public class LongestConsequetiveSubsequence {

	/*
	 * 1. Create a hashset and Insert all array elements to hashset. 2. Do
	 * following for every element arr[i]
	 * 
	 * # Check if this element is the starting point of a subsequence. To check
	 * this, we simply look for arr[i] - 1 in hash, if not found, then this is
	 * the first element of the subsequence.
	 * 
	 * # If this element is a first element, then count number of consecutive
	 * elements starting with this element.
	 * 
	 * # If count is more than current length, then update max length.
	 */

	public int subsequence(int[] ary) {

		HashSet<Integer> set = new HashSet<Integer>();
		int maxLength = 0;
		for (int i = 0; i < ary.length; i++) {
			set.add(ary[i]);
		}

		// check each possible sequence from the start then update optimal
		// maxLength
		for (int i = 0; i < ary.length; ++i) {
			// check if current element is the starting element of a sequence.
			// i.e check num-1 is not present, if not present then num is
			// starting element
			int num = ary[i];
			if (!set.contains(num - 1)) {

				// If num is starting element in sequence then only check for
				// next elements in the sequence
				int j = num;
				while (set.contains(j)) {
					j++;
				}

				// update optimal maxLength if this length is more
				if (maxLength < j - num) {
					maxLength = j - num;
				}
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestConsequetiveSubsequence obj = new LongestConsequetiveSubsequence();

		int[] numbers = { 100, 4, 200, 1, 2, 3 };
		
		int len = obj.subsequence(numbers);
		System.out.println("Longest Subsequence length:  " + len);

	}

}
