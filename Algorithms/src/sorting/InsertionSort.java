package sorting;

public class InsertionSort {
	public static int[] theArray = {11, 16, 15, 12, 10, 12, 12, 16};
	private int arraySize = 8;
	
	public void insertionSort(){
		for (int i = 1; i < arraySize; i++){
			int j = i;
			int toInsert = theArray[i];
			while ((j > 0) && (theArray[j-1] > toInsert)){
				theArray[j] = theArray[j-1];
				j--;
				}
			theArray[j] = toInsert;
			System.out.println("\nArray[i] = " + theArray[i] + " Array[j]" +
			"= " + theArray[j] + " toInsert = " + toInsert + "\n");
			}
		}
	
	public static void main(String[] args){
		InsertionSort newArray = new InsertionSort();
		System.out.println("======= Un-Sorted Array ======= ");
		for(int in : theArray){System.out.print(in + " ");}
		newArray.insertionSort();
		System.out.println("\n ======= Sorted Array ======= ");
		for(int in : theArray){ System.out.print(in + " ");}
		}
	}
