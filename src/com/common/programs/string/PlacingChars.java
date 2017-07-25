package com.commons.string;

public class PlacingChars {

	static char[] ary = { 'a', '1', 'b', '5', 'c', '6', ' ', ' ', ' ', ' ', ' ', ' ' }; 

	public static void replaceChar(char[] ary) {
		// ?? NOT WGIVING THE CORRECT OUTPUT
		
		
		// This counter i is used for iterating the array to find out a integer.
		int i = ary.length - 1;

		// Counter k is used for PLACING the CHAR, if we find any INTEGER in the
		// array.
		int k = ary.length - 1;

		// curPos is used for find the NUMBER at particular index.
		int curPos = ary.length - 1;

		while (i >= 0) {
			if (Character.isDigit(ary[i])) {
				// We will get that particular CHAR, which we have to PLACE.
				//i = curPos - 1;
				i = i - 1;

				// Current position will be 2 char BEFORE.
				//curPos = curPos - 2;
				curPos = i - 1;

				// If we get any INTEGER, we will start placing the char, which
				// we found at position, i = curPos -1;
				for (; k >= i; --k) {
					ary[k] = ary[i];
				}
			}
			i--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		replaceChar(ary);

	}

}
