package dataStructures;

import java.util.Comparator;
import java.util.TreeSet;

public class SortTreeSet {
	
	
	public static void sortTreeSet(){
		
		TreeSet ts  = new TreeSet();
		ts.add(10); 
		ts.add(10); // Duplicates Not Allowed 
		//ts.add("A"); // heterogeneous objects not allowed
		ts.add(0);
		ts.add(15);
		ts.add(20);
		System.out.println(ts); // DNSO. and insertion order not preserved.
		
		TreeSet ts1 = new TreeSet(new MyComparator()); 
		ts1.add(10); // first element no comparison
		ts1.add(0); // compare(0, 10) - +ve
		ts1.add(15); // compare(15, 10)
		ts1.add(20); // compare(20, 10)- compare(20, 15)
		ts1.add(20); // compare(20, 10)- compare(20, 15) - compare(20, 20) (duplicate and remove)
		System.out.println("ts1 =  " + ts1); //[0, 10, 15, 20]
		
		System.out.println("=== Sorting by name ====");
		TreeSet<Employee> ts2 = new TreeSet<Employee>(new MyNameComparator());
		ts2.add(new Employee("Alice", 100));
		ts2.add(new Employee("Bob", 200));
		ts2.add(new Employee("Chris", 300));
		ts2.add(new Employee("Jhon", 400));
		ts2.add(new Employee("Alex", 500));
		System.out.println("ts1 =  " + ts2); //[0, 10, 15, 20]
	}
	public static void main(String[] args) {
		sortTreeSet();
	}

}
class MyComparator implements Comparator{
	public int compare(Object e1, Object e2){
		Integer I1 = (Integer)e1;
		Integer I2 = (Integer)e2;
		
		if(I1 < I2){
			return +1;
			}else if(I1 > I2){
				return -1; 
				}
		return 0;
		}
	}