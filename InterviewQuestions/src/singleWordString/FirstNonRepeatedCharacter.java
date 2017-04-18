package singleWordString;
import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {
	
	public static Character firstNonRepeatedCharacter(String str) {
		Character c;
		HashMap<Character, Integer>  hm =  new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++){
			c = str.charAt(i);
			if(hm.containsKey(c)){
				hm.put(c,  hm.get(c) + 1);
                } else hm.put(c, 1);
			}
		System.out.println(hm);
		// Search character HashMap in order of string str.
		for (int i = 0 ; i < str.length() ; i++){
			c = str.charAt(i);
			if(hm.get(c)  == 1)
				return c;
			}
		return null;
		}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println("The first non repeated character is :  " + firstNonRepeatedCharacter("HHeelloo"));
		}
	
	}