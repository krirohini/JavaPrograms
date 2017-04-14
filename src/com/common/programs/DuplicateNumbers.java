package com.common.programs;

public class DuplicateNumbers {
	
	void DuplicateNum (int a[]){
		for(int k=0; k<a.length; k++ ) { 	System.out.println(a[k]) ;  }
		int count=0;
		System.out.println("==============");
		for(int i=0; i<a.length-1; i++){
			for(int j=a.length-1; j>i; j--){
				if( a[i]==a[j]){
					System.out.println(a[i]);
					count++;			
				}
			}
		}
		System.out.print("Total Number of Duplicate Elements are ..... ");
		System.out.print(count);
	}

	public static void main(String[] args) {
		
		int[] b={23, 56, 34, 67, 23, 89, 90, 56, 67, 45, 45};
		DuplicateNumbers num = new DuplicateNumbers();
		num.DuplicateNum(b);
	}

}
