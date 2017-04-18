package singleWordString;
import java.util.HashMap;

public class UniqueCharacters {
	public static String str = "AZaaz";
	
	// =======  Using Array ==========
	// ======  Space complexity is high, 
	// as we have to create an array of length 256 
	public static boolean isUniqueCharacter(String str){
		if (str.length() > 256) return false;
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++){
			int val = str.charAt(i);
			System.out.println("int = " + val);
			if (char_set[val]) return false;
			char_set[val] = true;
			}
		return true;
		}
	
    // =========  using HashMap ==========
	public static boolean isUniqueCharacter3(String str){
		Character c; 
		if (str.length() > 256) return false;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i = 0; i< str.length(); i++){
			c = str.charAt(i);
			if (hm.containsKey(c)){
				return false;
				}else hm.put(c, 1);
			}
		return true;
		}
	// ========== main method   ================
	public static void main(String[] args) {
		boolean bn1 = isUniqueCharacter(str);
			boolean bn3 = isUniqueCharacter3(str);
			System.out.println("Is the string contains unique characters bn1 =  " + bn1);
			System.out.println("Is the string contains unique characters bn3 =  " + bn3);
			}
	}