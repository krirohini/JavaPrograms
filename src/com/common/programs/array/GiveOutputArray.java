package com.common.programs.array;

import java.util.Random;
import java.util.Scanner;

public class GiveOutputArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] ary = new int[num];
		
		Random random = new Random();
		if(num > 0){
			for(int i = 0; i< num; i++){
				int randomNumber = random.nextInt(Integer.MAX_VALUE) + 1;
				ary[i] = randomNumber;
				System.out.print( ary[i] + " | ");
			}
		}
	}

}
