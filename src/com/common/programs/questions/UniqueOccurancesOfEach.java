/**
 * 
 */
package com.rohini.common.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author rohini
 *
 */
public class UniqueOccurancesOfEach {

	/**
	 * @param args
	 */
	
	/*
	 * Question: Given an array of integers array, 
	 * write a function that returns true, 
	 * if and only if the number of occurrences of each value in the array is unique.
		Input: arr = [1,2,2,1,1,3]
		Output: true
		
		Input: arr = [1,2,2,1]
		Output: false
	 * 
	 */

	public static boolean hasUniqueOccurance(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		boolean hasUnique = false;

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				int val = map.get(arr[i]) + 1;
				map.put(arr[i], val);
			}
		}

		Set<Integer> set = new HashSet<Integer>();
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			if (!set.contains(value)) {
				set.add(value);
				hasUnique = true;
			} else {
				hasUnique = false;
				break;
			}

		}

		return hasUnique;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 9, 9, 5, 5, 7 };
		int[] arr_2 = { 5, 9, 9, 5, 5, 7, 83, 83 };

		System.out.println(hasUniqueOccurance(arr));
		System.out.println(hasUniqueOccurance(arr_2));

	}

}
