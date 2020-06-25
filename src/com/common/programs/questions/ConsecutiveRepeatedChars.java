/**
 * 
 */
package com.rohini.common.questions;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author rohini
 *
 */
public class ConsecutiveRepeatedChars {

	/**
	 * @param args
	 */
	
	/*
	 * 	Question: For a given string "abbbcddddeffabbbbbb", 
	 * 	return the characters who are consecutively repeated 
	 * 	like "bbb" and how many times it appears on the string.
		For example, return a HashMap like,
		b -> 2 Note: (bbb & bbbbbb)
		d -> 1
		f -> 1
	 */
	public static Map<Character, Integer> charsConsecutivelyRepeated(String givenString){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		Deque<Character> stack = new LinkedList<Character>();
		
		if(givenString.length()==0) return null;
		
		int len = givenString.length();
		
		int i=0;
		boolean flag = false;
		while(i<len){
			char current = givenString.charAt(i);
			
			char top;
			
			if(stack.isEmpty()){
				stack.push(current);
				i++;
			}else{
				top = stack.peek();
				if(top == current){
					flag=true;
					i++;
					//flag = true;
				}
				
				else if(top != current){
					if(flag==true){
						if(map.containsKey(top)){
							map.put(top, map.get(top)+1);
							
						}else{
							map.put(top, 1);
						}

						flag = false;
						i++;
					}else{
						stack.remove();
					}
				}else{
					i++;
				}
			}
		}
		
		return map;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(charsConsecutivelyRepeated("abbbcddddeffabbbbbb"));
		System.out.println(charsConsecutivelyRepeated("abbcbbccddddeffabbbbbb"));

	}

}
