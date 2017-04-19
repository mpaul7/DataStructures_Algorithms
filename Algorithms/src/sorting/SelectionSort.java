package sorting;

public class SelectionSort {
	public static int[] theArray = {11, 16, 15, 12, 10, 12, 12, 16};
	private int arraySize = 8;
	
	public void swapValues(int indexOne, int indexTwo){
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
		}
	
	//Selection sort search for the smallest number in the array
	//saves it in the minimum spot and then repeats searching
	//through the entire array each time
	public void selectionSort(){
		for(int x = 0; x < arraySize; x++){
			int minimum = x;
			for(int y = x; y < arraySize; y++){
				//To change direction of sort just change
				//this from > to <
				if(theArray[minimum] > theArray[y]){
					minimum = y;
					}
				}
			swapValues(x, minimum);
			}
		}
	
	public static void main(String[] args){
		SelectionSort newArray = new SelectionSort();
		System.out.println("======= Un-Sorted Array ======= ");
		for(int in : theArray){System.out.print(in + " ");}
		newArray.selectionSort();
		System.out.println("\n ======= Sorted Array ======= ");
		for(int in : theArray){ System.out.print(in + " ");}
		
		}
	}
