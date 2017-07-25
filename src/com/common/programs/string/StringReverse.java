package com.commons.string;

public class StringReverse {

	public String reverse;

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
		String myString = "";
		if (str.length() == 0) {
			return null;
		} else {
			for (int i = str.length() - 1; i >= 0; i--) {
				myString = myString + str.charAt(i);
			}
		}
		return myString;
	}

	public static void main(String[] args) {
		StringReverse obj = new StringReverse();
		// System.out.println("String Reverse by Indexing ... " +
		// obj.revString("Rohini"));
		// System.out.println("String Reverse by Recursion ... " +
		// obj.reverseStrRecursive("Rohini"));
		System.out.println("String Reverse by Swapping  the Character ...  " + obj.reverseStringBySwap("Rohini"));

	}

}
