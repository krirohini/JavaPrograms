package com.commons.string;

public class NonReducibleFormString {
	
	//Super Reduced String
	//https://www.hackerrank.com/challenges/reduced-string
	
	public String nonReducible(String str){
		if(str.length()==0){
			throw new StringIndexOutOfBoundsException();
		}
		String test="";
		for(int i=0 ; i<str.length(); i++){
			for(int k=1; k<str.length()-1; k++){
				if(str.charAt(i)==str.charAt(k)){
					test = test + str.charAt(i); 
							//str.substring(k, str.length()); 
				}else {
					test = test + str.charAt(k);
							//str.substring(i, str.length());
				}
			}
		}
		
		return test;
	}

	public static void main(String[] args) {
		NonReducibleFormString obj = new NonReducibleFormString();
		System.out.println(obj.nonReducible("aab"));
	}

}
