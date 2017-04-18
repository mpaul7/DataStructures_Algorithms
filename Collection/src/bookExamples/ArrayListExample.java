package bookExamples;

import java.util.ArrayList;

public class ArrayListExample {
	public static String[] words1 = {"MP", "Singh"};
	public static String[] words2 = {"Nir"};
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		for (String w1: words1) al.add(w1);
		for(String w2:words2) al.add(w2);
		System.out.println(al);
	}

}
