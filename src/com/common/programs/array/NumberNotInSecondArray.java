package com.common.programs.array;

import java.util.Hashtable;

/** Given two arrays, 1,2,3,4,5 and 2,3,1,0,5 
*   find which number is not present in the second array.
**/

public class NumberNotInSecondArray {

	public void notInSecondAry(int aryA[], int aryB[]){
		if(aryB.length == 0 || aryA.length == 0 ){
			System.out.println("Either of the Array is Empty");
			throw new IndexOutOfBoundsException();			
		}
		
		Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
		for(int i=0; i<aryB.length; i++){
			hash.put(aryB[i], 1);
		}
		
		System.out.println("Elements which are not in the second Array");
		for(int i=0; i<aryA.length; i++){
			if(!hash.containsKey(aryA[i])){
				System.out.println(aryA[i]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {47,9,4,90,2,38};
		int b[] = {56,9,80,2,58};
		//int b[] = {};
		
		NumberNotInSecondArray obj = new NumberNotInSecondArray();
		
		obj.notInSecondAry(a, b);

	}

}
