package com.myabstract.myinterface;

public abstract class MyAbstract {
	
	int x, y;
	public static int s;
	public final int F=6;
	
	public void printanything(){
		System.out.println("This can print ");
	}
	
	public static int getS() {
		return s;
	}

	public static void setS(int s) {
		MyAbstract.s = s;
	}

	public abstract int sum(int a, int b);
	
	public double div(double a, double b) {
		return a/b;
	}

}
