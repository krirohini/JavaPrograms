package com.commons.string;

import java.util.StringTokenizer;

public class CalculateDifficultyOfSentence {

	public static boolean isVowel(char c){
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			return true;
		}
		return false;
	}
	
	public static int calculateDifficulty(String str){
		int hardWords = 0;
		int easyWords = 0;
		int countVowels = 0;
		int countConsonants = 0;
		int consecutiveConsonants = 0;		
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		while(st.hasMoreElements()) {
			String temp = (String) st.nextElement();			
			int i = 0;
			
			while( i <temp.length() -1 ){
				if( ! isVowel(temp.charAt(i))){
					consecutiveConsonants ++;
					i++;					
					if(! isVowel(temp.charAt(i))) {
						consecutiveConsonants ++;
						i++;
						if(! isVowel(temp.charAt(i))) {
							consecutiveConsonants ++;
							i++;
							if(! isVowel(temp.charAt(i))) {
								consecutiveConsonants ++;
								i++;
								consecutiveConsonants = 0;
							}
						}
					}
					
				}else if (isVowel(temp.charAt(i))){
					// if (isVowel(str.charAt(i)))
					countVowels ++;
				}else {
					countConsonants ++;
				}
				
				if(consecutiveConsonants == 4 || countVowels > countConsonants){
					hardWords ++;
				}else {
					easyWords ++;
				}
			}
			
			countVowels = 0;
			countConsonants = 0;
			consecutiveConsonants = 0;			
		}
		
		/*for(int i=0; i<str.length() -1 ; i++){
			if(isVowel(str.charAt(i))){
				if(countVowels)
			}
		}*/
		
		return ( 5 * hardWords + 3 * easyWords);
	}


	public static void main(String[] args) {

		String rohini = "This is Rohini";
		System.out.println(calculateDifficulty(rohini));
		
		
		
		
	}

}
