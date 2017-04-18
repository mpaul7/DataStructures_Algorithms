package stringCodingQuestions;

public class Question1 {
	public static void JavaHungry(String s){
		System.out.println("String");
	}
	
	public static void JavaHungry(Object o){
		System.out.println("Object");
	}
	
	public static void check(){
		//System.out.println(null.length());
	}

	public static void main(String [] args){
		JavaHungry(null);
		check();
		
	}
}