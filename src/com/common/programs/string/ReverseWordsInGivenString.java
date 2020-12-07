package com.rohini.string;

import java.util.StringTokenizer;

public class ReverseWordsInGivenString {
	
	/*
	 * Given a string, you need to reverse the order of characters in each word 
	 * within a sentence while still preserving whitespace and initial word order.

		Example 1:
		Input: "Let's take LeetCode contest"
		Output: "s'teL ekat edoCteeL tsetnoc"
	 */
	

	public static String reverseWords(String s) {
		System.out.println("\nGiven Word \n" + s );
		StringBuilder builder = new StringBuilder();
		
		
		int len = s.length();
		if(len == 1) {
			return s;
		}else if(s.equals(null)) {
			return null;
		}else {
			StringTokenizer token = new StringTokenizer(s, " ");
			while(token.hasMoreElements()) {
				String curString = token.nextToken();
				//System.out.println(curString);
				builder.append(reverse(curString));
				if(token.hasMoreTokens()) {
					builder.append(" ");
				}
			}
		}
		
		

		return builder.toString();
	}

	public static String reverse(String str) {
		char[] charAry = str.toCharArray();
		if(str.length()==0) {
			return null;
		}else if(str.length()==1) {
			return str;
		}else {
			int len = str.length();
			
			
			for(int i=0, j=len-1; i<=len/2 && j>=len/2; i++, j--){
				
				char ch = charAry[i];
				charAry[i] = charAry[j];
				charAry[j] = ch;
		
			}
			
		}
		
		String reversedStr = String.valueOf(charAry);
		
		return reversedStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("reverse: " + reverse("Rohini"));
		System.out.println("reverseWords.." + reverseWords("Let's take") + "..");
		System.out.println("reverseWords.." + reverseWords("Let's take LeetCode contest") + "..");

	}

}
