package com.common.programs;

public class ProductExceptNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ary = {1, 2, 3, 4, 5};
		
		int product = 1;
		for(int i=0; i< ary.length; i++){
			product = product * ary[i];
		}
		
		for(int i=0; i< ary.length; i++){
			ary[i] = product / ary[i];
			System.out.print(ary[i] + " | ");
		}
		

	}

}
