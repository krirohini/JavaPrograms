package com.common.programs.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class RohiniArrayList {

	private static ArrayList<Integer> list_1=new ArrayList<Integer>();
	
	private static ArrayList<Integer> addDataInList(ArrayList<Integer> list_1) {
		list_1.add(45);
		list_1.add(13);
		list_1.add(13);
		list_1.add(90);
		list_1.add(2387);
		list_1.add(885);
		list_1.add(10000823);
		list_1.add(13);
		list_1.add(1000077823);
		return list_1;
	}
	
	public void traverseArrayList(ArrayList<Integer> al2){
		//getting Iterator from arraylist to traverse elements
		Iterator<Integer> itr=al2.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }
		  
		  //Iterating the elements of Collection by for-each loop
		  /*for(String obj:al2)  
			    System.out.println(obj);  
			 }*/  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RohiniArrayList rohiniArrayList = new RohiniArrayList();
		RohiniArrayList.addDataInList(list_1);		
		System.out.println(RohiniArrayList.list_1);

	}

}



