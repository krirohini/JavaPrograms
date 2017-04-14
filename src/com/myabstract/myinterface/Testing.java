/**
 * 
 */
package com.myabstract.myinterface;

public abstract class Testing {

	public abstract int add(int a, int b);
	
	Testing(){
		System.out.println("Hello, I'm a abstract class");
	}
	
	public static void main(String[] args) {
		System.out.println("Nice to meet you, I'm main method of abstract class");	
		
			TesingImpl obj = new TesingImpl();
			System.out.println(obj.add(23, 2));

		

	}
}
