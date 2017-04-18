package singleWordString;

import java.util.HashMap;
public class FrequencySpecificCharacter {
	
	public static Integer frequencySpedificCharacter(String str, Character s){
		Character c; 
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i= 0; i < str.length(); i++){
			c = str.charAt(i);
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		return hm.get(s);
		}
	
	public static void main(String[] args) {
		frequencySpedificCharacter("Hello", 'H');
		System.out.println("Frequency of the word is = " + frequencySpedificCharacter("Hello", 'l'));
		}
	}


