/**
 * 
 */
package com.commons.string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * @author rohini
 *
 */
public class NonRepeatingCharLongestSubString {

	/**
	 * Write a Java program to find the longest substring 
	 * from a given string 
	 * which doesn’t contain any duplicate characters.
	 */
	
	public static String nonRepeatingLongestSubString(String givenString){
		
		StringTokenizer strToken = new StringTokenizer(givenString, " ");
		Map<Integer,String> map = new HashMap<Integer, String>();
		
		while(strToken.hasMoreTokens()){
			String currentStr = strToken.nextToken();
			int len =  currentStr.length();
			
			Map<Character, Integer> charMap = new HashMap<Character, Integer>();
			
			for(int i=0; i<len; i++){
				char ch = currentStr.charAt(i);
				if(!charMap.containsKey(currentStr.charAt(i))){
					charMap.put(ch, 1);
				}else{
					break;
				}
			}
			
			map.put(len, currentStr);
			
		}
		
		List<Integer> list = new ArrayList<Integer>(map.keySet());		
		Collections.sort(list);
		
		int largestKey =  list.get(list.size()-1);
		
		String longestsubString = map.get(largestKey);
		
		return longestsubString;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(nonRepeatingLongestSubString("My name is rohini and i live in sanjose ."));
	}

}
