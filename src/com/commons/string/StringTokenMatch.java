/**
 * 
 */
package com.commons.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokenMatch {
	
	public void getStringAndPrintStringTokenizer(String str) {		
		System.out.println(str);
		int count=0;
		
		StringTokenizer st = new StringTokenizer(str);
		
		while(st.hasMoreElements()){
			System.out.println(st.nextElement());
			count++;
		}
		
		System.out.println(count);
		StringTokenizer sta_z = new StringTokenizer(str,"@");
		while(sta_z.hasMoreElements()){
			System.out.println(sta_z.nextElement());
		}		
	}
	
	public void getStringAndPrintRegrexRe(String str) {
		String regex = "^[A-Za-z !,?._'@]$";
		int count = 0;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		
		// using Matcher find(), group(), start() and end() methods
				while (matcher.find()) {					
					System.out.println("Found the text \" + matcher.group()"
							+ "\b starting at " + matcher.start()
							+ " index and ending at index " + matcher.end());
				}
			
				// using Pattern split() method
				pattern = Pattern.compile("\\W");
				String[] words = pattern.split(str);
				for (String s : words) {
					count++;					
				}
				System.out.println("Number of words are .."+count);
				for (String s : words) {
					System.out.println(s);
				}
	}
	
	//Using StringBuffer 
	public void getStringAndPrint(String str){
		int count = 0;
		for(int k=0; k<str.length(); k++ ){
			if(str.charAt(k) == ' ' || str.charAt(k) == '\n'){
				++count;
			}
		}
		
		System.out.println("Number of words in a given string are :  " + count);
		StringBuffer stringBuffer = new StringBuffer();
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == ' ' || 
			   str.charAt(i) == '\n' ||
			   str.charAt(i) == '@' ||
			   str.charAt(i) == '.' ||
			   str.charAt(i) == '_' ||
			   str.charAt(i) == '!' ||
			   str.charAt(i) == '?' ||
			   str.charAt(i) == ',' ||
			   str.charAt(i) == '/') {
				
				System.out.println(stringBuffer.toString());
				stringBuffer = new StringBuffer();
			}else {
				stringBuffer.append(str.charAt(i));
			}
		}
		System.out.println(stringBuffer.toString());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		String givenString = "My name is Rohini Kumari. My email address is krirohini@gmail.com";
		StringTokenMatch pattern = new StringTokenMatch();
				
		//pattern.getStringAndPrint(givenString);
		pattern.getStringAndPrintRegrexRe(givenString);
	}

}
