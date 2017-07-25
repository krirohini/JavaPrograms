package com.commons.string;

public class StringCompareLexicographically {
	
	
	public void subString(String givenString, int len) {		
		int k = len;		
		for(int i=0; i<givenString.length(); i++){
			if(k>givenString.length()){
				break;
			}
			System.out.println(givenString.substring(i,k));
			++k;	
		}			
	}

	public static void main(String[] args) {
		
		StringCompareLexicographically obj = new StringCompareLexicographically();
		obj.subString("Rohini",3);
	}

}
