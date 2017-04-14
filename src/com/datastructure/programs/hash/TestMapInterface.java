package com.datastructure.programs.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMapInterface {

	public static <K, V> void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(34, "thiryfour");
		m1.put(89, "eightynine");
		m1.put(78, "seventyeight");
		m1.put(90, "ninety");
		m1.put(34, "thiryfour");
		m1.put(null, "thiryfour");
		m1.put(null, "four");
		m1.put(100, null);
		m1.put(101, null);
		System.out.println("Elements of the map m1 are....");
		System.out.print("\t" + m1);
		
		System.out.println();
		System.out.println("###################################################");
		
		Map<Integer, String> m2 = new HashMap<Integer, String>(m1);
		m2.putAll(m1);
		m2.put(56, "fiftysix");
		m2.put(29, "twentynine");
		System.out.println("Elements of the map m2 are....");
		System.out.print("\t" + m2);
		
		System.out.println();
		System.out.println("###################################################");
				
		// getting the value with the key
		System.out.println("Value is....." + m1.get(34));
		
		System.out.println();
		System.out.println("###################################################");
		
		// Set<Map.Entry<K,V>>	entrySet()
		// Returns a Set view of the mappings contained in this map.
		System.out.println("Value of the map in set are...." + m1.entrySet());
		
		System.out.println();
		System.out.println("###################################################");
		
		// Set<K>	keySet()
		// Returns a Set view of the keys contained in this map.
		System.out.println("set view of the key in the map m1 is....." + m1.keySet());
		
		System.out.println();
		System.out.println("###################################################");
		
		// Collection<V>	values()
		// Returns a Collection view of the values contained in this map.
		System.out.println("Collection view of the values in the map m1 is....." + m1.values());
		
		System.out.println();
		System.out.println("###################################################");
		
		Map<Integer, String> m3 =  new HashMap<Integer, String>(20, (float) 0.7);
		m3.putAll((Map<? extends Integer, ? extends String>) m1);
		m3.put(20, "twenty");
		m3.put(53, "fiftythree");
		m3.put(null, null);
		System.out.println("elements of the map m3 are....." + m3);
		
		System.out.println();
		System.out.println("###################################################");
		
		 // Create a hash map
	      HashMap<String, Double> hm = new HashMap<String, Double>();
	      
	      // Put elements to the map
	      hm.put("Zara", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      
	      // Get a set of the entries
	      Set<?> set = hm.entrySet();
	      
	      // Get an iterator
	      Iterator<?> i = set.iterator();
	      
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      System.out.println();
	      // Deposit 1000 into Zara's account
	      double balance = hm.get("Zara").doubleValue();
	      hm.put("Zara", new Double(balance + 1000));
	      System.out.println("Zara's new balance: " +
	      hm.get("Zara"));

		
	}

}
