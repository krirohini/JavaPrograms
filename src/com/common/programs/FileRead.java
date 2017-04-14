package com.common.programs;

import java.io.*;
class FileRead 
{
   public static void main(String args[])
	{
	   int count=0;
      try{
		// Open the file that is the first 
		// command line parameter
		FileInputStream fstream = new FileInputStream("numbersFile.txt");
		// Get the object of DataInputStream
		DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
		//Read File Line By Line
		while (( br.readLine()) != null) 	{
			// Print the content on the console
			strLine = br.readLine();
			count ++;
			System.out.println (strLine);
		}
		//Close the input stream
		in.close();
		System.out.println("////////////////  " + count);
		}catch (Exception e){//Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}
}
