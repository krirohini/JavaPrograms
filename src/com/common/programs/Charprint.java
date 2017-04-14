/**
 * 
 */
package com.common.programs;

/**
 * @author rohini
 *
 */
public class Charprint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		StringBuffer str = new StringBuffer();
		
		for(int i=0; i<n ; i++){
			str=str.append('*');
			System.out.println(str);
		}
		for(int j=n-1; j>=0; j--){
			str=str.deleteCharAt(j);
			System.out.println(str);
		}

	}

}
