package singleWordString;

import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseString {
	
	public static void reverseString(String str){
		String reverse1 = ""; 
			
		for (int i = str.length() - 1; i >=0; i--){
			reverse1 += str.charAt(i);
			}
		System.out.println(" reverse1  = " + reverse1);
		
		// ===== Using StringBuilder ==========
		StringBuilder reverse2 = new StringBuilder();
		for (int i = str.length() -1; i >= 0; i--){
			reverse2.append(str.charAt(i));
			}
		System.out.println(" reverse2  = " + reverse2);

		// ======= Using StringBuffer  ========= 
		StringBuffer buffer = new StringBuffer(str);
		buffer = buffer.append("man");
		System.out.println(" buffer ONLY  = " + buffer); // uoy era woh
		System.out.println(" buffer  = " + buffer.reverse()); // uoy era woh
		
		// ========= Using Stack  =================
		// Stack only reverse the order of words
		Stack<String> st = new Stack<>();
		StringTokenizer tk = new StringTokenizer(str);
		HashMap <String, Integer> hm = new HashMap<String, Integer>();
		int count = 0;
		while(tk.hasMoreTokens()){
			String temp = tk.nextToken();
			st.push(temp);
			count++;
			}
		System.out.println("st  = " + st);
		System.out.println("count" + count);
		
		int stc = st.size();
		System.out.println("stc" + stc);
		// to just reveerse the ofer of words
		for(int i = 0; i < 3 ; i++){
			System.out.println(st.pop());
		}
		
		//to reverse the order of words and characters of the words
		for(int i = 0; i < count; i++){
			System.out.println(new StringBuffer(st.pop()).reverse());
		}
	}
	
	public static void main(String[] args) {
		reverseString("How are you");
		
	}

}
