package com.common.programs;

//Run Length Encoding
//Given an input string, write a function that returns the Run Length Encoded string for the input string.
//For example, if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.

public class RunLengthEncoding {	
	
	public String letterCountString(String str) {
	
		String encoding = "";
			
		for (int k = 0; k < str.length(); k++) {
			int count = 1;
			char ch = str.charAt(k);
			int i = str.length() - 1;
			if (k == i ) {
				return encoding;
			} 
//			else if (str.substring(k, i).equalsIgnoreCase(encoding)) {
//				
//			} if(ch!=encoding.charAt(i)) {
			//encoding.
			else {			
				for (; i > k; i--) {					
					char chExit = str.charAt(i);
					if (ch == chExit) {
						++count;
					}				
				}
			}
			encoding = encoding + ch + String.valueOf(count);
			
		}
		return encoding;
	}

	public static void main(String[] args) {
		
		RunLengthEncoding runLengthEncoding = new RunLengthEncoding();		
		String myString="rohinii";		
		System.out.println(myString);		
		System.out.println(runLengthEncoding.letterCountString(myString));				
	}

}
