/**
 * 
 */
package com.javatopics.string.impl.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.commons.string.StringAnagram;

/**
 * @author Guest
 *
 */
public class StringAnagramTestCase {

	/**
	 * Test method for {@link com.commons.string.StringAnagram#checkAnagram(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testCheckAnagram() {
		//fail("Not yet implemented");
		StringAnagram stringAnagram = new StringAnagram();
		stringAnagram.checkAnagram("Rohini", "Rohiin");
	}

}
