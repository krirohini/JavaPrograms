package com.commons.string;

public class MakePalindrome {

	//private String givenString;
	
	public void palindrome(String str){
		if(str.length()==0){
			System.out.println("Empty String");
			//return null;
			throw new StringIndexOutOfBoundsException();
			//System.out.println();			
		}else{
			StringBuffer palin = new StringBuffer();
			for(int k=str.length()-1; k>0; k--){
				palin = palin.append(str.charAt(k));
			}
			palin = palin.append(str);
			System.out.println("Given String is ... " + str);
			System.out.println("Palindrom is ... " + palin);
		}
		
	}
	
	public static void main(String[] args) {
		MakePalindrome obj = new MakePalindrome();
		obj.palindrome("9993");
		
	}

}
