package singleWordString;

public class IsPanlindromeRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("check palindrome  = "	+ ispalindrome("madam"));
	}

	private static boolean ispalindrome(String str) {
		
		// if length is 0 or 1 then Strintg is not palindrome
		if(str.length() == 0 || str.length() == 1)
         return true;
		
		if (str.charAt(0) == str.charAt(str.length()-1))
			
			return ispalindrome(str.substring(1, str.length()-1 ));
		
		return false;
	}


}
