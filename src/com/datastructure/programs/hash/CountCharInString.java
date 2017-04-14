/**
 * 
 */
package com.datastructure.programs.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

/**
 * @author rohini
 *
 */
public class CountCharInString {

	/**
	 * @param args
	 */
	
	public void countConcanateChar(String str){
		
		Map<Character, Integer> countCharMap = new HashMap<Character, Integer>();
		StringBuffer charAndCount = new StringBuffer();
		
		if(str.length()==0){
			return ;			
		}else if(str.length()==1){
			return ;
		}else{
			
			char[] ary=str.toCharArray();
			
			for(char c:ary) {
				if( ! countCharMap.containsKey(c)){
					countCharMap.put(c, 1);
				}else{
					countCharMap.put( c , countCharMap.get(c)+1);					
				}					
			}	
			
			/*Iterator<Entry<Character, Integer>> itr = countCharMap.entrySet().iterator();
			for(itr.hasNext()) {
				Map.Entry pair = (Map.Entry)itr.next();
				charAndCount = pair.getKey() + pair.getValue();
		        //System.out.println(pair.getKey() + pair.getValue());
		        //it.remove(); // avoids a ConcurrentModificationException
			}
			*/
			
			Iterator it = countCharMap.entrySet().iterator();
		    while (it.hasNext()) {
		    	char tempChar;
		    	int tempCount;
		        Map.Entry pair = (Map.Entry)it.next();
		        tempChar =  (char) pair.getKey(); 
		        tempCount = (int) pair.getValue();
		        /*System.out.println(pair.getKey() + " = " + pair.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
		        */
		       // charAndCount = tempChar + tempCount;
	    }
		    System.out.println(charAndCount);
			
		}		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountCharInString obj = new CountCharInString();
		obj.countConcanateChar("Rohini");

	}

}
