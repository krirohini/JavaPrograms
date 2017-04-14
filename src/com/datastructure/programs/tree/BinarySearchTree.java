package com.datastructure.programs.tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {	
	
	public static List<Integer> binaryArray = new ArrayList<Integer>();	
	
	public void BINARY_SEARCH_INSERT(int value) {
		
		int left = 0 ;
		int right = 0 ;				
				
		if(binaryArray.isEmpty()) {
			binaryArray.add(value);
		}
		
		else {
			for ( int k=0; k < binaryArray.size()/2 ; k++ ) {			
				
				left = 2*k + 1;
				right = 2*k + 2  ;			
								
				if ( value < binaryArray.get(k)) {						
					BINARY_SEARCH_INSERT(value);
					binaryArray.add(left, value);
					System.out.println(value);
				}
				
				if ( value > binaryArray.get(k)) {						
					BINARY_SEARCH_INSERT(value);
					binaryArray.add(right, value);
					System.out.println(value);
				}				
			}
		}	
	}
	
	public void TRAVERSAL () {
		
		System.out.println("========");
		for(int i=1; i<=binaryArray.size(); i++) {
//			System.out.print("  " + binaryArray.get(i));
		}
		System.out.println("========");
	}
	

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		binaryArray.add(4);
		
		int a = 8;
				
//		System.out.println("Enter the value to insert in an array :-  ");
//		for (String s: args) {
			bst.BINARY_SEARCH_INSERT(a);
//		}
	
		bst.TRAVERSAL();
	}
}
