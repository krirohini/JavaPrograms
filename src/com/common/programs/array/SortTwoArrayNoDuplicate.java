package com.common.programs.array;

import java.util.Set;
import java.util.TreeSet;

public class SortTwoArrayNoDuplicate {

	/*
	 * public void mergeArray(int a[], int b[]) {
	 * 
	 * int i = 0, j = 0, k = 0; // int merge[] = new int[a.length + b.length];
	 * 
	 * Set<Integer> myset = new TreeSet<Integer>();
	 * 
	 * 
	 * for( ; i < a.length || j < b.length ; i++, j++){ if(a[i] < b[j]){
	 * myset.add(a[i]); //i++; }else{ myset.add(b[j]); //j++; } }
	 * 
	 * for (; i < a.length; i++) { myset.add(a[i]); }
	 * 
	 * for (; j < a.length; j++) { myset.add(a[j]); }
	 * 
	 * System.out.println(myset);
	 * 
	 * }
	 */

	public int[] sortArray(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	public void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " | ");
		}
	}

	public int[] removeDulicateAndMerge(int[] a, int[] b) {
		int[] output = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a.length && j < b.length) {
			/*if(a[i] == b[j] || i==j){
				output[k] = a[i];
				i++;
				k++;
			}*/
			if (a[i] == b[j]) {
				//if (output[k-1] != a[i]) {
					output[k] = a[i];
					i++;
					k++;
			}//} 
			if (a[i] < b[j]) {
				//if (output[k-1] != a[i]) {
					output[k] = a[i];
					i++;
					k++;
				}
			} 
			if (a[i] > b[j]) {
				//if (output[k-1] != a[j]) {
					output[k] = b[j];
					j++;
					k++;
			
			}else 	{
				// if (output[k-1] != a[j]) {
				output[k] = b[j];
				j++;
				k++;
			}
		
	
		return output;
	}

	public static void main(String[] args) {
		int[] p = { 2, 4, 1, 9, 0 };
		int[] q = { 2, 7, 4, 3, 6 };
		int[] c = new int[p.length + q.length];

		SortTwoArrayNoDuplicate obj = new SortTwoArrayNoDuplicate();

		obj.sortArray(p);
		obj.sortArray(q);
		c = obj.removeDulicateAndMerge(p, q);
		obj.printArray(c);

	}

}
