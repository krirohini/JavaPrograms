/**
 * 
 */
package com.common.programs.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author rohini
 *
 */
public class FrequentElements {

	/**
	 * @param args
	 */

	/*
	 * Given a non-empty array of integers, return the k most frequent elements.
	 * Example 1: Input: nums = [1,1,1,2,2,3], k = 2 Output: [1,2]
	 * 
	 * Example 2: Input: nums = [1], k = 1 Output: [1]
	 * 
	 */

	public static Set<Integer> mostFrequentElements(int[] givenAry) {

		Map<Integer, Integer> map = null;

		Set<Integer> set = new HashSet<Integer>();

		if (givenAry.length == 1) {
			set.add(givenAry[0]);
			return set;
		} else {
			map = new HashMap<Integer, Integer>();
			for (int i = 0; i < givenAry.length; i++) {
				if(!map.containsKey(givenAry[i])){
					map.put(givenAry[i], 1);
				}else{
					 map.put(givenAry[i], map.get(givenAry[i] + 1));
					 set.add(givenAry[i]);
				}

			}
		}
		
		return set;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,2,2,3,5,5,8,8,9,0,0,1};
		//int[] nums = {1};
		
		System.out.println(mostFrequentElements(nums));
	}

}
