package com.common.programs.array;

public class LargestAndSmallest {

	public static void main(String[] args) {
		
		int[] ary = { 28, 55, 7, 2, -1, 6, -5};
		int largest = ary[0];
		int smallest = ary[0];
		int i = 1;
		
		while(i < ary.length){
			if(ary[i] > largest){
				largest = ary[i];
			}
			if(ary[i] < smallest){
				smallest = ary[i];
			}
			i++;
		}		
		System.out.println(largest + "  " + smallest);	
	}
}
