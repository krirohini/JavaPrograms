package com.myabstract.myinterface;


public class TestAll extends MyAbstract{

	public static void main(String[] args) {
		
		int aa=45;
		int bb=56;
		
		TestAll t= new TestAll();
		
		System.out.println("Sum  = " + t.sum(aa,bb) );
		t.printanything();
		
		System.out.println(t.F);
	
		TestAll.setS(48);
		System.out.println(TestAll.getS());
		
		System.out.println("Division  = "+ t.div(aa, bb));
		
	}

	@Override
	public int sum(int a, int b) {
		return a+b;
	}

}
