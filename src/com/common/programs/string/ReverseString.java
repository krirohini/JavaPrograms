package com.commons.string;

public class ReverseString {

	public String revString(String str) {
		String myString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			myString = myString + str.charAt(i);
		}
		// System.out.println(myString);
		return myString;
	}

	public String revStringRecursive(String str) {
		String myString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			myString = myString + str.charAt(i) + revStringRecursive(myString);
		}
		// System.out.println(myString);
		return myString;
	}

	// write a program for the given string "CABBAGE" the result will be
	// "EGABCAB"
	public static String halfReverse(String str) {

		char[] charAry = str.toCharArray();
		char[] charAry2 = str.toCharArray();

		int midIndex = str.length() / 2;

		int j = str.length() - 1;
		int a = 0;
		while (j > midIndex) {
			charAry[a] = charAry[j];
			a++;
			j--;
		}

		int k = midIndex + 1;
		int b = 0;
		while (k < str.length()) {
			charAry[k] = charAry2[b];
			++b;
			++k;
		}

		String output = String.valueOf(charAry);

		return output;
	}

	// String Reverse by swapping the characters, this is the nice solution.
	public String reverseStringBySwap(String str) {
		char[] charAry = str.toCharArray();
		int i = 0;
		int j = charAry.length - 1;

		if (str.length() == 0) {
			return null;
		}
		if (str.length() == 1) {
			return str;
		} else {

			for (; i < j; i++, j--) {
				char temp = charAry[i];
				charAry[i] = charAry[j];
				charAry[j] = temp;
			}
		}
		String reverse = new String(charAry);
		return reverse;
	}
	
	// write code for this .. Input:WALMART   Output:LAWMTAR 
	public static String halfAndHalfReverse(String str){
		char[] charAry = str.toCharArray();
		
		int startIndex = 0;
		int endIndex = str.length()-1;
		int midIndex = str.length()/2;
		
		int i = midIndex -1;
		
		for( ; startIndex <= i ; startIndex++, i--){
			char temp = charAry[startIndex];
			charAry[startIndex] = charAry[i];
			charAry[i] = temp;
		}
		
		int j = midIndex +1;
		for( ; j <= endIndex; j++, endIndex--){
			char temp = charAry[j];
			charAry[j] = charAry[endIndex];
			charAry[endIndex] = temp;
		}
		
		String output = new String(charAry);
		
		return output;
	}

	public static void main(String[] args) {

		/*
		 * String s = "Rohini Kumari";
		 * 
		 * ReverseString r = new ReverseString();
		 * 
		 * System.out.print("String is ...."); System.out.println(s);
		 * 
		 * System.out.print("Non recursive .......  ");
		 * System.out.println(r.revString(s));
		 * 
		 * System.out.println("================");
		 * System.out.print("Recursive .......  ");
		 * System.out.println(r.revString(s));
		 */

		//System.out.println(halfReverse("CABBAGE"));
		System.out.println(halfAndHalfReverse("WALMART"));
	}

}
