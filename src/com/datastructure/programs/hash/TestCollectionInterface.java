package com.datastructure.programs.hash;

import java.util.HashSet;
import java.util.Iterator;

public class TestCollectionInterface {

	public static void main(String[] args) {
		
		 System.out.println( "Collection Example!\n" ); 
	      int size;
	      
	      HashSet<String> collection = new HashSet<String> ();
	      
	      String str1 ="Yellow", str2 ="White", str3 ="Green", str4 ="Blue";  
	      
	      Iterator<String> iterator;
	      collection.add(str1);    
	      collection.add(str2);   
	      collection.add(str3);   
	      collection.add(str4);
	      
	      System.out.print("Collection data: ");  
	      iterator = collection.iterator();  
	      
	      while (iterator.hasNext()){
	         System.out.print(iterator.next() + " ");  
	      }
	      System.out.println();
	      size = collection.size();
	      
	      if (collection.isEmpty()){
	         System.out.println("Collection is empty");
	      }
	      else{
	         System.out.println( "Collection is not empty and it's size is : " + size);
	      }
	      System.out.println();
	      
	      HashSet<String> collection2= new HashSet<String>();
	      
	      collection2.add("Blue");
	      collection2.add("yellow");
	      collection2.add("pink");
	      collection2.add("gray");
	      collection2.add("majenta");
	      
	      iterator = collection2.iterator();
	      System.out.println();
	      System.out.print("Collection 2 data : ");
	      while (iterator.hasNext()){
	    	  System.out.print(iterator.next() + " ");
	      }

	      // 	boolean isEmpty()
	      //	Returns true if this collection contains no elements.
	      System.out.println();
	      size = collection2.size();	      
	      if (collection2.isEmpty()){
	         System.out.println("Collection 2 is empty");
	      }
	      else{
	         System.out.println( "Collection 2 is not empty and it's size is : " + size);
	      }
	      System.out.println();
	      
	      
	      HashSet<String> collection3 = new HashSet<String>();
	      // 	boolean	addAll(Collection<? extends E> c)
	      //	Adds all of the elements in the specified collection to this collection (optional operation).
	      collection3.addAll(collection2);
	      collection3.add("black");	      
	      iterator= collection3.iterator();
	      System.out.println();
	      System.out.print("Collection 3 data : ");
	      while (iterator.hasNext()) {
	    	  System.out.print(iterator.next() + " ");
	      }
	      System.out.println();
	      size = collection3.size();
	      if (collection3.isEmpty()){
		         System.out.println("Collection 3 is empty");
		  }
		  else{
		         System.out.println( "Collection 3 is not empty and it's size is : " + size);
		  }
		  System.out.println();
	      
	      
	      // ---------- Methods of the Collection Interface Examples ------------------
	      
	      // 1.>  boolean contains(Object o)  
		  //	  Returns true if this collection contains the specified element.
	      
	      System.out.println();
	      boolean is_present = collection.contains("Green");
	      if( is_present == true) {
	    	  System.out.println("Collection has the element ");
	      }
	      else {
	    	  System.out.println("Collection has not the element ");
	      }
	      System.out.println();
		
	      // 2.> boolean containsAll(Collection<?> c)
	      //	 Returns true if this collection contains all of the elements in the specified collection.	      
	      boolean all_are = collection3.containsAll(collection2);
	      if( all_are == true) {
	    	  System.out.println("Collection3 has all the element of collection2 ");
	      }
	      else {
	    	  System.out.println("Collection has not the element ");
	      }
	      
	      // 3.> boolean equals(Object o)
	      //	 Compares the specified object with this collection for equality.	      
	      System.out.println();
	      boolean yes_same = collection2.equals(collection3);
	      if( yes_same == true) {
	    	  System.out.println("Collection2 is equal to collection3 ");
	      }
	      else {
	    	  System.out.println("Collection2 is not equal to collection3 ");
	      }
	      
	      // 4.> int hashCode()
	      //	 Returns the hash code value for this collection.
	      System.out.println();
	      int hash_value = collection.hashCode();
	      System.out.println("The hashCode of the collection is : " + hash_value );	      
	      int hash_value2 = collection2.hashCode();
	      System.out.println("The hashCode of the collection2 is : " + hash_value2 );
	      int hash_value3 = collection3.hashCode();
	      System.out.println("The hashCode of the collection3 is : " + hash_value3 );
	      
	      // 5.> boolean remove(Object o)
	      //     Removes a single instance of the specified element from this collection, if it is present (optional operation).
	      HashSet<Integer> collection4 = new HashSet<Integer>();
	      collection4.add(5);
	      collection4.add(59);
	      collection4.add(95);
	      collection4.add(348);
	      collection4.add(258880);
	      collection4.add(57);
	      collection4.add(85098);
	      
	      System.out.println("Values of the (integer) collection4 are  :" + collection4);
	      System.out.println();
	      @SuppressWarnings("unused")
		boolean remove_value = collection4.remove(95);
	      System.out.println("Values of the (integer) collection4 after removing the item are  :" + collection4);
	      System.out.println();	 
	      
	      // 6.> removeAll(Collection<?> c)
	      // 	 Removes all of this collection's elements that are also contained in the specified collection (optional operation).
	      System.out.println("Values of the (integer) collection4 after removing all item are  :" + collection4.removeAll(collection4));
	      System.out.println(collection4);
	      
	      
	      // 7.> public boolean retainAll(Collection<?> c)
	      //	 Retains only the elements in this collection that are contained in the specified collection (optional operation).
	      HashSet<Integer> collection5 = new HashSet<Integer>();
	      collection5.addAll(collection4);
	      collection5.add(482);
	      collection5.add(3754);
	      collection5.add(-127345);
	      System.out.println();
	      System.out.println("Values of the (integer) collection5 are  :" + collection5 );
//	      Iterator<Integer> iterator_int = collection5.iterator();
//	      while (iterator_int.hasNext()) {
//	    	  System.out.print(iterator_int.next() + "  ");
//	      }
	      System.out.println();
	      
	      HashSet<Integer> col = new HashSet<Integer>(collection4);
	      col.retainAll(collection5);
	      
	      System.out.println("Common Elements are " + col);  
	      
	      // 8.> Object[] toArray()
	      //	 Returns an array containing all of the elements in this collection.
	      
	      Object[] ob = collection4.toArray();
	      System.out.println("Printing Elements from Set to an Array ....");
	      for (Object value: ob) {
	    	  System.out.println("Number = " + value );
	      }
	}

	
}
