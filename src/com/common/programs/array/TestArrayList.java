package com.common.programs.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestArrayList {

	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(23);
		s1.add(35);
		s1.add(823820);
		s1.add(9463);
		s1.add(2307);
		
		// The following constructor builds an array list that is initialized with the elements of the collection c.
		List<Integer> l1 = new ArrayList<Integer>(s1);
		System.out.println("Elements of ArrayList l1 are ......" + l1);
		
		ArrayList<String> al = new ArrayList<String>();
	    System.out.println("Initial size of al: " + al.size());

	      // add elements to the array list
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");
	      al.add(1, "A2");
	      System.out.println("Size of al after additions: " + al.size());

	      // display the array list
	      System.out.println("Contents of al: " + al);
	      // Remove elements from the array list
	      al.remove("F");
	      al.remove(2);
	      System.out.println("Size of al after deletions: " + al.size());
	      System.out.println("Contents of al: " + al);
		
	}

}
