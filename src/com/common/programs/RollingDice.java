package com.common.programs;


// Write a program that simulates rolling a pair of dice. 
public class RollingDice {
	
	public int simulateDice(){
		// this expression (int)(Math.random()*6) + 1 
		// does the computation to select a random integer between 1 and 6.
		int a=(int)(Math.random()*6) + 1;
		System.out.println(a);
		int b=(int)(Math.random()*6) + 1;
		System.out.println(b);
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		
		RollingDice r = new RollingDice();
		System.out.println("Simulate Value is ....");
		System.out.print(r.simulateDice());		
	}

}
