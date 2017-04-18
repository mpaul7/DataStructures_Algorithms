import java.util.*;

public class IteratorExample {
	
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		
		String removeElem1 = "Java";
		String removeElem2 = "C";
		
		myList.add("Java");
		myList.add("C");
		myList.add("C++");
		
		// How to iterate through a collection. 
		Iterator<String> itr = myList.iterator(); // myList.iterator() returns Iterator Object.  
		while(itr.hasNext()){ // hasNext() returns true if the collection has more elements 
			System.out.println(itr.next()); // next() returns next element in the list  
			}
		
		Iterator<String> itr2 = myList.iterator();
		while(itr2.hasNext()){
			if(removeElem1.equals(itr2.next())){
				itr2.remove(); // Note: This method can be called once per call to next()
				}
//			if(removeElem2.equals(itr2.next())){
//				itr2.re;
//				}
			}
		System.out.println(myList);
		}
	}
