package singleWordString;


public class ReplaceSpacesInString {
	public static char[] str2;
	
public static void replaceSpaces(String s) {
	  
	char[] str = s.toCharArray();
	    String tempString = new String(str);
		System.out.println("tempString = " + tempString);
		
		int strLength = s.length(); 
		System.out.println("String length  = " + s.length() );
		int spaceCount = 0; 
		//count the number of empty spaces
				for (int i = 0; i < strLength; i++) {
					if (str[i] == ' ') {
						spaceCount++;
						
						}
					}System.out.println("SpaceCount= " + spaceCount);
					
		int newLength = strLength + spaceCount * 2;
		str2 = new char[newLength];
		
		
		int tempIndex = 0;
		for(int m = 0; m < s.length(); m++){
			
			if (str[m] == ' '){
				str2[m] = '%';
				str2[m+1] = '2';
				str2[m+2] = '0';
				tempIndex = tempIndex + 4;
			}else 
				str2[tempIndex] = str[m];	
		}
	}
			
	public static void main(String[] args) {
		
		replaceSpaces("a b c");
		String str3 = new String(str2);
		System.out.println(str3);

	}

}