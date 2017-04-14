package com.common.sorting;

public class MergeSort {

	public void mergeSort(int a[]) {
		mSort(a, 0, a.length - 1);
	}

	public void mSort(int a[], int lowerBound, int upperBound) {
		if (lowerBound < upperBound) {
			int mid = (lowerBound + upperBound) / 2;
			mSort(a, lowerBound, mid);
			mSort(a, mid + 1, upperBound);
			merge(a, lowerBound, mid, upperBound);
			for (int k = 0; k < a.length; ++k) {
				System.out.print(" " + a[k] + ",");
			}
			System.out.println(" || ");
		}
	}

	public void merge(int[] inputArray, int lowerBound, int mid, int upperBound) {
		int subArraySize = upperBound - lowerBound + 1;
		int[] sortArray = new int[subArraySize];
		try {
			int indLeft = lowerBound;
			int indRight = mid + 1;
			int indOut = 0;
			while ((indLeft <= mid) && (indRight <= upperBound)) {
				if (inputArray[indLeft] < inputArray[indRight]) {
					sortArray[indOut++] = inputArray[indLeft++];
				} else {
					sortArray[indOut++] = inputArray[indRight++];
				}
			}
			while (indLeft <= mid) {
				sortArray[indOut++] = inputArray[indLeft++];
			}
			while (indRight <= upperBound) {
				sortArray[indOut++] = inputArray[indRight++];
			}

			for (int a = 0; a < subArraySize; ++a) {
				inputArray[a + lowerBound] = sortArray[a];
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		int b[] = { 23, 56, 21, 7, 9, 26, 47, 38, 4 };
		MergeSort m = new MergeSort();
		System.out.println("The sorted array is .....\n");
		m.mergeSort(b);
	}
}
