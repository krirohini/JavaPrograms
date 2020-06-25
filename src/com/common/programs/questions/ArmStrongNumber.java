/**
 * 
 */
package com.rohini.common.questions;

/**
 * @author rohini
 *
 */
public class ArmStrongNumber {

	/**
	 * @param args
	 */
	
	public static boolean isArmStrong(int num){
		
		if(num <= 0) return false;
		
		int numberOfDigits = numberOfDigits(num);
		int sum = 0;
		int input = num;
		
		for(int i=0; i<numberOfDigits; i++){
			int digit = num%10;
            System.out.println("Current Digit is " + digit);

			sum = (int) (sum + Math.pow(digit, numberOfDigits));
            System.out.println("Current sumOfPower is " + sum);

			num = num /10;
		}
		
		if(sum == input){
			return true;
		}
		
		return false;
	}
	
	
	public static int numberOfDigits(int num){
		return (int) Math.floor(Math.log10(num) + 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isArmStrong(153));

	}

}
