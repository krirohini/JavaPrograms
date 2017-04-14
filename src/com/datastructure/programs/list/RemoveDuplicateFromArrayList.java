package com.datastructure.programs.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		List<Integer> numberArrayList = new ArrayList<Integer>();
		numberArrayList.add(9898);
		numberArrayList.add(45);
		numberArrayList.add(749895);
		numberArrayList.add(9898);
		numberArrayList.add(7667);
		
		
		System.out.println("ArrayList with duplicate elements");
		Iterator<Integer> itr=numberArrayList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
				
		System.out.println("List without duplicates, converting arraylist to set and viceversa");
		Set<Integer> noDuplicate = new LinkedHashSet<Integer>(numberArrayList);
		
		numberArrayList.clear();		
		
		numberArrayList.addAll(noDuplicate);
		
		System.out.println(numberArrayList);		
		
		System.out.println("Reverse the ArrayList");
		Collections.reverse(numberArrayList);
		System.out.println(numberArrayList);
		
		System.out.println("Sorting the ArrayList");
		Collections.sort(numberArrayList);
		System.out.println(numberArrayList);
		
		System.out.println("Sorting the ArrayList in Reverse");
		Collections.sort(numberArrayList, Collections.reverseOrder());
		System.out.println(numberArrayList);		 
		
	}

}
