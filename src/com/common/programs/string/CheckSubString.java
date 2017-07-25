package com.commons.string;

public class CheckSubString {

	public boolean isSubString(String givenStr, String givenSubStr) {
		int strLen = givenStr.length();
		int subStrLen = givenSubStr.length();
		for (int i = 0; i < strLen-subStrLen; i++) {
			int j = i+subStrLen - 1;
			String sub=givenStr.substring(i,j+1);
			if (sub.equals(givenSubStr)) {
				System.out.println("YES  ..." +givenSubStr + "... is the substring of .... " + givenStr); 
				break;
			} /*else {
				System.out.println("NO"); // continue;
			}*/
		}
		return true;
	}

	public static void main(String[] args) {
		String str1 = new String("This is a test program to check a substring");
		String str2 = new String("test");
		CheckSubString chk = new CheckSubString();
		//boolean isSub;
		System.out.println(chk.isSubString(str1, str2));
	}

}
