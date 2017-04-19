package Searching;

public class LinearSearchForValues {
	public static int[] theArray = {11, 16, 15, 12, 10, 12, 12, 16};
	private int arraySize = 8;
	
	public void linearSearchForValue(int value){
		boolean valueInArray = false;
		String indexsWithValue = "";
		for(int i = 0; i < arraySize; i++){
			if(theArray[i] == value){
				valueInArray = true;
				indexsWithValue += i + " ";
				}
			}
		
		if(!valueInArray){
			indexsWithValue = "None";
			}
		
		System.out.print("The Value was Found in the Following: " +
			indexsWithValue);
		System.out.println();
		//return indexsWithValue;
		}
	
	public static void main(String[] args){
		LinearSearchForValues newArray = new LinearSearchForValues();
		newArray.linearSearchForValue(12);
		
		}
	}
