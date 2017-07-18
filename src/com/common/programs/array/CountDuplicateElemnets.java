/**
 * 
 */
package com.common.programs.array;

public class CountDuplicateElemnets {

	public static void main(String args[]) {

		int[] ary = { 2, 1, 3, 4, 4, 2, 4 };

		int count = 1;
		int i = 1;
		StringBuffer str = new StringBuffer();		

		while (i < ary.length) {
			int temp = ary[i - 1];
			if (ary[i] == temp) {				
				count++;				
				i++;
			} else {
				str = str.append(count).append(temp).append(' ');
				count = 1;
				i++;
			}
		}
		System.out.println(str);
	}

}
