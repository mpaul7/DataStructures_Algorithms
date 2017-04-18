import java.util.Arrays;


public class TheStack {

	private String[] stackArray;
	private int stackSize; 
	private int topOfStack = -1; 
	
	TheStack(int size){
		stackSize = size; 
		stackArray = new String[size];
		Arrays.fill(stackArray, "-1");
	}
	
	public void push(String input){
		if (topOfStack + 1 < stackSize){
			topOfStack++;
			stackArray[topOfStack] = input; 
		} else System.out.println("Sorry but the stack is full");
		//displayTheStack();
		System.out.println("PUSH  " + input + "  was added to the Stack");
	}
	
	public String pop(){
		if (topOfStack >= 0){
			//displayTheStack();
			System.out.println("POP  " + stackArray[topOfStack] + "  was removed");
			stackArray[topOfStack] = "-1";
			return stackArray[topOfStack--];
		} else {
			//dispalyTheStack();
			System.out.println("Sorry but the stack is empty");
			return "-1";
			
		}
	}
	
	public String peek(){
		//dislayTheStack();
		System.out.println("PEEK  " + stackArray[topOfStack] + "  Is at the top of the stack\n");
		return stackArray[topOfStack];
	}
	
	public void pushMany(String multipleValues){
		String [] tempString = multipleValues.split(" ");
		for (int i = 0; i < tempString.length; i++){
			push(tempString[i]);
		}
	}
	
	public void popAll(){
		for(int i = topOfStack; i> 0; i--){
			pop();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheStack theStack = new TheStack(10);
		theStack.push("10");
		theStack.push("15");
		theStack.peek();
		theStack.pop();
		theStack.popAll();
		theStack.pushMany("12 13 14 15");

	}

}
