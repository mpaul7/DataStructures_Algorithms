package TwoWordsString;


public class IsAnagram {
	public static String sort(String s) {		
		// bring the string in a character array, to sort it
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		String tempString = new String(content);
		System.out.println(tempString);
		return new String(content);
		}
	public static boolean isAnagram(String s, String t) {
		// unsorted string with same characters will return false.
		System.out.println(s.equals(t));
		// first check length of both the strings, if length is not same, 
		// then characters in two strings can not have same characters. 
		if (s.length() != t.length())
			return false;
		
		return sort(s).equals(sort(t));
		}
	public static void main(String[] args) {
		boolean isAnagram2 = isAnagram("act", "cat");
		System.out.println(isAnagram2);
		}
	}
