package com.commons.string;

public class StringHasAllUniqueChar {

	public static boolean isUniqueChars2(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);			
			if (char_set[val]) return false;
			char_set[val] = true;			
		 }
		return true;
	}

	public static void main(String[] args) {
		//StringHasAllUniqueChar obj = new StringHasAllUniqueChar();
		System.out.println(isUniqueChars2("rohani"));
		
	}

}
