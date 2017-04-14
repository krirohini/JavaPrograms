/**
 * 
 */
package com.commons.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author rohini
 *
 */
public class LongestSubString {

	public String longestString(String str) {
		System.out.println("Given String is .. " + str);
		// int count=0;

		Map<String, Integer> map = new HashMap<String, Integer>();

		StringTokenizer st = new StringTokenizer(str, " ");

		while (st.hasMoreElements()) {
			String tempStr = (String) st.nextElement();
			map.put(tempStr, tempStr.length());
			/* System.out.println(st.nextElement()); */
			// count++;
		}

		/*
		 * while(map.get(key) if(ma) }
		 */

		return null;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
