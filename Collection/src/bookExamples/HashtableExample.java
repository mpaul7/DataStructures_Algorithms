package bookExamples;

import java.util.HashMap;

public class HashtableExample {
	public static String[] Student = {"A", "B", "C", "D"};
	
	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		for(int i = 0; i < Student.length; i++ ){ 
			hm.put(i, Student[i]);
		
		}
		System.out.println(hm);	
//	public HashMap<Integer, Student> buildMap(students[] student){
//		
//	}

}
}