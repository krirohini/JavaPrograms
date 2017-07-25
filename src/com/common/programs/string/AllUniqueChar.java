package com.commons.string;

public class AllUniqueChar {

	public static boolean allUniqueCharsInString(String str){
		
		boolean[] char_set  = new boolean[256];	
		
		for(int i=0; i<str.length(); i++){
			int ascii_val = str.charAt(i);			
			if(char_set[ascii_val]) return false;
			char_set[ascii_val] = true;
		}		
		return true;
	}
	
	public static void main(String[] args) {
		
		//AllUniqueChar obj = new AllUniqueChar();
		System.out.println(allUniqueCharsInString("Rohini"));

	}

}
