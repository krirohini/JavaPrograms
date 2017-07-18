package com.common.programs.array;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1, 2, 3, 5, 6, 7, 8, 9, 10};
		
		int n = 10;
		int actualSum = 0;
		int missingNumber;
		
		for(int i = 0; i< a.length; i++){
			actualSum = actualSum + a[i];
		}
		
		missingNumber = ( n*(n+1)/2 ) - actualSum;
		System.out.println("Missing number is .. " + missingNumber);
		
	}

}
