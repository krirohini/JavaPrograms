/**
 * 
 */
package com.rohini.common.questions;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author rohini
 *
 */
public class BalancedParathesis {

	/**
	 * @param args
	 */
	
	public static boolean balancedBraces(String givenString){
		
		int len = givenString.length();
		
		Deque<Character> stack = new LinkedList<Character>();
		
		for(int i=0; i<len;  i++){
			char currentChar = givenString.charAt(i);
			
			if(currentChar =='[' || currentChar =='{' || currentChar =='(' ){
				stack.push(currentChar);
			}else if(currentChar ==')' || currentChar =='}' || currentChar==']'){
				if( !stack.isEmpty()){
					char top = stack.peek();
					if(top == '(' && currentChar ==')'){
						stack.poll();
					}
					if(top == '[' && currentChar ==']'){
						stack.poll();
					}
					if(top == '{' && currentChar =='}'){
						stack.poll();
					}
				}else return false;
			}else{
				return false;
			}
		}
	
		return stack.isEmpty() ? true:false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(balancedBraces("[()]{}{[()()]()}"));

	}

}
