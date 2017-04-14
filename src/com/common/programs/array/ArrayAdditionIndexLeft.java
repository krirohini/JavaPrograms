/**
 * 
 */
package com.common.programs.array;

/**
 * @author rohini
 *
 */
public class ArrayAdditionIndexLeft {

	/**
	 * @param args
	 */
	
	public void additionAllLeftIndexNumber(int[] a){
		int sumAll = 0;
		for(int i=0; i<a.length; i++){
			sumAll = sumAll + a[i]; 
		}
		for(int k=0; k<a.length; k++){
			a[k] = sumAll -a[k];
			System.out.print(" " +a[k]);
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayAdditionIndexLeft obj = new ArrayAdditionIndexLeft();
		int[] b = { 2, 3, 4, 5, 6 };
		obj.additionAllLeftIndexNumber(b);

	}

}
