package com.commons.string;

import java.util.HashMap;
import java.util.Map;

/** Program to find 
 * the first NON REPEATING character 
 * in the given string
 */

public class FirstNonRepeatingChar {

	public char firstNonRptChar(String givenString) throws NullPointerException {
		Map<Character, Integer> map = new HashMap<>();
		List<Integer> indexes = new ArrayList<Integer>();
		if(givenString.length()!= 0) {
			for(int i=0; i<givenString.length(); i++) {
				char currentChar = givenString.charAt(i);
				if(!map.containsKey(currentChar)) {
					map.put(currentChar, i);
				}
			}
		}
		indexes = new ArrayList<Integer>(map.values());
		Collections.sort(indexes);
		System.out.println(".....indexes....." + indexes);

		return givenString.charAt(indexes.get(0));
	}
	
	public static void main(String[] args) {
		FirstNonRepeatingChar obj = new FirstNonRepeatingChar();
		System.out.println(".....firstNonRptChar....." + obj.firstNonRptChar2("! ythy "));
		System.out.println(".....firstNonRptChar....." + obj.firstNonRptChar2("ssress "));
		
	}

}
