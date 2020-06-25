/**
 * 
 */
package com.rohini.common.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rohini
 *
 */
public class LongestConsecutiveSubsequence {

	/**
	 * @param args
	 */

	/*
	 * Given an array of integers, find the length of the longest sub-sequence,
	 * such that elements in the subsequence are consecutive integers, the
	 * consecutive numbers can be in any order.
	 * 
	 * Examples:
	 * 
	 * Input: arr[] = {1, 9, 3, 10, 4, 20, 2} Output: 4 Explanation: The
	 * subsequence 1, 3, 4, 2 is the longest subsequence of consecutive elements
	 * 
	 * Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42} Output: 5
	 * Explanation: The subsequence 36, 35, 33, 34, 32 is the longest
	 * subsequence of consecutive elements.
	 */

	public static int longestSubsequence(int[] ary) {

		if (ary.length == 0)
			return -1;
		if (ary.length == 1)
			return ary[0];

		// Using - HashSet - O(n) time complexity.
		Set<Integer> num_set = new HashSet<Integer>();
		for (int num : ary) {
			num_set.add(num);
		}

		int longestSequence = 0;

		for (int num : num_set) {
			if ( ! num_set.contains(num - 1)) {
				int currentNum = num;
				int currentSequence = 1;

				while (num_set.contains(currentNum + 1)) {
					currentNum += 1;
					currentSequence += 1;
				}

				longestSequence = Math.max(longestSequence, currentSequence);
			}
		}
		
		System.out.println(num_set);

		return longestSequence;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
		System.out.println(longestSubsequence(arr));

	}

}
