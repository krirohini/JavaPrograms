package com.rohini.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FirstUniqChar {
	
	/*
	 * Given a string, find the first non-repeating character in it 
	 * and return its index. 
	 * If it doesn't exist, return -1.

		Examples:
		s = "leetcode"
		return 0.
		
		s = "loveleetcode"
		return 2.
	 */

	public static int firstUniqChar(String s) {

		if (s.length() == 1) {
			return 0;
		}

		HashMap<Character, Integer> set = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (!set.containsKey(current)) {
				set.put(current, i);
			} else {
				set.put(current, -1);
			}
		}

		List<Integer> sortedIndex = new ArrayList<Integer>(set.values());
		Collections.sort(sortedIndex);

		for (int i = 0; i < sortedIndex.size(); i++) {
			int current = sortedIndex.get(i);

			if (current < 0) {
				if (i == sortedIndex.size() - 1) {
					return -1;
				} else {
					continue;
				}
			} else if (current == 0) {
				return 0;
			} else {
				return current;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("firstUniqChar at : " + firstUniqChar("loveleetcode"));
		System.out.println("firstUniqChar at : " + firstUniqChar("leetcode"));
	}

}
