package com.common.programs.array;

public class CountOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2, 4, 5, 1, 8, 9, 4, 8, 1};
		int xor;
		
		for(int i = 0; i<a.length; i++){
			System.out.print( a[i] + " | ");
			for(int j=1; j<a.length; j++){
				if(a[i] == a[j] ){
					xor = a[i]^a[j];
					if(xor !=  0){
						System.out.println(a[i]);
					}
				}
			}
		}
	}

}
