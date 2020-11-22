package com.rohini.java8features;

public abstract class TestClass implements TestInterface {

	public static void main(String[] args) {
		
		System.out.println("Hello Rohini");
		TestInterface testInterface = (int a, int b) -> a+b ;
		
		int total = testInterface.sum(5, 64);
		System.out.println(total);
	}
}


