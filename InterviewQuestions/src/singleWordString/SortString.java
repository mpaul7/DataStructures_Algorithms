package singleWordString;

import java.util.Arrays;
import java.util.HashMap;

public class SortString {
	static char[] alphabets  = new char[26];
	
	public static void checkPangram(String str){
	// populate an array with alphabets
		for (int i = 0; i <26; i++){
			alphabets[i] = (char)(i+97);
		}
	System.out.println(alphabets);
	
	
		
	}
	
	public static String sort (String strIn){
		String str = strIn.toLowerCase();
		char [] contents = str.toCharArray();
		Arrays.sort(contents);
		String SortedString = new String(contents);
		frequencyEachCharacter(SortedString);
		return SortedString;
	}
	
	
	
	public static void frequencyEachCharacter(String  str) {
		Character c;
		HashMap<Character, Integer>  hm =  new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++){
			c = str.charAt(i);
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c) + 1);
				} else 	hm.put(c, 1) ;
			}
		System.out.println(hm);
		System.out.println((char)65);
		System.out.println((int)'z');
		}
	public static void main(String[] args) {
		
		System.out.println(sort("Pack my box with five dozen liquor jugs"));
		//System.out.println(sort("This is a string"));
		checkPangram(null);
	}

}
