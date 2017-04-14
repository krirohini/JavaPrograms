package com.datastructure.programs.hash;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		//------------------retainAll()-------for String Set ---------------//
		Set<String> set1 = new HashSet<String>();
		set1.add("cat1");
		set1.add("cat11");
		set1.add("cat111");
		set1.add("cat1111");
		set1.add("cat11111");
		System.out.println("set1 is...." + set1);
		
		Set<String> set2 = new HashSet<String>();
		set2.add("cat2");
		set2.add("cat1");
		set2.add("cat11");
		set2.add("cat22");
		set2.add("cat222");
		set2.add("cat2222");
		set2.add("cat22222");
		System.out.println("set2 is......" + set2);
		//--------------Intersection-------------------//
		
		Set<String> intersection = new HashSet<String>(set1);
		intersection.retainAll(set2);
		
		System.out.println("intersection of set1 and set2 is ...."+ intersection);
		
		//----------------retainAll()-------------for Integer Set----------//
		Set<Integer> set3 = new HashSet<Integer>();
		set3.add(1);
		set3.add(11);
		set3.add(111);
		set3.add(1111);		
		System.out.println("Integer set3 is......" + set3);
		
		Set<Integer> set4 = new HashSet<Integer>();
		set4.add(222);
		set4.add(22);
		set4.add(2);
		set4.add(1);
		set4.add(11);
		set4.add(2222);
		System.out.println("Integer set4 is......" + set4);
		
		Set<Integer> common = new HashSet<Integer>(set3);
		common.retainAll(set4);
		System.out.println("Common items of the set3 and set4 are......" + common);
		
		//-------------Object clone()-------adding elements to a set---------------//
		Set<Integer> newSet = new HashSet<Integer>();
		newSet = (Set<Integer>) ((HashSet<Integer>) set4).clone();
		newSet.add(5);
		System.out.println("Values of newSet is ....." + newSet);
		
		

	}

}
