/**
 * 
 */
package com.commons.string;

import java.util.ArrayList;
import java.util.List;

public class CamelCase {

	public List<String> myList = new ArrayList<String>();
	public String curStr = null;
	public int totalString = 0;
	public int curPos;
	
	//public Map<Integer,Integer> lmap = new HashMap<Integer, Integer>();
	//public Map<Integer,Integer> umap = new HashMap<Integer, Integer>();
	
	
	public List<String> numberOfString(String str){
		
		for(curPos=0; curPos<str.length(); curPos++){
			char ch = str.charAt(curPos);
			int ascii = (int) ch;
			if(ascii >= 97 || ascii <= 122){
				curStr = curStr + ch;
			}
			if(ascii >=  65 || ascii <= 90){
				myList.add(curStr);
				curStr = null;
				curStr = curStr + ch;
				//curPos++;
			}		
		}		
		return myList;
		
	}
	
	
	
	public static void main(String[] args) {
		
		CamelCase obj = new CamelCase();
		obj.numberOfString("saTe");

	}

}
