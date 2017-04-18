package bookExamples;

public class StringCompression {
	public String compressBad(String str) {
		String mystr = "";
		char last = str.charAt(0);
		System.out.println("last1 " + last);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) { // Found repeat char
				count++;
			} else { // Insert char count, and update last char
				mystr += last + "" + count;
				last = str.charAt(i);
				System.out.println("last2 " + last);
				count = 1;
				}
			}
		return mystr + last + count;
		}
	
	public static void main(String[] args) {
		StringCompression strCom = new StringCompression();
		String CompressedString = strCom.compressBad("aaccccaa");
		System.out.println(CompressedString);
		}
	}

