package com.commons.string;

public class ReplaceAllCharBy {

	public void replaceCharBy(String  givenStr) {
		//char[] str = givenStr.toCharArray();
		
		int spaceCount = 0;
		int len = givenStr.length();
		int newLength;
		
		for(int i=0; i<len; i++) {
			if(givenStr.charAt(i)==' ' ){
				spaceCount++;
			} 
		}
		
		newLength = len + spaceCount*2;
		char[] str = new char[newLength];
		
		int j=0;		
		for(int k=0; k<newLength ; k++) {
			if(givenStr.charAt(k)==' '){
				str[j] ='%';
				str[j+1]='2';
				str[j+2]='0';
				j=j+3;
			}else{
				str[j]=givenStr.charAt(k);
				j++;
			}			
		}		
	}

	public static void main(String[] args) {
		
		ReplaceAllCharBy obj = new ReplaceAllCharBy();
		
		
		obj.replaceCharBy("rohini kumari");

	}

}
