package com.datastructure.programs.tree;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Set<String> set1 = new TreeSet<String>();
		set1.add("String 5_1");
		set1.add("String 5_4");
		set1.add("String 5_3");
		set1.add("String 5_2");
		set1.add("String 5_5");
		System.out.println("Values of Treeset set1 are ...." + set1);
		
		//---------Methods of the TreeSet------------//
		System.out.println();
System.out.println("########################################################################");
		//---------E ceiling(E e)---------------------
		//The method call returns the least element greater than or equal to e, or null if there is no such element.
		System.out.println("Ceiling values of String 5_5 is ...." + ((TreeSet<String>) set1).ceiling("String 5_5)"));
		
		System.out.println();
		System.out.println("Ceiling values of String 5_3 is ...." + ((TreeSet<String>) set1).ceiling("String 5_3)"));
		
		System.out.println();
System.out.println("########################################################################");
		//---------Comparator<? super E> comparator()--------------
		//The method call returns the comparator used to order the elements in this set, 
		//or null if this set uses the natural ordering of its elements.
		System.out.println();
		Set<Integer> tree1 = new TreeSet<Integer>();
		Set<Integer> tree2 = new TreeSet<Integer>();
		
		tree1.add(5);
		tree1.add(34);
		tree1.add(59080);
		tree1.add(128945);
		tree1.add(48);
		tree1.add(24657043);
		tree1.add(89);
//		tree1.add(null);     java.lang.NullPointerException
		tree2 = (Set<Integer>) ((TreeSet<Integer>) tree1).comparator();
		System.out.println("tree1 values are ......." + tree1);
		
		 if(tree2!=null){
	         for (Integer element : tree2)
	            System.out.println(element + " ");
	      }
	      else{
	         System.out.println("tree2 value: "+tree2); 
	         System.out.println("So it is using natural ordering");
	      }
		 System.out.println();
System.out.println("########################################################################");
		 
		 //---------Iterator<E> descendingIterator()---------
		 // used to return an iterator over the elements in this set in descending order.
		 Iterator<Integer> iterator;
		 iterator = ((TreeSet<Integer>) tree1).descendingIterator();
		 System.out.println("Decending order of the values of tree1 are ......");
		 while ( iterator.hasNext()) {
			 System.out.print(" " + iterator.next());
		 }
		 System.out.println();
System.out.println("########################################################################");
		 
		 //---------NavigableSet<E> descendingSet()----------
		 // The descendingSet() method is used to return a reverse order view of the elements contained in this set.
		 // The descending set is backed by this set, so changes to the set are also reflected in the descending set and reverse.
		 Set<Integer> tree_reverse = new TreeSet<Integer>();
		 tree_reverse =  ((TreeSet<Integer>) tree1).descendingSet();
		 System.out.println();
		 System.out.println("DecendingSet values of tree1 are ......");
		 iterator = tree_reverse.iterator();
		 while ( iterator.hasNext()) {
			 System.out.print(" " + iterator.next());
		 }
		 System.out.println();
System.out.println("########################################################################");

//		 iterator = tree1.iterator();
//		 System.out.println("tree1 values are ......." + tree1);
		
		 //----------E	first()------------------------------
		 // Returns the first (lowest) element currently in this set.
	     System.out.println("First lowest element: "+((TreeSet<Integer>) tree1).first());   
	     System.out.println("---------- NoSuchElementException-----------For the null element tree -------------------");
//		 Set<Integer> tree_null = new TreeSet<Integer>();
//	     System.out.println("First lowest element: "+((TreeSet<Integer>) tree_null).first());   
	     System.out.println();
System.out.println("########################################################################");
		 
		 //-----------E floor(E e)--------------------------
		 // This method Returns the greatest element in this set less than or equal to the given element,
		 // or null if there is no such element.
		 System.out.println("Floot value for 89 : "+ ((TreeSet<Integer>) tree1).floor(89));   
	     System.out.println("---------- NoSuchElementException-----------For the null element tree -------------------");
		 Set<Integer> tree_null = new TreeSet<Integer>();
	     System.out.println("Floor value for  : "+((TreeSet<Integer>) tree_null).floor(5));   
	     System.out.println();
	     System.out.println("Floor value   : "+((TreeSet<String>) set1).floor("String 5_4"));   
	     System.out.println();
System.out.println("########################################################################");
		 
		 //----------SortedSet<E> headSet(E toElement)------
		 // The headSet(E toElement) method is used to return a view of the 
		 // portion of this set whose elements are strictly less than toElement(input).
		 // The returned set is backed by this set, so changes in the returned set are reflected in this set, and vice-versa.
		 SortedSet<Integer> tree_head_set = new TreeSet<Integer>();
		 tree_head_set = ((TreeSet<Integer>) tree1).headSet(89);
		 System.out.println("Value of tree_head_set is ......" + tree_head_set);
		 System.out.println("tree1 values are ......." + tree1);
		 
		 tree_head_set = ((TreeSet<Integer>) tree_null).headSet(8);
		 System.out.println("Value of tree_head_set is ......" + tree_head_set);
		 System.out.println();
		 //---------SortedSet<E> subSet(E fromElement, E toElement)-------- 
		 // This method returns a view of the portion of this set 
		 // whose elements range from fromElement, inclusive, to toElement, exclusive.
		 //---------------------------------------------------------------------------------------------
		 //---------SortedSet<E> tailSet(E fromElement)--------------- 
		 // This method returns a view of the portion of this set whose elements are greater than or equal to fromElement
System.out.println("########################################################################");
		 
		 //-----------NavigableSet<E> headSet(E toElement, boolean inclusive)---------
		 // This method Returns a view of the portion of this set 
		 // whose elements are less than (or equal to, if inclusive is true) toElement.
		 NavigableSet<Integer> tree_head_set_inc = new TreeSet<Integer>();
		 tree_head_set_inc = ((TreeSet<Integer>) tree1).headSet(128945,true);		 
		 System.out.println("value of tree_head_set_inc with TRUE inc...." + tree_head_set_inc);
		 
		 tree_head_set_inc = ((TreeSet<Integer>) tree1).headSet(128935,false);		 
		 System.out.println("value of tree_head_set_inc with FALSE inc...." + tree_head_set_inc);
		 System.out.println();
		 //--------NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)--------
		 // This method returns a view of the portion of this set whose elements range from fromElement to toElement.
		 //-----------------------------------------------------------------------------
		 //-----------NavigableSet<E> tailSet(E fromElement, boolean inclusive)----------- 
		 // This method returns a view of the portion of this set 
		 // whose elements are greater than (or equal to, if inclusive is true) fromElement.
		 
System.out.println("########################################################################");

		//-----------E higher(E e)----------------------------
		// This method returns the least element in this set strictly greater than the given element,
		// or null if there is no such element.
		System.out.println("least element of  24657043  is ...." + ((TreeSet<Integer>) tree1).higher(24657043));
		System.out.println("least element of 128945 is ...." + ((TreeSet<Integer>) tree1).higher(128945));
		System.out.println();
System.out.println("########################################################################");

		//-----------E last()---------------------------------
		// The last() method is used to return the last (highest) element currently in this set.
		System.out.println("The Highest (last) element in tree1 is......." + ((TreeSet<Integer>) tree1).last());
System.out.println("########################################################################");

		//-----------E lower(E e)------------------------------
		// The lower(E e) method is used to return the greatest element in this set strictly less than the given element, 
		// or null if there is no such element.
		System.out.println("The highest element for the given element in tree1 is......." + ((TreeSet<Integer>) tree1).lower(48));
System.out.println("########################################################################");
	
		//-----------E pollFirst()-----------------------------
		// The pollFirst() method is used to retrieve and remove the first (lowest) element, 
		// or returns null if this set is empty.
		System.out.println("poll First element of the tree1 is " + ((TreeSet<Integer>) tree1).pollFirst());
		System.out.println("After pollFirst() function, elemnts of tree1 is ....." + tree1);
System.out.println("########################################################################");
		
		//-----------E pollLast()-----------------------------
		// The pollLast() method is used to retrieve and remove the last (highest) element, 
		// or returns null if this set is empty.
		System.out.println(" pollLast element of the tree1 is " + ((TreeSet<Integer>) tree1).pollLast());
		System.out.println("After pollLast() function, elemnts of tree1 is ....." + tree1);		 
		 
	}

}
