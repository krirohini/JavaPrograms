/**
 * 
 */
package com.javatopics.string.impl.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.commons.string.StringPalindrome;
	
	/**
	 * @author Guest
	 *
	 */
	public class StringPalindromeTestCase {

	/**
	 * Test method for 
	 * {@link com.commons.string.StringPalindrome#palindrome(java.lang.String)}.
	 */
	@Test
	public void testPalindrome() {
		//fail("Not yet implemented");
		StringPalindrome str = new StringPalindrome();
		boolean result = str.palindrome("papa");		
		assertEquals(false, result);
	}

}
