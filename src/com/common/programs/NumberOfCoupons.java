package com.common.programs;

import java.util.Random;

// Write a program that find the number of coupons each user gets and left over after giving away.

public class NumberOfCoupons {
	
	public void allotedAndLeftOver(int numCoupons, int user ) {
		int a=numCoupons;
		
		for(int i=1; i<=user; i++){
			Random r = new Random();
			int R= r.nextInt(a-1) + 1;	
			
			System.out.println();
			System.out.println("=================");
			System.out.print("Number of Coupons for User...");
			System.out.print(i);
			System.out.print("....");		
			System.out.print(R);
			
			a=a-R;
			
			System.out.println();
			System.out.print("Left Coupons are...");
			System.out.print(a);
		}		
	}
	

	public static void main(String[] args) {

		System.out.print("Please Enter Number of Coupons......");
		int totalCoupons=Integer.parseInt(args[0]);
		System.out.print(totalCoupons);
		
		System.out.println();
		
		System.out.print("Please Enter Number of Users.......");
		int totalUsers=Integer.parseInt(args[1]);
		System.out.print(totalUsers);
		
		NumberOfCoupons numberOfCoupons = new NumberOfCoupons();
		numberOfCoupons.allotedAndLeftOver(totalCoupons, totalUsers);		

	}

}
