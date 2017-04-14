package com.datastructure.programs.tree;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		
		Map<Integer, String> t1 = new TreeMap<Integer, String>();
		
		//System.out.println("first key of tree t1 is ...." + ((TreeMap<Integer, String>) t1).firstKey());
		
		t1.put(78, "seventyeight");
		t1.put(8, "eight");
		t1.put(29, "twentynine");
		t1.put(82, "eightytwo");
		t1.put(7, "seven");
		t1.put(2, "two");		
		System.out.println("elements of the treemap t1 are...." + t1);
		System.out.println();
		System.out.println("###################################################");
		System.out.println("first key of tree t1 is ...." + ((TreeMap<Integer, String>) t1).firstKey());

	}

}
