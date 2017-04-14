package com.commons.string;

public class ReverseString {

	public String revString(String str) {
		String myString="";
		for(int i=str.length()-1; i>=0; i--) {
			myString = myString + str.charAt(i);
		}
		//System.out.println(myString);
		return myString;
	}
	
	public String revStringRecursive(String str) {
		String myString="";
		for(int i=str.length()-1; i>=0; i--) {
			myString = myString + str.charAt(i)+ revStringRecursive(myString);
		}
		//System.out.println(myString);
		return myString;
	}
	
	public static void main(String[] args) {
		
		String s = "Rohini Kumari";
		
		ReverseString  r = new ReverseString();
		
		System.out.print("String is ....");
		System.out.println(s);
		
		System.out.print("Non recursive .......  ");
		System.out.println(r.revString(s));
		
		System.out.println("================");
		System.out.print("Recursive .......  ");
		System.out.println(r.revString(s));
	}

}
