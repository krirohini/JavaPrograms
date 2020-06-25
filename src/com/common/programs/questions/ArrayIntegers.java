/**
 * 
 */
package com.rohini.common.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author rohini
 *
 */
public class ArrayIntegers {

	/**
	 * @param args
	 */
	/*
	 * 
	 * Given an array of integers, 
	 * return an array of integers which contains
		[1st integer, Sum of next 2 integers (2nd, 3rd), Sum of next 3 integers (4th, 5th, 6th)]
		Input size n -	[1,6,8,5,9,4,7,2]
		Output size m - [1,14,18,9]
	 */
	
	public static List<Integer> sumOfNumberOfElements(int[] a){
		List<Integer> list = new ArrayList<Integer>();
		
		int index = 0;
		int len = a.length;
		int counter = 0;
		
		while(index<len){
			if(counter==0){
				list.add(a[counter]);
				counter++;
				index++;
			}else{
				int sum = 0;
				int numberOfElements = counter+1;
				int nextCounter = index + numberOfElements;
				while(index < nextCounter ){
					sum = sum + a[index];
					index ++;
					
					// if index reaches the length of the array, 
					// it will stop adding the sum for current element.
					if(index == len){
						break;
					}
				}
				list.add(sum);
				counter ++;
			}
		
			
		}
		
		return list;
	}
	
	/*
	 * 	Given an array of of size n and a number k, 
	 * 	find all elements that appear more than n/k times.
	 *	For example, if the input arrays is {3, 1, 2, 2, 1, 2, 3, 3} and k is 4, 
	 *	then the output should be [2, 3]
	 */
	
	public static List<Integer> elementsAppearMoreThan_N_By_K_Times(int[] ary, int k){
		int len = ary.length;
		if(k>len || len == 0) return null;
		
		List<Integer> moreThanKTimes = new ArrayList<>();
		int n_By_k = len/k;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<len; i++){
			int current = ary[i];
			if(map.containsKey(current)){
				map.put(current, map.get(current) + 1);
			}else{
				map.put(current, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()){
			if(entry.getValue() > n_By_k){
				moreThanKTimes.add(entry.getKey());
			}
		}
		
		return moreThanKTimes;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,6,8,5,9,4,7,2,-1};
		System.out.println(sumOfNumberOfElements(a));
		
		
		int[] b = {3, 1, 2, 2, 1, 2, 3, 3};
		System.out.println(elementsAppearMoreThan_N_By_K_Times(b, 4));

	}

}
