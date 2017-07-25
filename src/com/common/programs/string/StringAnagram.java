/**
 * 
 */
package com.commons.string;

import java.util.HashMap;
import java.util.Map;


public class StringAnagram {

	public Map<Character, Integer> charCounterA = new HashMap<Character, Integer>();
	public Map<Character, Integer> charCounterB = new HashMap<Character, Integer>();
    	
	public String checkAnagram(String A, String B) {
	
		int length = A.length();
		int counterA = 0;
		int counterB = 0;
		
		for(int i=0; i<length ; i++) {
			//charCounterA.put(key, value)
			charCounterA.put(A.charAt(i), counterA);
			/*if(charCounterA.containsKey(A.charAt(i))){
				charCounterA.containsKey(key)
			}*/
			counterA++;
			charCounterB.put(B.charAt(i), counterB);
			counterB++;
			
			/*if(charCounter.containsValue(B.charAt(i))){
				return "anagram";
			}*/
		}
		
		
		for(int k=0; k<length; k++)	{	
			if(charCounterA.containsKey(B.charAt(k))) {
				System.out.println(charCounterA.containsKey(B.charAt(k)));
				if (charCounterA.containsValue(charCounterB.containsValue(B.charAt(k)))) {
					System.out.println(charCounterA.containsValue(charCounterB.containsValue(B.charAt(k))));
					return "Anagram"; 
				}
				
			}else{
				//return "Not Anagram";
			}
		}
	
		
		return null;
		
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringAnagram stringAnagram = new StringAnagram();
		System.out.println(stringAnagram.checkAnagram("ro","or"));

	}

}
