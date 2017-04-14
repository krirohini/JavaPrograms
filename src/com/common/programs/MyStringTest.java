package com.common.programs;

import java.util.Scanner;

public class MyStringTest {
	
	public  String compareTwoStringByChar(String str1, String str2) {
		//int count=0;
		int i=str1.length(); 
		int j=str2.length();
		if(str1.length() > str2.length()){
			for( ; i<str1.length(); i++){
				if(str1.charAt(i) > str2.charAt(j)){
					//System.out.println(str1.charAt(i));
					i++;
				}else {
					System.out.println(str2.charAt(i));
				}
			}
			//System.out.println(" .. is bigger than " +str2);
			return str1;
		}else {
			for( ; i<str2.length(); i++){
				if(str2.charAt(i) > str1.charAt(i)){
					System.out.println(str2.charAt(i));
				}else {
					System.out.println(str1.charAt(i));
				}
			}
			return str2;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println("Length of Both Strings is .."+(A.length()+B.length()));
        
        MyStringTest myStringTest = new MyStringTest();
        myStringTest.compareTwoStringByChar(A, B);
        
	}
}
