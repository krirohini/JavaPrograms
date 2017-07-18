
package com.commons.string;

import java.util.Random;

public class LunchMenuPairs {

	public static String[][] matchLunches(String[][] lunchMenuPairs, String[][] cuisinePref) {
		String[][] output= new String[cuisinePref.length][2];
		
			for(int k =0;k<cuisinePref.length;k++) {
				for(int i =0; i<lunchMenuPairs.length;i++){
					if(cuisinePref[k][1].equals("*")) {
						output[k][0] = cuisinePref[k][0];
						output[k][1]= lunchMenuPairs[getRandomCuisine(lunchMenuPairs.length)][0];
						break;
					} else if(lunchMenuPairs[i][1].equalsIgnoreCase(cuisinePref[k][1])) {
						output[k][0] = cuisinePref[i][0];
						output[k][1]= lunchMenuPairs[k][0];
						break;
					}
				}
			}
		
		return output;
	}
	
	public static int getRandomCuisine(int cuisineLength) {
		Random rand = new Random();
		return rand.nextInt(cuisineLength);
	}	
	
	public static void main(String[] args) {
	
	}


}
