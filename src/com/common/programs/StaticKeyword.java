package com.common.programs;

public class StaticKeyword {

	// static block
	static {
		System.out.println("Hello, This is static block by ROHINI");
	}

	public static void main(String args[]) {
		System.out.println("Hello main");
	}

}

// example of abstract class that have method body
abstract class Bike {
	Bike() {
		System.out.println("bike is created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear changed");
	}
}

class Honda extends Bike {
	void run() {
		System.out.println("running safely..");
	}
}

class TestAbstraction2 {
	public static void main(String args[]) {
		Bike obj = new Honda();
		obj.run();
		obj.changeGear();
	}
}