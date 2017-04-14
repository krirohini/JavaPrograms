package com.common.programs;

import java.util.HashSet;
import java.util.Set;

public class PrimeNumber {

	public void printPrimeNumber(int start, int end){
		//int[] a = new int[end/2+1];
		Set<Integer> primeList =  new HashSet<Integer>();
		//int currentNum = start;
		
		for(int currentNum=start; currentNum <end/2; currentNum++){
			for(int i=2; i<=9; i++){
				if(currentNum%i == 0){
					primeList.add(currentNum);					
				}
				
				if(end % i != 0){
					primeList.add(end);
				}
				/*if(currentNum > i){
					break;
				}*/
			}
		}
		
		
			System.out.println(primeList);
		
	}

	public static void main(String[] args) {
		PrimeNumber obj = new PrimeNumber();
		obj.printPrimeNumber(3, 11);

	}

}
