package com.common.programs;

public class ArmStrong {
	
	public boolean isArmStrong(int num){
		int result = 0; 
		int orig = num; 
		while(num != 0){ 
			int remainder = num%10; 
			result = result + remainder*remainder*remainder; 
			num = num/10; 
		} 
		if(orig == result){ 
			return true; 
		} 
		return false;
	}

	public static void main(String[] args) {
		
		ArmStrong obj = new ArmStrong();
		System.out.println(obj.isArmStrong(153));
	}

}
