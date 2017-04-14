package com.datastructure.programs.hash;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {

	public static void main(String[] args) {
		
		// Initializing a LinkedHashMap
		Map<Integer, Integer>  l1 = new LinkedHashMap<Integer, Integer>();
		l1.put(34, 34 );
		l1.put(23, 34 );
		l1.put(90,null );
		l1.put(37, 89 );
		l1.put(34, 29 );
		l1.put(18, 36 );
		l1.put(47, 26 );
		System.out.println("elements of the linkedhashmap l1 are ....." + l1);
		
		System.out.println("################################################################");
		
		Map<Integer, Integer>  l2 = new LinkedHashMap<Integer, Integer>(l1);
		l2.put(73, 37);
		System.out.println("elements of the linkedhashmap l2 are ....." + l2);
		
		System.out.println("################################################################");
		
		
		
		
		

	
		
		
	}

}
