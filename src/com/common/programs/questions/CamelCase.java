/**
 * 
 */
package com.rohini.common.questions;

import java.util.StringTokenizer;

/**
 * @author rohini
 *
 */
public class CamelCase {

	/**
	 * @param args
	 */
	
	/*
	 * 	Write a program to return the camel case for a given string. 
		Ex:- "string_domain_system", output → "StringDomainSystem"
	 */
	
	public static String camelCase(String str){
		
		StringTokenizer token= new StringTokenizer(str,"_");
		
		StringBuffer buffer = new StringBuffer();
		
		while(token.hasMoreTokens()){
			String subString = token.nextToken();
			char[] ary = subString.toCharArray();
			ary[0] = Character.toUpperCase(ary[0]);
			
			String camelCaseStr = ary.toString();
			System.out.println(camelCaseStr);

			
			buffer.append(camelCaseStr);
			
		}
		
		//System.out.println(buffer);
		
		String finalString = buffer.toString();
		
		return finalString;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(camelCase("string_domain_system"));

	}

}
