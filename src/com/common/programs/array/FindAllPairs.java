package com.rohini.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindAllPairs {
	
	public static void allPairsOfGivenSum(int[] givenArray, int sum){
		
		int len = givenArray.length;
		
		System.out.println("Given Sum ... " + sum);
		
		Set<Integer> set = new HashSet<Integer>();
				
		for(int i=0; i<len; i++){
			if(!set.contains(givenArray[i])) {
					set.add(givenArray[i]);
			}
		}
		
		System.out.print("Set .. ");
		
		for (Integer temp : set) {
	        System.out.print(temp + "\t");
	    }

		
		Iterator<Integer> iterate = set.iterator();
		while(iterate.hasNext()){
			int current = iterate.next();			
			int remain = sum - current;
		
			if(set.contains(remain)) {
				System.out.println("\n" + "Pair ... "+ remain + " and " + current);
				System.out.print("--------------------------");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 6, 13, 5, 4, 3, 9, 0, 2, 2, 5, -1, 8};
		allPairsOfGivenSum(a, 7);

	}

}
