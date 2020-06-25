/**
 * 
 */
package com.rohini.common.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author rohini
 *
 */
public class GroupAnagrams {

	/**
	 * @param args
	 */
	/*
	 * 	Given an array of strings, group anagrams together.
		Example:
			Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
			Output:
					[
					  ["ate","eat","tea"],
					  ["nat","tan"],
					  ["bat"]
					]
	 */
	
	public static String sortString(String givenString){
		char[] chars = givenString.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
        return  sorted;
	}
	
	public static List<List<String>> listOfGroupAnagrams(String[] givenStringAry){
		
		List<List<String>> finalList = new ArrayList<List<String>>();
		
		Map<String, List<String>> sortedWordAndAnagrams = new HashMap<String, List<String>>();
		
		List<String> listOfStrings = null;

		for(int i=0; i<givenStringAry.length; i++){
			
			String currentString = givenStringAry[i];
			String sortedString = sortString(givenStringAry[i]);
			
			if(sortedWordAndAnagrams.containsKey(sortedString)){
				sortedWordAndAnagrams.get(sortedString).add(currentString);	
			}else{
				listOfStrings = new ArrayList<String>();
				listOfStrings.add(currentString);
				sortedWordAndAnagrams.put(sortedString, listOfStrings);
			}
		}
		
		finalList.addAll(sortedWordAndAnagrams.values());		
		return finalList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words= {"eat", "tea", "ate", "nat", "tan", "bat", "tab" };
		   
	    System.out.println(listOfGroupAnagrams(words));

	}

}
