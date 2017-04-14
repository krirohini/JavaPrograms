/**
 * 
 */
package com.commons.string;

/**
 * @author rohini
 *
 */
public class StringReverse {

	public String reverse;

	// String Reverse by Recursion
	public String reverseStrRecursive(String str) {
		if (str.length() == 0) {
			return null;
		} else if (str.length() == 1) {
			return str;
		} else {
			reverse = str.charAt(str.length() - 1) + reverseStrRecursive(str.substring(0, str.length() - 1));
		}
		return reverse;
	}

	// String Reverse By Indexing
	public String revString(String str) {
		String myString="";
		if(str.length()==0){
			return null;
		}else{ 
			for(int i=str.length()-1; i>=0; i--) {
				myString = myString + str.charAt(i);
			}
		}
		return myString;
	}

	public static void main(String[] args) {
		StringReverse obj = new StringReverse();
		System.out.println("String Reverse by Indexing ...  " + obj.revString("Rohini"));
		System.out.println("String Reverse by Recursion ...  " + obj.reverseStrRecursive("Rohini"));

	}

}
