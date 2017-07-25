package com.commons.string;

public class StringCompareArray {

	public void sortArray(String[] str){
		String[] ary = new String[str.length];
		String temp;
		
		for (int i = 0; i<str.length; i++){			
			for(int j=1; j<str.length;  j++ ){
				if(str[i].compareTo(str[j]) < 0) {
					ary[i] = str[i];
					//str[i] = str[i];
					//str[i] = temp;
				}else {
					ary[i] = str[j];
				}
			}
			//ary[i] = temp;
			//temp = null ;
		}
		
		for(int k = 0; k<ary.length; k++){
			System.out.print(ary[k]+ " | ");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		String[] ary = { "an", "at", "sun", "sam"}; 
		
		StringCompareArray obj = new StringCompareArray();
		//System.out.print(obj.sortArray(ary));
		obj.sortArray(ary);

	}

}
