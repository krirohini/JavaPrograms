	package com.commons.string;

import java.util.HashMap;
import java.util.Map;

/** Program to find 
 * the first NON REPEATING character 
 * in the given string
 */

public class FirstNonRepeatingChar {

	public void getFirstNonRepeatingChar(String givenString){
		Map<Character, Integer> map = new HashMap<>();
		if(givenString.length()==0){
			System.out.println("Empty String ... Try Again");
		}else {
			for(int i=0; i<givenString.length(); i++){
				char c = givenString.charAt(i);
				if( map.containsKey(c)) {
					int count = map.get(c)+1;
					map.put(c,count );	
				}else {
					map.put(c,1);
				}
			}
			
			for(int i=0; i < givenString.length(); i++ ){
				char thisChar = givenString.charAt(i);
				int cnt = map.get(thisChar);
				if(cnt == 1){
					System.out.println("First Non Repeating Chracter of the String.. "+givenString + " is ..." + thisChar);
					break;	
				}
			}			
		}
	}
	
	public static void main(String[] args) {
		FirstNonRepeatingChar obj = new FirstNonRepeatingChar();
		obj.getFirstNonRepeatingChar("ssress");
	}

}
