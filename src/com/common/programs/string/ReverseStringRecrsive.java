package com.commons.string;

public class ReverseStringRecrsive {

	public String reverse = "";
	
	public String reverseString(String str) {
		if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
	}
	
	public static void main(String[] args) {

		String myString=args[0];
		System.out.println(myString);
		System.out.println("========");
		
		ReverseStringRecrsive reverseStringRecrsive = new ReverseStringRecrsive();
		System.out.println(reverseStringRecrsive.reverseString(myString));
	}
}
