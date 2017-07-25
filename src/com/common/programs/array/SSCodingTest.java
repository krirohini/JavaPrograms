/**
 * 
 */
package com.common.programs.array;


public class SSCodingTest {

	private static int largestNumber(int data) {
	    int num = data;
	    int[] times = new int[10];
	    if(data == 0){
	    	return 0;
	    }
	    while (num != 0) {
	        if (num == 0) {
	            break;
	        }
	        int val = num % 10;
	        times[val]++;
	        num /= 10;
	    }
	    String largestNumber = "";
	    for (int i = 9; i >= 0; i--) {
	        for (int j = 0; j < times[i]; j++) {
	            largestNumber += i;
	        }
	    }
	    return Integer.parseInt(largestNumber);
	}
	
	
	
	public static int test(int[] a){
		int max =  2;
		for  (int i=0; i<a.length -1; i++){
			int tmp = 2; 
			
			for ( int j = i+2 ; j < a.length -1 ; j = j+2) {
				if(a[i] == a[j] && a[i+1] == a[j+1]) {
					tmp = j -i+2; 
					max = Math.max(tmp, max);

				} else {
					max = Math.max(tmp, max);
					break;
				}
			}
		}
		return max;
	}
	
	public static int test2(int[] a){
		int max =  2;
		int tmp =2;
			
			for ( int j = 0 ; j < a.length -1 ; j = j+2) {
//				int left = A
				if(a[j] == a[j+2] && a[j+1] == a[j+3]) {
					tmp = tmp+2; 
//					max = Math.max(tmp, max);

				} else {
					max = Math.max(tmp, max);
					tmp = 2;
					break;
				}
			}
		
		return max;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(SSCodingTest.largestNumber(0));
		int [] a  = { 5,4,-3,5,-3,4,-3,4,-3}; 
//		int [] a  = { 5,4,-3,4,-3,5,-3,5}; 
		int range = test2(a);
		System.out.println(test(a));

	}

}
