package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("A");
		hs.add(10); // heterogeneous objects allowed
		hs.add("A"); // duplicate not allowed
		hs.add(null);
		hs.add(null);
		hs.add(null); // null insertion any number times is allowed
		System.out.println(hs); // [null, A, 10]
		
		// Adding at an index and removing 
		hs.add("X");
		System.out.println(hs);// [null, A, 10, X]
		hs.remove("X");
		System.out.println(hs);// [null, A, 10]
		// Initial capacity 
		System.out.println(hs.size()); // 6
		hs.add("P"); // adding after fill-ratio
		hs.add("Q");
		hs.add("R");
		hs.add("S");
		System.out.println(hs.size()); // 6
		hs.add("P"); // duplicates not allowed
		System.out.println(hs.size()); // 6
		
		HashSet<Employee> hs2 = new HashSet<Employee>();
		hs2.add(new Employee("Alice", 100));
		hs2.add(new Employee("Bob", 200));
		hs2.add(new Employee("Chris", 300));
		hs2.add(new Employee("Jhon", 400));
		hs2.add(new Employee("Alex", 500));
		
		Employee Obj = new Employee("Alice", 100);
		System.out.println("Does set contain Obj? " + hs2.contains(Obj));
		
		// How to get synchronized ArrayList
		Set ss = Collections.synchronizedSet(hs);
		
		Iterator itr = hs2.iterator(); 
		while(itr.hasNext()){
			System.out.println(itr.next());
			}
		Iterator itr3 = hs2.iterator(); 
		while(itr3.hasNext()){
			System.out.println(itr3.next());
			}
	}
}