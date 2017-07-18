package com.common.programs.array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		
		int[] ary = {1, 3, 4, 1, 3, 5};
		
		Set<Integer> set = new HashSet<Integer>(ary.length);
		int duplicate;
		System.out.println("Duplicate Numbers Are: \n");
		for(int i=0; i<ary.length; i++){
			duplicate = ary[i];
			if(!set.contains(ary[i])){
				set.add(duplicate);
			}else{
				System.out.print(duplicate + "\t");
			}
		}
	}

}
