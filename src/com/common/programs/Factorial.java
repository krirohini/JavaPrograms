package com.common.programs;

public class Factorial {
	
	public long fact(int a){
	
		int f = 1;		
		if( a<0){
			System.out.println("Please enter a positive number");
			return 0;
		}
		else if (a==0) {
			return 1;
		}
		else {
			for( int i=1; i<=a; i++){
				f=f*i;
			}
			return f;
		}
	}
	
	
	public long factRecursive(int a) {
	
		long f ;		
		if( a<0){
			System.out.println("Please enter a positive number");
			return 0;
		}
		else if (a==0) {
			return 1;
		}
		else {			
				f= a*factRecursive(a-1);
				return f;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial factorial = new Factorial();
		System.out.println(("Factorial is ....." + factorial.factRecursive(9)));
		
		
	}

}
