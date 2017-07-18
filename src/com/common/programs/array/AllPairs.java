package com.common.programs.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AllPairs {

	public static int[] a = { 2, 5, 7, 3, 1, 21, 11, 3, 9, 4, 1, 3, -3 };
	public static int sum = 7;

	// Write a program to find the consecutive elements in an array A[] and for the
	// given sum X.

	public static void printConsecutivePairs(int[] a, int sum) {
		int i = 1;

		while (i < a.length) {
			if (a[i - 1] + a[i] == sum) {
				System.out.println(" Pair is  .. " + a[i - 1] + " and " + a[i]);
			}
			i++;
		}
	}

	// Function for finding the pair, which is equal to the given sum X, in a
	// given an array A[].

	static int MAX = 100;

	public static void printAllPairs(int arr[], int sum) {
		// Declares and initializes the whole array as false
		boolean[] binmap = new boolean[MAX];

		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];

			// checking for condition
			if (temp >= 0 && binmap[temp]) {
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
			}
			binmap[arr[i]] = true;
		}
	}

	
	// By Using HashMap, Function for finding the pair, which is equal to the given sum X, in a
	// given an array A[].
	
	// This function need modification.
	public static void getPair(int a[], int sum){
		
		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> pairSet = new HashSet<>();
		
		for(int i=0; i< a.length; i++){
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i])+1);
			}else{
				map.put(a[i], 1);
			}			
		}
		
		for(int i=0; i<a.length;  i++){
			int remains = sum - a[i];
			if(map.containsKey(remains) && map.get(remains) >= 1){
				if(remains == a[i] && map.get(remains) ==1 ){
					System.out.println("No Pair Exits for   " + a[i] +"\n");
				}else{
					pairSet.add(a[i]);
					pairSet.add(remains);
										
					//System.out.println("Pair is ...  "+ a[i] +"  and   " + remains);
					map.put(remains, map.get(remains)-1);
				}
			}
		}
		System.out.println(pairSet);
	}
	
	public static void main(String[] args) {
		//printAllPairs(a, sum);
		getPair(a, sum);
		
	}

}
