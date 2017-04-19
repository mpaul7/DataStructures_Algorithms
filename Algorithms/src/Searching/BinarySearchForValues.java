package Searching;

public class BinarySearchForValues{
	public static int[] theArray = {1, 3, 5, 2, 7, 4, 6, 8};
	private int arraySize = 8;

		public void bubbleSort(){
			for(int i = arraySize - 1; i > 1; i--){
				for(int j = 0; j < i; j++){
					if(theArray[j] > theArray[j + 1]){
						swapValues(j, j+1);
						}
					}
				}
			}
		
		public void swapValues(int indexOne, int indexTwo){
			int temp = theArray[indexOne];
			theArray[indexOne] = theArray[indexTwo];
			theArray[indexTwo] = temp;
			}
	
	//The Binary Search is quicker than the linear search
	//because all the values are sorted. Because everything
	//is sorted once you get to a number larger than what
	//you are looking for you can stop the search. Also
	//you be able to start searching from the middle
	//which speeds the search. It also works best when
	//there are no duplicates
	
	public void binarySearchForValue(int value){
		int lowIndex = 0;
		int highIndex = arraySize - 1;
		while(lowIndex <= highIndex){
			int middleIndex = (highIndex + lowIndex) / 2;
			System.out.println("\nmiddleIndex = " + middleIndex);
			if(theArray[middleIndex] < value)
				lowIndex = middleIndex + 1;
			else if(theArray[middleIndex] > value)
				highIndex = middleIndex - 1;
			else {
				System.out.println("\nFound a Match for " + value + " at" + "Index " + middleIndex);
				lowIndex = highIndex + 1;
				}
			}
		}
	
	public static void main(String[] args){
		BinarySearchForValues newArray = new BinarySearchForValues();
		System.out.println("======= Un-Sorted Array ======= ");
		for(int in : theArray){System.out.print(in + " ");}
		newArray.bubbleSort();
		System.out.println("\n ======= Sorted Array ======= ");
		for(int in : theArray){ System.out.print(in + " ");}
		newArray.binarySearchForValue(7);
		}
	}

