package com.common.programs;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountInversion {
	
	private static long[] array;
	private static int noOfInversion =0;

	public static long[] getDataFromFile() throws FileNotFoundException, IOException {
		array = new long[5];
		int indexInputArray = 0;
		int count =0;
		try{
			// Open the file that is the first 
			// command line parameter
			FileInputStream fstream = new FileInputStream("numbersFile.txt");
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
	        BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			//Read File Line By Line
			while (( strLine = br.readLine()) != null) 	{
				array[indexInputArray] = Integer.parseInt(strLine);
				System.out.print (" || " +array[indexInputArray]);
				indexInputArray++;
				count = count +1;
			}
			//Close the input stream
			in.close();
			System.out.println();
			System.out.println("No. of Lines...." + count);
			}catch (Exception e){//Catch exception if any
				System.err.println(" Error: " + e.getMessage());
			}
		// print out the list
		return array;
	}
	
	public void mergeSort(long[] array2) {
		mSort(array2, 0, array2.length - 1);
	}

	public void mSort(long[] array2, int lowerBound, int upperBound) {

		if (lowerBound < upperBound) {
			int mid = (lowerBound + upperBound) / 2;
			mSort(array2, lowerBound, mid);
			mSort(array2, mid + 1, upperBound);
			
			
			merge(array2, lowerBound, mid, upperBound);
			/*for(int k =0 ; k < array2.length; ++k ) {
				System.out.print(" " + array2[k] +  ",");
			}
			System.out.println(" ||");*/
		}
	}

	public void merge(long[] array2, int lowerBound, int mid, int upperBound) {

		int subArraySize = upperBound - lowerBound + 1;
		long[] sortArray = new long[subArraySize];
		
		try {
			
			int indLeft = lowerBound;
			int indRight = mid+1;
			int indOut = 0;
			
			while ((indLeft <= mid) && (indRight <= upperBound)) {
					if (array2[indLeft] < array2[indRight])  {						
						sortArray[indOut++] =  array2[indLeft++];
					} else {
						sortArray[indOut++] = (int) array2[indRight++];
						noOfInversion ++;
					}
					
				}

			/*while (indLeft <= mid) {
				 sortArray[indOut++] =  array2[indLeft++];
			 }
			
			while (indRight <= upperBound) {
				 sortArray[indOut++] =  array2[indRight++];
			 }*/

			/*for(int a =0 ; a < subArraySize; ++a ) {
				inputArray[a+lowerBound] = sortArray[a];
			}*/
			
			System.out.println("\n Total No. of Inversions are ..." + noOfInversion);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// String file="numbersFile.txt";
		//
		// C:\Rohini\College Study\Algorithms Design and Analysis Part 1

		CountInversion obj = new CountInversion();
		CountInversion.getDataFromFile();
		obj.mergeSort(array);

	}

}
