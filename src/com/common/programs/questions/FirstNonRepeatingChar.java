/**
 * 
 */
package com.rohini.common.questions;

import java.util.Stack;

/**
 * @author rohini
 *
 */
public class FirstNonRepeatingChar {

	/**
	 * @param args
	 */
	
	/*
	 * Given a string, find its first non-repeating character
	 */

	public static char firstNonRepeating(String givenString) {
		int len = givenString.length();
		if (len == 1)
			return givenString.charAt(0);

		boolean repeat = false;

		Stack<Character> stack = new Stack<>();

		int i = 0;
		char currentChar = ' ';
		while (i < len) {
			currentChar = givenString.charAt(i);
			if (stack.isEmpty()) {
				stack.push(currentChar);
				i++;
			} else if (stack.peek() == currentChar) {
				repeat = true;
				i++;
			} else if (stack.peek() != currentChar) {
				if (repeat == true) {
					stack.pop();
					stack.push(currentChar);
					repeat = false;
					i++;
				}else{
					return stack.peek();
				}
			} else {
				i++;
			}
			
		}

		return currentChar;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(firstNonRepeating("aaabbccddeef"));
		//System.out.println(firstNonRepeating("a"));
		//System.out.println(firstNonRepeating("aa"));

	}

}
