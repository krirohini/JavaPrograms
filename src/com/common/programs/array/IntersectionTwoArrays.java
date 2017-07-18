package com.common.programs.array;

public class IntersectionTwoArrays {

	public void intersectElement(int[] a1, int[] a2) {
		
		if (a1.length > a2.length) {
			for (int i = 0; i < a1.length; i++) {
				int j = 0;
				while (j < a2.length) {
					if (a1[i] == a2[j]) {
						System.out.println(a1[i]);
					}
					j++;
				}
			}
		} else {
			for (int i = 0; i < a2.length; i++) {
				int j = 0;
				while (j < a1.length) {
					if (a2[i] == a1[j]) {
						System.out.println(a2[i]);
					}
					j++;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a1 = { 2, 3, 5, 7, 8, 4 };
		int[] a2 = { 9, 7, 2, 1, 5 };

		IntersectionTwoArrays obj = new IntersectionTwoArrays();
		obj.intersectElement(a1, a2);

	}

}
