package com.commons.string;

public class StringPalindrome {
	
	public boolean palindrome(String str) {
		int len = str.length();
		int mod = len%2;
		int i=0;
		int j=len-1;
		if(len == 0){
			System.out.println("Please enter a String");
		}else if (len == 1){
			System.out.println("Length of stirng is one; It is a palindrome");
			return true;
		}else if(mod == 1) {
			for(int k=0; k < len/2; k++) {
				if(str.charAt(k) == str.charAt(j)) {
					//i++;
					j--;
				}else return false;
			}return true;
		}else {
			for(int k=0; k < len/2; k++) {
				if(str.charAt(k) == str.charAt(j)) {
					//i++;
					j--;
				}else return false;
			}return true;
		}
		return false;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringPalindrome stringPalindrome = new StringPalindrome();
		System.out.println(stringPalindrome.palindrome("roor"));

	}

}
