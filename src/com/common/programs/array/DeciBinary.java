package com.rohini.array;

public class DeciBinary {

	/**
	 * Problem: Partitioning Into Minimum Number Of Deci-Binary Numbers
	 * 
	 * A decimal number is called deci-binary if each of its digits is either 0 or 1
	 * without any leading zeros. For example, 101 and 1100 are deci-binary, while
	 * 112 and 3001 are not.
	 * 
	 * Given a string n that represents a positive decimal integer, return the
	 * minimum number of positive deci-binary numbers needed so that they sum up to
	 * n. Example 1:
	 * 
	 * Input: n = "32" --> Output: 3 --> Explanation: 10 + 11 + 11 = 32 Example 2:
	 * 
	 * Input: n = "82734" --> Output: 8 --> Example 3:
	 * 
	 * Input: n = "27346209830709182346" --> Output: 9
	 * 
	 * Input: n = "82346" --> Output: 8 Explanation :- think of graph as a stack of
	 * numbers to be added:
	 * 
	 * 11111 
	 * 11111 
	 * 10111 
	 * 10011 
	 * 10001 
	 * 10001 
	 * 10000 
	 * 10000
	 * ------
	 * 82734
	 * 
	 */

	public int minPartitions(String n) {
		char[] ary = n.toCharArray();
		System.out.println("ary...." + ary);
		char best = '0';
		System.out.println("1....best...." + best);

		for (char ch : ary) {
			System.out.println("\n Inside for....ch...." + ch);
			System.out.println("Inside for....best...." + best);

			if (ch > best) {
				best = ch;
				System.out.println("Insise if....best...." + best);
			}
		}
		int count = best - '0';
		System.out.println("count...." + count);

		return count;
	}

	public static void main(String[] args) {
		DeciBinary obj = new DeciBinary();

		obj.minPartitions("82346");

	}

}
