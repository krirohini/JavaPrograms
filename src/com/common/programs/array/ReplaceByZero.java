package com.common.programs.array;

public class ReplaceByZero {
	
	
	public void replace(int[][] a, int m, int n){
		boolean zero = false;
		
		for(int i=0; i<m; ++i){
			for(int j=0; j<n; ++j){
				if(a[i][j] == 0){
					zero = true;
					break;
				}
			}
			//for(int k=0; k<n; k++)
		}
		
		for(int i=0; i<m; ++i){
			for(int j=0; j<n; ++j){
				a[i][j] = 0;
				System.out.print(a[i][j] + "|");
			}
			System.out.println();
		}
		
		
		
	}

	public static void main(String[] args) {
		
		int[][] ary = {{2,3}, {3,4}, {0,5}};
		
		ReplaceByZero obj = new ReplaceByZero();
		obj.replace(ary, 3, 2);

	}

}
