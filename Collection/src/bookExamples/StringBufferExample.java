package bookExamples;

public class StringBufferExample {
public static String[] words = {"A", "B", "C", "D"};
	public static void main(String[] args) {
		StringBuffer sentence  = new StringBuffer();
		for(String w : words){
			sentence.append(w);
			}
	System.out.println(sentence);// ABCD	
	}

}
