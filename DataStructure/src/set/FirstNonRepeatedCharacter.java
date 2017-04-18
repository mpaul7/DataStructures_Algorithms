package set;

import java.util.HashMap;
import java.util.Scanner;
public class FirstNonRepeatedCharacter {
	public static Character firstNonRepeatedCharacter(String str) {
		Character c;
		HashMap<Character, Integer>  characterHashMap =  new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++){
			c = str.charAt(i);
			System.out.println(c);
			if(characterHashMap.containsKey(c)){
				// increment count corresponding to c
				System.out.println(characterHashMap.get(c));
				characterHashMap.put(c,  characterHashMap.get(c) + 1);
                } else{
                	characterHashMap.put(c, 1) ;
                	}
			}
		System.out.println(characterHashMap);
		
		// Search character HashMap in order of string str.
		for (int i = 0 ; i < str.length() ; i++){
			c = str.charAt(i);
			if(characterHashMap.get(c)  == 1)
				return c;
			}
		return null;
		}
	public static void main(String[] args) {
		char c = firstNonRepeatedCharacter("HHeelloo");
		System.out.println("The first non repeated character is :  " + firstNonRepeatedCharacter("HHeelloo"));
		}
	
	}
