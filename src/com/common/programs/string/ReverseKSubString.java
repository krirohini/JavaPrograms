package com.rohini.string;

public class ReverseKSubString {

	
	/*
	 * 
	 * Given a string and an integer k, 
	 * you need to reverse the first k characters for every 2k characters counting from the start of the string. 
	 * If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
		Example:
		Input: s = "abcdefg", k = 2
		Output: "bacdfeg"
	 */
	public static String reverseStr(String s, int k) {
		System.out.println("Given String : " + s );

		StringBuilder builder = new StringBuilder();

		int i = 0;
		int j = 0;

		while (j < s.length()) {
			
			if(i == s.length()) {
				break;
			}

			if (!(j + k > s.length())) {
				String reverserSubString = reverse((s.substring(i, i + k)));
				builder.append(reverserSubString);
				//System.out.println(builder);
			}

			j = i + k;
			int index = j + k;

			if (index > s.length() && j > s.length()) {
				String subString = s.substring(j, s.length());
				builder.append(subString);
				//System.out.println(builder);
				break;

			} else if (index > s.length() && j < s.length() ) {

				String subString = s.substring(j, s.length());
				builder.append(subString);
				//System.out.println(builder);
				break;
			} else {
				String subString = s.substring(j, j + k);
				builder.append(subString);
			}

			//System.out.println(builder);

			//System.out.println("----------");

			i = i + 2 * k;

		}

		return builder.toString();
	}

	public static String reverse(String str) {
		int len = str.length();
		char[] charAry = str.toCharArray();
		if (len == 0) {
			return null;
		} else if (len == 1) {
			return str;
		} else {

			int i = 0;
			int j = len - 1;
			for (; i <= len / 2 && j >= len / 2; i++, j--) {
				char ch = charAry[i];
				charAry[i] = charAry[j];
				charAry[j] = ch;
			}
		}

		return String.valueOf(charAry);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("reverseStr: " + reverseStr("abcd", 2) + "\n");

		System.out.println("reverseStr: " + reverseStr("abcdefg", 2));

	}

}
