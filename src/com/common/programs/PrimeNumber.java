package com.common.programs;

import java.util.HashSet;
import java.util.Set;

public class PrimeNumber {

	public void printPrimeNumber(int start, int end){
		//int[] a = new int[end/2+1];
		Set<Integer> primeList =  new HashSet<Integer>();
		//int currentNum = start;
		
		for(int i=end; i >=start; i--){
			for(int j=start; j<=end/2; j++){
				/*if(i % j != 0){
					primeList.add(i);					
				}*/
				
				if(j % 2 !=0){
					if(j % 3 !=0 && j % 5 !=0 && j % 7 !=0 && j % 9 !=0){
						System.out.println(j + "  is a Prime Number");
						primeList.add(j);
					}else {
						System.out.println(j + "  is NOT a Prime Number");
					}
				}
			}
		}
		
		
			System.out.println(primeList);
		
	}
	
	
	
	public boolean isPrime(int number){
		if(number == 0 || number < 0){
			return  false;
		}
		if(number == 1 || number == 2 || number == 3){
			return true;
		}else{
			for(int i=2 ; i< number/2; i++){
				if(number % i == 0){
					return false;
				}
			}return true;
			
		}
	}
	public static void main(String[] args) {
		PrimeNumber obj = new PrimeNumber();
		//obj.printPrimeNumber(3, 11);
		boolean prime = obj.isPrime(12);
		System.out.println(prime);
		

	}

}
