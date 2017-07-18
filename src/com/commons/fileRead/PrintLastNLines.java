package com.commons.fileRead;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrintLastNLines {

	// public String[] ary = new String[4];
	public static List<String> list = new ArrayList<>(4);

	// public void shiftTo(String[] ary){
	/*
	 * public void shiftTo(List list){ //String temp = ary[0]; for(int i=0;
	 * i<ary.length; i++){ String temp = ary[i]; ary[i] = ary[i+1]; ary[i+1] =
	 * temp; }
	 * 
	 * for(Object s:list){ String temp = list[i]; ary[i] = ary[i+1]; ary[i+1] =
	 * temp; } }
	 */

	public List<String> printNLines(String myfile, int lines) throws FileNotFoundException {

		FileInputStream fileStream = new FileInputStream("myfile");

		DataInputStream in = new DataInputStream(fileStream);

		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		String strLine;
		// Read File Line By Line
		try {
			while ((br.readLine()) != null) {

				// Print the content on the console
				strLine = br.readLine();
				list.add(strLine);
				in.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<String> resultList = new ArrayList<String>(list.subList(lines - list.size(), list.size() - 1));
		// System.out.println(resultList);
		return resultList;

	}

	public static void main(String[] args) throws IOException {

		PrintLastNLines obj = new PrintLastNLines();
		// obj.printNLines("mytestfile.txt", 2);

		int lines = 3;
		FileInputStream fileStream = new FileInputStream("mytestfile.txt");

		DataInputStream in = new DataInputStream(fileStream);

		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		//String strLine;
		// Read File Line By Line
		try {
			while ((br.readLine()) != null) {

				list.add(br.readLine());
				// Print the content on the console
				//strLine = br.readLine();
				//list.add(strLine);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		in.close();
		
		System.out.println(list);
		List<String> resultList = new ArrayList<String>(list.subList(list.size()-lines-1, list.size() - 1));
		System.out.println(resultList);

	}

}
