package com.rohini.string;

import java.util.Stack;

public class ValidParentheses {

	/**
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * An input string is valid if:
	 * 
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order. 
	 */

	public boolean isValid(String s) {
		if (s.length() != 0) {
			Stack<Character> stack = new Stack<Character>();

			int i = 0;
			while (i < s.length()) {

				char currentChar = s.charAt(i);
				// System.out.println("....current...." + currentChar);
				if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
					stack.push(currentChar);
				}

				// If right symbol is encountered
				else if (currentChar == ')' && !stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} else if (currentChar == '}' && !stack.isEmpty() && stack.peek() == '{') {
					stack.pop();
				} else if (currentChar == ']' && !stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
				}
				i++;
				if (stack.isEmpty() && i == s.length()) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ValidParentheses obj = new ValidParentheses();
		String input1 = "()";
		String input2 = "(]";
		String input3 = "()[]{}";
		String input4 = "{[]}";
		System.out.println("\n.....Given......String....." + input1 + ".....is....." + obj.isValid(input1));
		System.out.println("\n.....Given......String....." + input2 + ".....is....." + obj.isValid(input2));
		System.out.println("\n.....Given......String....." + input3 + ".....is....." + obj.isValid(input3));
		System.out.println("\n.....Given......String....." + input4 + ".....is....." + obj.isValid(input4));

	}

}
