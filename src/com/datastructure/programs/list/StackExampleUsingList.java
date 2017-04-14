package com.datastructure.programs.list;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackExampleUsingList {

	public static void main(String[] args) {

		List<String> stkList = new Stack<String>();
		
		stkList.add("My");
		stkList.add("name");
		stkList.add("is");
		
		Iterator<String> itr = stkList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//System.out.println("");

	}

}
