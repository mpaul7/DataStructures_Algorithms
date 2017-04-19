package sorting;

public class BubbleSort {
	public static int[] theArray = {11, 16, 15, 12, 10, 12, 12, 16};
	private int arraySize = 8;
	
		
	//This bubble sort will sort everything from
	//smallest to largest
	public void bubbleSort(){
		//i starts at the end of the Array
		//As it is decremented all indexes greater
		//then it are sorted
		for(int i = arraySize - 1; i > 1; i--){
			//The inner loop starts at the beginning of
			//the array and compares each value next to each
			//other. If the value is greater then they are
			//swapped
			for(int j = 0; j < i; j++){
				//To change sort to Descending change to <
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
	
		
	public static void main(String[] args){
		BubbleSort newArray = new BubbleSort();
		System.out.println("======= Un-Sorted Array ======= ");
		for(int in : theArray){System.out.print(in + " ");}
		newArray.bubbleSort();
		System.out.println("\n ======= Sorted Array ======= ");
		for(int in : theArray){ System.out.print(in + " ");}
		}
	}
