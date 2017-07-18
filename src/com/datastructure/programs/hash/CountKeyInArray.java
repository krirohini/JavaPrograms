package com.datastructure.programs.hash;

import java.util.HashMap;
import java.util.Map;

public class CountKeyInArray {

	public void countKey(int a[]){
		int count = 1;
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<a.length; i++){
			int temp = a[i];
			if(!myMap.containsKey(temp)){
				myMap.put(temp, count);
			}else{
				int value = myMap.get(temp);
				value++;
				myMap.put(temp, value);
			}
		}
		
		System.out.println(myMap);		
	}
	
	
	
	public static void main(String[] args) {
		int b[] = {1,3,2,2,4,1,3,3,4,3};
		CountKeyInArray obj = new CountKeyInArray();
		obj.countKey(b);
		

	}

}
