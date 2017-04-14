package com.datastructure.programs.hash;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

		public String letterCountString(String str) {
			Map<Integer, String> hashMap = new HashMap<Integer, String>();
			
			Object mapper = new Object();
			 
			try {
		 
				//convert JSON string to Map
//				hashMap = mapper.readValue(json, 
//				    new TypeReference<HashMap<String,String>>(){});
		 
				System.out.println(hashMap);
		 
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		
		String encoding = "";
			
		for (int k = 0; k < str.length(); k++) {
			int count = 1;
			char ch = str.charAt(k);
			int i = str.length() - 1;
			if (k == i ) {
				return encoding;
			} 
//			else if (str.substring(k, i).equalsIgnoreCase(encoding)) {
//				
//			}
			else {
				for (; i > k; i--) {
					char chExit = str.charAt(i);
					if (ch == chExit) {
						++count;
					}
				}
			}
			encoding = encoding + ch + String.valueOf(count);
		}
		return encoding;
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
