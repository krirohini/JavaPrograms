package com.commons.string;

public class SumOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		String a="jklmn489pjro635ops";

	    int sum = 0;

	    String num = "";

	    for(int i = 0; i < a.length(); i++) {
	        if(Character.isDigit(a.charAt(i))) {
	            num = num + a.charAt(i);
	        } else {
	            if(!num.equals("")) {
	                sum = sum + Integer.parseInt(num);
	                num = "";
	            }
	        }
	    }

	    System.out.println(sum);

	}

}
