/**
 * 
 */
package com.rohini.common.questions;

/**
 * @author rohini
 *
 */
public class MaintainInsertionOrder {

	/**
	 * @param args
	 */
	
	/*
	 * Write a program to print the character and 
	 * number of times of the character in a given string.
	 * 
	 * Ex:
	 * Input	:- aabbccaadcc
	 * Output	:- a2b2c2a2d1c2
	 * 
	 * Input	:- aabbbcccaadccdddd
	 * Output	:- a2b3c3a2d1c2d4
	 * 
	 */

	public static String charAndCount(String str) {

		StringBuffer buffer = new StringBuffer();

		int count = 1;
		int i = 1;

		while (i < str.length()) {
			char prevChar = str.charAt(i - 1);
			if (prevChar == str.charAt(i)) {
				count++;
			} else {
				buffer.append(prevChar);
				buffer.append(String.valueOf(count));
				count = 1;
			}
			
			i++;

			if (i == str.length()) {
				buffer.append(prevChar);
				buffer.append(String.valueOf(count));
			}

		}

		return buffer.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(charAndCount("aabbccaadcc"));
		 System.out.println(charAndCount("aabbbcccaadccdddd"));

	}

}
