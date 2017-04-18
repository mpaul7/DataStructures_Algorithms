package MorThanTwoWordsString;

import java.util.HashMap;

public class NumberOfWordsString {
	public static void frequencyEachCharacter(String str) {
		Character c;
		HashMap<Character, Integer>  hm =  new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++){
			c = str.charAt(i);
			if(hm.containsKey(c)){
				hm.put(c,  hm.get(c) + 1);
				} else hm.put(c, 1);}
			
		if(hm.containsKey(' '))
			System.out.println("# of words = " + (hm.get(' ')+1) );
			else System.out.println("# of words = 1");
		System.out.println(hm);
		}
	public static void main(String[] args) {
		frequencyEachCharacter("Alive is awesome");
		//frequencyEachCharacter("Alive");
		}
}
