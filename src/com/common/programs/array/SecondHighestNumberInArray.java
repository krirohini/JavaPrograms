package com.common.programs.array;

public class SecondHighestNumberInArray {

	public int secondHighest(int[] a){
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		if(a.length == 0){
			throw new IndexOutOfBoundsException();
		}else{
			for(int number:a){
				if(number > max1){
					max2 = max1;
					max1 = number;
				}else if( number > max2){
					max2 = number;
				}
			}
		}
		return max2;
	}
	
	public static void main(String[] args) {

		int b[] = { 23, 56, 21, 7, 9, 26, 47, 38, 4 };
		SecondHighestNumberInArray obj = new SecondHighestNumberInArray();
		System.out.println("Second Highest Number in the Array   .. " + obj.secondHighest(b));
		
	}
}
