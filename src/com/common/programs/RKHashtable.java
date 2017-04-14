package com.common.programs;

import java.util.Hashtable;
import java.util.Map;

public class RKHashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> table = new Hashtable<Integer, String>(6, 0.75F);
		table.put(103, "value103");
		table.put(129, "value129");
		table.put(56, "value56");
		table.put(389, "value389");
		table.put(194, "value194");
		table.put(468, "value468");
		
		
		table.put(468, "value468999");
		table.put(75, "value75");
		table.put(905, "value905");
		
		/*table.put(468, "value468");
		table.put(7500, "value75");
		table.put(905, "value905");*/
		
		System.out.println("Hashtable Contents are :  "+table);
		System.out.println();
		
		for(Map.Entry m:table.entrySet()) {
			System.out.println(m.getKey()+"  "+ m.getValue() + "  ...Hashcode is  " + m.hashCode());

		}
		
		table.put(9085, "value9085");
		
		System.out.println("=========================");
		for(Map.Entry m:table.entrySet()) {
			System.out.println(m.getKey()+"  "+ m.getValue() + "  ...Hashcode is  " + m.hashCode());

		}
		int abc=0;
		
		
	}
}
