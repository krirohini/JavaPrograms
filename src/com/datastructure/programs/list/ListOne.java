package com.datastructure.programs.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


//Union and Intersection of two Lists

public class ListOne {

	public static void main(String[] args) {
		
		List<Integer> listOne= new LinkedList<Integer>();
		listOne.add(45);
		listOne.add(567);
		listOne.add(657218);
		listOne.add(46649);
		listOne.add(883);
		listOne.add(4054);	
		
		
		
		List<Integer> listTwo= new LinkedList<Integer>();
		listTwo.add(452345);
		listTwo.add(98567);
		listTwo.add(65547218);
		listTwo.add(46649);
		listTwo.add(883);
		listTwo.add(405407);	
		
		List<Integer> result=new LinkedList<Integer>();
		
		Iterator<Integer> itr1= listOne.iterator();
		Iterator<Integer> itr2= listTwo.iterator();
		
		if(listOne.size()>listTwo.size()){
			while(itr1.hasNext()){
				while(itr2.hasNext()){
			}
//			if(itr1.next()==itr2.next())
//					contains(listTwo)){
//				
//				result.
//			}
//		}
//		
//		listOne.containsAll(listTwo);
//		Iterator<Integer> itr1= listOne.iterator();
//		Iterator<Integer> itr2= listTwo.iterator();
//		
		

	}
		}
	}

}
