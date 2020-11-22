/**
 * 
 */
package com.rohini.java8features;


public interface TestInterfaceJava8 {
	
	/* 
	 * Default Methods - 
	 * Methods which are defined inside the interface and tagged with default are known as default methods. 
	 * These methods are non-abstract methods.
	 */
	// Example of non-abstract (default) method
	default int sumOfGivenIntArray(int[] ary) {
		int sum = 0;
		for(int i=0; i<ary.length; i++) {
			sum = sum + ary[i];
		}
		
		return sum;
	}
	
	// Example of Abstract Methods
	void sayMore(String msg);  

}
