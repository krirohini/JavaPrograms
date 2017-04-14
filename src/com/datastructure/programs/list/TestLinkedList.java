package com.datastructure.programs.list;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
		
		List<Integer> list1 = new LinkedList<Integer> ();
		list1.add(null);
		list1.add(48786);
		list1.add(23412);
		list1.add(460);
		list1.add(12);
		list1.add(3763742);
		list1.add(986278);
		System.out.println("elements of list1 are ......" + list1);		
System.out.println("########################################################################");
				
// add(int index, E element)===================================================================
// Inserts the specified element at the specified position in this list.
		list1.add(3, 847);
		System.out.println("elements of list1 are ......" + list1);		
System.out.println("########################################################################");

// boolean	addAll(Collection<? extends E> c)
// Appends all of the elements in the specified collection to the end of this list, 
// in the order that they are returned by the specified collection's iterator.
		Collection<Integer> c1= new HashSet<Integer>();
		c1.addAll((Collection<? extends Integer>) list1);
		c1.add(7275601);
		c1.add(null);
		System.out.println("elements of collection c1 are ......" + c1);		
System.out.println("########################################################################");
		
// boolean	addAll(int index, Collection<? extends E> c)
// Inserts all of the elements in the specified collection into this list, starting at the specified position.
		list1.addAll(8, c1);
		System.out.println("elements of list1 are ......" + list1);		
System.out.println("########################################################################");

// E  element()
// Retrieves, but does not remove, the head (first element) of this list.
// ????????????????		
		System.out.println("E element() is......" +((LinkedList<Integer>) list1).element());
System.out.println("########################################################################");

		
// E  get(int index)
// Returns the element at the specified position in this list.
		System.out.println("element of the given index is  ....." + list1.get(6));
System.out.println("########################################################################");

// int	indexOf(Object o)
// Returns the index of the first occurrence of the specified element in this list, 
// or -1 if this list does not contain the element.
//????????????????		
		System.out.println(" index of the given object  is ......" + list1.indexOf(list1));
System.out.println("########################################################################");

// int	lastIndexOf(Object o)
// Returns the index of the last occurrence of the specified element in this list, 
// or -1 if this list does not contain the element.
//????????????????		
		System.out.println(" last index of the given object  is ......" + list1.lastIndexOf(list1));
System.out.println("########################################################################");
		
// ListIterator<E>	listIterator(int index)
// Returns a list-iterator of the elements in this list (in proper sequence), 
// starting at the specified position in the list.
		System.out.println("list-iterator of the element in this list is ...... " + list1.listIterator(0));
		System.out.println("list-iterator of the element in this list is ...... " + list1.listIterator(4));
System.out.println("########################################################################");

// boolean	offer(E e)
// Adds the specified element as the tail (last element) of this list.
		System.out.println("adding the element as the tail is......" + ((LinkedList<Integer>) list1).offer(2222));
		System.out.println("elements of list1 are ......" + list1);		
System.out.println("########################################################################");

// boolean	offerFirst(E e)
// Inserts the specified element at the front of this list.
		System.out.println("adding the element at the front is......" + ((LinkedList<Integer>) list1).offerFirst(111111));
		System.out.println("elements of list1 are ......" + list1);		
System.out.println("########################################################################");

// boolean	offerLast(E e)
// Inserts the specified element at the end of this list.
		System.out.println("adding the element at the front is......" + ((LinkedList<Integer>) list1).offerLast(3333));
		System.out.println("elements of list1 are ......" + list1);		
System.out.println("########################################################################");

		
		LinkedList<String> ll = new LinkedList<String>();
		// add elements to the linked list
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		System.out.println("Original contents of ll: " + ll);
		
		// remove elements from the linked list
		ll.remove("F");
		ll.remove(2);
		System.out.println("Contents of ll after deletion: "
		 + ll);
		
		// remove first and last elements
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll after deleting first and last: "
		 + ll);
		
		// get and set a value
		Object val = ll.get(2);
		ll.set(2, (String) val + " Changed");
		System.out.println("ll after change: " + ll);
		

	}

}
