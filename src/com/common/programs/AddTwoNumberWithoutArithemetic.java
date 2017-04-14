package com.common.programs;

public class AddTwoNumberWithoutArithemetic {

	public int add_no_arithm(int a, int b) {
		if (b == 0) return a;
		int sum = a ^ b; // add without carrying
		int carry = (a & b) << 1; // carry, but don’t add
		return add_no_arithm(sum, carry); // recurse
	}

	public static void main(String[] args) {
		int a=45;
		int b=524;
		AddTwoNumberWithoutArithemetic  addTwo = new AddTwoNumberWithoutArithemetic ();
		System.out.println(addTwo.add_no_arithm(a, b));
		
	}

}
