package singleWordString;
import java.util.HashMap;

public class FrequencyEachCharacter {
	
	public static void frequencyEachCharacter(String str) {
		Character c;
		HashMap<Character, Integer>  hm =  new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++){
			c = str.charAt(i);
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c) + 1);
				} else 	hm.put(c, 1) ;
			}
		System.out.println(hm);
		}

		public static void main(String[] args) {
			frequencyEachCharacter("Pack my box with five dozen liquor jugs.");
			}
		}
