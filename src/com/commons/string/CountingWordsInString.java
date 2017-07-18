/**
 * 
 */
package com.commons.string;

import java.util.StringTokenizer;

/** To Count the number of words
 * In a given string
 */
public class CountingWordsInString {

	//Using StringTokenizer
	public void getStringAndWordCountUsingStringTokenizer(String str) {		
		System.out.println("Given String is .."+str);
		int count=0;
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		while(st.hasMoreElements()){
			System.out.print(st.nextElement() + " | ");
			count++;
		}		
		System.out.println("\nTotal word count is .. " +count);		
	}
	
	//Using For Loop
	public int getWordCount(String str) {
		int wordCount = 0;
		if(str.charAt(0)!=' ' ){
			wordCount++;
		} 						
			for(int i = 1; i<str.length(); i++){
				if(str.charAt(i)!=' ' && str.charAt(i-1)== ' '){
					wordCount ++;
				}
			}
				/*if(str.charAt(i)== '\0'){
					wordCount ++;
				}*/
						
		return wordCount;
	}
	
	public static void main(String[] args) {
		CountingWordsInString word = new CountingWordsInString();
		word.getStringAndWordCountUsingStringTokenizer(" My name is rohini");
		//System.out.println(word.getWordCount(" My name is rohini kumari   "));

	}

}
