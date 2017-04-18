package singleWordString;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class IsPalindrome {
	public static void isPalindrome(String str){
		String original = str;
		String reverse1 = "";
		
		for (int i = original.length() - 1; i >=0; i--){
			reverse1 += original.charAt(i);
			}
		if (original.equals(reverse1))
			System.out.println("The string is a palindrome.");
		else
			System.out.println("The string is not a palindrome.");
		System.out.println(" reverse1  = " + reverse1);
		
		// Other method to reverse a String
		StringBuilder reverse2 = new StringBuilder();
		for (int i = str.length() -1; i >= 0; i--){
			reverse2.append(str.charAt(i));
			}
		System.out.println(" reverse2  = " + reverse2);

		// Method to reverse words in a multi word sting
		StringBuffer buffer = new StringBuffer("how are are you");
		System.out.println(" buffer  = " + buffer.reverse()); // uoy era woh
		
		// ========= Using Stack  ==================== 
		//Method to reverse words in a multi word sting 
		String str1 = "how are are you";
		Stack<String> st = new Stack<>();
		StringTokenizer tk = new StringTokenizer(str1);
		HashMap <String, Integer> hm = new HashMap<String, Integer>();
		while(tk.hasMoreTokens()){
			String temp = tk.nextToken();
			st.push(temp);
			}
		System.out.println(st);
		System.out.println(st.size());
		
		for(int i = 0; i <= st.size(); i++){
			String temp = st.pop();
			System.out.println(temp);
			if (hm.containsKey(temp))
				
			hm.put(temp, hm.get(temp) + 1);
			else hm.put(temp, 1);
			}
		System.out.println(hm);
		}

	public static void main(String[] args) {
		isPalindrome("how are you");
		}
	}
