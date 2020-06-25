/**
 * 
 */
package com.rohini.common.questions;

/**
 * @author rohini
 *
 */
public class FindMinInRotatedSortedArray {

	/**
	 * @param args
	 */

	/*
	 * Suppose an array sorted in ascending order is rotated at some pivot
	 * unknown to you beforehand. (i.e., [0,1,2,4,5,6,7] might become
	 * [4,5,6,7,0,1,2]).
	 * 
	 * Find the minimum element. You may assume no duplicate exists in the
	 * array.
	 * 
	 * Example 1: Input: [3,4,5,1,2] Output: 1
	 * 
	 * Example 2: Input: [4,5,6,7,0,1,2] Output: 0
	 * 
	 */

	public static int findMin(int[] arr, int low, int high) {
		if (arr.length == 0)
			return -1;
		if (arr.length == 1)
			return arr[0];

		// This condition is needed to handle the case when array
		// is not rotated at all
		if (high < low)
			return arr[0];

		// If there is only one element left
		if (high == low)
			return arr[low];

		// Find mid
		int mid = low + (high - low) / 2; /* (low + high)/2; */

		// Check if element (mid+1) is minimum element. Consider
		// the cases like {3, 4, 5, 1, 2}
		if (mid < high && arr[mid + 1] < arr[mid])
			return arr[mid + 1];

		// Check if mid itself is minimum element
		if (mid > low && arr[mid] < arr[mid - 1])
			return arr[mid];

		// Decide whether we need to go to left half or right half
		if (arr[high] > arr[mid])
			return findMin(arr, low, mid - 1);
		return findMin(arr, mid + 1, high);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = { 3, 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(findMin(ary, 0, 8));

	}

}
