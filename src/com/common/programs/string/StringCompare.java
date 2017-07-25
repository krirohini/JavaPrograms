package com.commons.string;

import java.util.Scanner;

public class StringCompare {

	public boolean strCmpr(String s1, String s2){
		boolean equal = false;
		if(s1.length()== s2.length()) {
			int len=0; 
			while(len<s1.length()){
				if(s1.charAt(len)==s2.charAt(len)){
					len++;
					equal=true;
				}else {
					equal=false;
					break;
				}	
			}
		} else return false;	
		return equal;
	}
	
	
	public static void main(String[] args) {
	
		/*String str1 = "Rohini";
		String str2 = "rohinikumari";
		String str3 = "Rohini";
		
		StringCompare cmpr = new StringCompare();
		cmpr.strCmpr(str1, str2);
		System.out.println(cmpr.strCmpr(str1, str3));
		*/
		// TODO Auto-generated method stub
		
		int n=0;
		
		 Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++)
         {
             System.out.printf("%15s\n" );
             String s1=sc.next();
             int x=sc.nextInt();
             //Complete this line
         }
         System.out.println("================================");

         
         StringBuffer strBuf = new StringBuffer();
         strBuf.append("#");
          for(int i= 0 ; i < n ; i++) {
           
           System.out.printf(" %6s\n", strBuf);
           strBuf.append("#");
          
          }

	}

}
