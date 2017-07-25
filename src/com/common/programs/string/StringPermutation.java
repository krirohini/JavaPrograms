package com.commons.string;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {

	private boolean[] used;
	private StringBuilder out = new StringBuilder();
	private String in;
	Set<String> mySet = new HashSet<String>();
	
	public void Permutations( String str ){
		in = str;
		used = new boolean[ in.length() ];
	}
	
	public void permute( ){
		if( out.length() == in.length() ){
			System.out.println( out );
			return;
		}
		
		for( int i = 0; i < in.length(); ++i ){
			if( used[i] ) continue;
			out.append( in.charAt(i) );
			used[i] = true;
			permute();
			used[i] = false;
			out.setLength( out.length() - 1 );
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	/*public Set<String> permutation(String str){
		Set<String> mySet = new HashSet<String>();
		StringBuilder word = new StringBuilder();
		boolean[] used = new boolean[ str.length() ];
		//int cnt = str.length()-1;
		
		if(word.length() == str.length() ){
			System.out.println("Give A String for Permutation ");
			return null;
		}
		
		for( int i=0; i<str.length(); ++i){
			word.append( str.charAt(i));
			used[i] = true;
			
		int randomCnt = cnt;
		for(int i= str.length()-1; i >= 0;  i--){
			word = word.append(str.charAt(i));
		//	randomCnt = cnt-1;
			for(int k=0; k <= randomCnt ; k++){
				Random random = new Random();
				int indexRandom = random.nextInt(randomCnt);
				--randomCnt;
				word = word.append(str.charAt(indexRandom));
			}
			mySet.add(word);
			System.out.println("  " + word);
		}		
		return mySet;
		
	}
		}
	}
*/
	public static void main(String[] args) {

		String givenString = "abc";

		StringPermutation obj = new StringPermutation();
		//obj.permutation(givenString);
		obj.Permutations(givenString);

	}

}
