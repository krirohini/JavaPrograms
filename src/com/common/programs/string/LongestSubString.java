/**
 * 
 */
package com.commons.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author rohini
 *
 */
public class LongestSubString {

	public List<String> longestString(String str) {
		System.out.println("Given String is ..  " + str);

		Map<Integer, List<String>> map = new HashMap<>();

		StringTokenizer st = new StringTokenizer(str, " ");

		while (st.hasMoreElements()) {
			String tempStr = (String) st.nextElement();
			int tempStrLength = tempStr.length();

			List<String> list = null;
			if (map.containsKey(tempStrLength)) {
				list = map.get(tempStrLength);
				if (null == list) {
					list = new ArrayList<>();
				}
				list.add(tempStr);
			} else {
				list = new ArrayList<>();
				list.add(tempStr);
				map.put(tempStrLength, list);
			}
		}
		
		Integer maxLen = 0;
		for (Integer val : map.keySet()) {
			if (val > maxLen) {
				maxLen = val;
			}
		}
		return map.get(maxLen);

	}

	/*
	 * public int findMax(int[] a) { 
	 * 		int max = a[0]; 
	 * 		for (int j = 1; j < size; j++) { 
	 * 			if (a[j] > max) { max = a[j]; } 
	 * 		} 
	 * return max; 
	 * }
	 */

	public static void main(String[] args) {

		LongestSubString obj = new LongestSubString();
		List<String> strList = obj.longestString("This is Rohi Kuma and I live in San Jose ");
		System.out.println("\n" + strList.toString());
	}

}
