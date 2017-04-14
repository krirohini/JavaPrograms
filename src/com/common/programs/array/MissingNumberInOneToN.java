package com.common.programs.array;

/**
 * In an array 1-100 numbers are stored, one number is missing how do you find
 * it?
 * 
 */

public class MissingNumberInOneToN {

	public int missingNumber(int ary[]) {
		// Sum of Numbers from 1 to N is N*(N+1)/2
		int shouldTotal = 10 * (10 + 1) / 2;
		int isSum = 0;
		
		if (ary.length == 0) {
			System.out.println("Empty Array");
			return 0;
		} else {			
			for (int i = 0; i < ary.length ; i++) {
				isSum = isSum + ary[i];
			}
		}
		int missingNumber = shouldTotal - isSum;
		return missingNumber;
	}
	
	/**In an array 1-100 exactly one number is duplicate 
	*how do you find it?
	*/
	public int duplicateNumber(int ary[]) {
		// Sum of Numbers from 1 to N is N*(N+1)/2
		int shouldTotal = 10 * (10 + 1) / 2;
		int isSum = 0;
		
		if (ary.length == 0) {
			System.out.println("Empty Array");
			return 0;
		} else {			
			for (int i = 0; i < ary.length ; i++) {
				isSum = isSum + ary[i];
			}
		}
		int duplicateNumber = shouldTotal - isSum;
		return duplicateNumber;
	}
	
	
	
	public static void main(String[] args) {
		
		MissingNumberInOneToN obj = new MissingNumberInOneToN();
		int[] ary = new int[10];
		ary[0] = 1;
		ary[1] = 2;
		ary[2] = 3;
		ary[3] = 4;
		ary[4] = 5;
		ary[5] = 5;
		ary[6] = 7;
		ary[7] = 8;
		ary[8] = 9;
		ary[9] = 10;
		
		//System.out.println("Missing Number is " + obj.missingNumber(ary));
		System.out.println("Duplicate Number is " + obj.duplicateNumber(ary));

	}

}
