package com.common.programs;

public class MultipleFizzBuzz {

	public static void main(String[] args) {
		
		int n = 30;
			
		for(int i=14; i<=n; i++){
			if(i%3 !=0 && i%5 ==0){
				System.out.println("Buzz");
			}else if(i%3 == 0 ){
				if(i%5 == 0){
					System.out.println("FizzBuzz");
				}else {
					System.out.println("Fizz");
				}
			}else {
				System.out.println(i);
			}
		}

	}

}
