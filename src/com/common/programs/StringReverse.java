/**
 * 
 */
package com.common.programs;

/**
 * @author rohini
 *
 */
public class StringReverse {
	
	public static String reverseString(String str){
		char [] arr = str.toCharArray();
		int start = 0 ;
		int end = str.length()-1;
		
		while(start <= end){
			arr[start++] = arr[end--];
		}
		String ret = new String(arr);
		return ret;
		//return str;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("abcd"));
	}

}
