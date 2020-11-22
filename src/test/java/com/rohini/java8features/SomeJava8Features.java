package com.rohini.java8features;

import java.util.StringJoiner;

public class SomeJava8Features implements TestInterfaceJava8 {

	
	public static void exampleStringJoiner() {
		/*
		 * StringJoiner - Java added a new final class StringJoiner in java.util
		 * package. It is used to construct a sequence of characters separated by a
		 * delimiter. We can create string by passing delimiters like comma(,),
		 * hyphen(-) etc. We can also pass prefix and suffix to the char sequence.
		 */

		// Example 1 - passing comma(,) as delimiter
		StringJoiner example1 = new StringJoiner(","); // passing comma(,) as delimiter

		// Adding values to StringJoiner
		example1.add("Rohini Example1");
		example1.add("Alex Example1");
		example1.add("Peter Example1");

		System.out.println("Example 1 - passing comma(,) as delimiter ... \n" + example1);
		
		// Example 2 - passing comma(,) and square-brackets (adding prefix and suffix) as delimiter
		StringJoiner example2 = new StringJoiner(":", "[", "]"); // passing comma(,) and square-brackets as delimiter

		// Adding values to StringJoiner
		example2.add("Rohini Example2");
		example2.add("Raheem Example2");
		System.out.println("\nExample 2 - passing comma(:) and square-brackets (adding prefix and suffix) as delimiter ... \n" + example2);

		// Example 3 - Merge Two StringJoiner
		StringJoiner merge = example1.merge(example2);
		System.out.println("\nExample 3 - Merge Two StringJoiner ... \n" + merge);
	}
	

	@Override
	public void sayMore(String msg) {
		System.out.println("\n" + msg + " \t This is inside Class");
		
	}
	
	/*
	 * forEach - 
	 * Java 8 provides a new method forEach() to iterate the elements of any Collection Classes.
	 * This method takes a single parameter which is a functional interface. So, we can pass lambda expression as an argument.
	 */
	public static void exampleForEach_FindMaximum(int[] numbers) {
		int maxSoFar = numbers[0]; 
        
        // for each loop 
        for (int num : numbers)  
        { 
            if (num > maxSoFar) 
            { 
                maxSoFar = num; 
            } 
        } 
        
        System.out.println("\nThe highest score is " + maxSoFar);
	}
	/*
	 * Limitations of for-each loop -
	 * 1. Not appropriate when you want to modify the array
	 * 2. Do not keep track of index. So we can not obtain array index using For-Each loop
	 * 3. Only iterates forward over the array in single steps
	 */
	
	
	
	
	public static void main(String[] args) {
		SomeJava8Features obj = new SomeJava8Features();

		// StringJoiner
		exampleStringJoiner();
		
		// Default
		int ary[] = {3,6,8,9,0};
		System.out.println("\nsumOfGivenIntArray ... " + obj.sumOfGivenIntArray(ary));
		obj.sayMore("Hello Rohini");
		
		// ForEach & Lambda Expression
		exampleForEach_FindMaximum(ary);
		

	}


}
