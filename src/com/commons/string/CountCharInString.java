package com.commons.string;

import java.util.HashMap;
import java.util.Map;

public class CountCharInString {

	public String temp = "";
	public int count = 1;
	public char tempChar;
	
	// We can use HashMap
	
	public String countChar(String str){
		
		if(str.length()==0){
			throw new StringIndexOutOfBoundsException();
		}else if(str.length()==1){
			return str+1;
		}else {
			tempChar = str.charAt(0);
			int sameCount=1;
			int diffCount=1;
			//count++;
			for (int i=1; i<str.length(); ++i){
				if(tempChar == str.charAt(i)){
					sameCount++;
					tempChar = str.charAt(i);						
				}else if(tempChar != str.charAt(i)){
						//count = 1;
						//					
						tempChar = str.charAt(i);
						temp = temp + str.charAt(i) + diffCount;
						//temp = temp + str.charAt(i) + count;
					}
				else {
					sameCount=1;
				}
				
				//tempChar = str.charAt(i);
				//else{
					temp = temp + str.charAt(i) + sameCount;
				//}
				//sameCount = 1;
			}			
			return temp;
		}
	}
		
		public void characterCount(String inputString) {
	        //Creating a HashMap containing char as a key and occurrences as  a value
	 
	       Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	 
	        //Converting given string to char array
	 
	        char[] strArray = inputString.toCharArray();
	 
	        //checking each char of strArray
	 
	        for (char c : strArray)
	        {
	            if(charCountMap.containsKey(c))
	            {
	                //If char is present in charCountMap, incrementing it's count by 1
	 
	                charCountMap.put(c, charCountMap.get(c)+1);
	            }
	            else
	            {
	                //If char is not present in charCountMap,
	                //putting this char to charCountMap with 1 as it's value
	 
	                charCountMap.put(c, 1);
	            }
	        }
	 
	        //Printing the charCountMap
	 
	        System.out.println(charCountMap);
	    }

	
	
	public static void main(String[] args) {

		CountCharInString obj = new CountCharInString();
		System.out.println(obj.countChar("aabbccsss"));
		
	}

}
