package com.rohini.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class NonRepeatingNumber {

	/*
	 * Given a non-empty array of integers nums, every element appears twice except
	 * for one. Find that single one.
	 * 
	 * Follow up: Could you implement a solution with a linear runtime complexity
	 * and without using extra memory?
	 * 
	 * Example 1: Input: nums = [2,2,1] Output: 1
	 * 
	 * Example 2: Input: nums = [4,1,2,1,2] Output: 4
	 * 
	 * Example 3: Input: nums = [1] Output: 1
	 */

	/* Without using extra memory - With Bit Manipulation */
	public static int singleNumberUsingBitManipulation(int[] nums) {
		int a = 0;
		for (int i : nums) {
			a ^= i;
		}
		return a;
	}
	
	/* Using extra memory - With HashMap */
	public static int singleNumberUsingHashMap(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		    }
		
		
		for ( Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry);
			if( entry.getValue() == 1) {
				
				return entry.getKey();
			}
		}
		return 0;
	}
	

	public static void main(String[] args) {

		int[] ary = { 1, 2, 3, 1, 3, 2, 4 };
		System.out.println("singleNumberUsingBitManipulation: " + singleNumberUsingBitManipulation(ary));
		System.out.println("singleNumberUsingHashMap: " + singleNumberUsingHashMap(ary));
	}

}
