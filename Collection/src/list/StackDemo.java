package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("A");
		s.push(10); // heterogeneous objects allowed
		s.push("A"); // duplicate object allowed
		s.push(null);
		s.push(null);
		s.push(null); // null insertion any number times is allowed
		System.out.println(s); // [A, 10, A, null, null, null]
		
		// How to get synchronized ArrayList
		List ll = Collections.synchronizedList(s);
		
		s.pop();
		System.out.println(s); // [A, 10, A, null, null]
		
		// to return the top of the stack without removal of object
		System.out.println(s.peek()); // null
		
	    s.remove(3);
	    System.out.println("s == " + s); // [A, 10, A, null, null]
		
		
		// if the specified object is available, it returns its offset from top of the stack if the object is not available the it returns -1
		System.out.println(s.search(10)); // 4
		System.out.println(s.search(null)); // 1
		System.out.println(s.search(11)); // -1 
		
		// Adding at an index and removing 
		s.add(0, "X");
		System.out.println(s);// [X, A, 10, A, null, null, null]
		s.remove(2);
		s.remove(1);
		s.remove(1);
		s.remove(1);
	//	s.remove(2);
	//	s.remove();
		System.out.println(s);// [A, 10, A, null, null, null]
		// Initial capacity 
		System.out.println(s.size()); // 6
		s.add("P"); // adding after fill-ratio
		s.add("Q");
		s.add("R");
		s.add("S");
		System.out.println(s.size()); // 6
		s.add("T");
		System.out.println(s.size()); // 6
		System.out.println(s); // [A, 10, A, null, null, P, Q, R, S, T]
		
		System.out.println("==== sorting ===");
		// At this point sorting is not possible. 
		// CTE: because the objects in this array list are heterogeneous. 
		// so they can not be sorted. 
		// Collections.sort(al); 
		
		// Thus to sort the objects of an array list, these must be homogeneous
		// Here make an arraylist of Employees class objects
		//ArrayList<Employee> al2 = new ArrayList<Employee>(new MyNameComparator());
		// The above new ArrayList<Employee>(new MyNameComparator()) constructor 
		//is not allowed,
		// Thus to do sorting, pass the (new  MyNameComparator()) to the 
		// Collections.sort();
		Stack<Employee> s2 = new Stack<Employee>();
		s2.add(new Employee("Alice", 100));
		s2.add(new Employee("Bob", 200));
		s2.add(new Employee("Chris", 300));
		s2.add(new Employee("Jhon", 400));
		s2.add(new Employee("Alex", 500));
		
		// How to get synchronized ArrayList
		List ll3 = Collections.synchronizedList(s);
		
		Iterator itr = s2.iterator(); 
		while(itr.hasNext()){
			System.out.println(itr.next());
			}
		
		// Reading Vector using Enumeration
		Enumeration vecEnu = s2.elements();
		while(vecEnu.hasMoreElements()){
			System.out.println(vecEnu.nextElement());
			}
		
		System.out.println("== Sorted List on name");
		Collections.sort(s2, new MyNameComparator());
		
		Iterator itr2 = s2.iterator(); 
		while(itr2.hasNext()){
			System.out.println(itr2.next());
			}
		
		System.out.println("== Sorted List on salary");
		Collections.sort(s2, new MySalaryComparator());
		
		Iterator itr3 = s2.iterator(); 
		while(itr3.hasNext()){
			System.out.println(itr3.next());
			}
		System.out.println(s.capacity());
		
		// copy or clone a ArrayList
		Stack<Employee> alCopy= (Stack<Employee>) s2.clone();
		System.out.println(alCopy); 
		
		// add elements of a List to another ArrayList
		s.addAll(s2);
		System.out.println(s); 
		
		// Does tis arrayList contains elements of another arrayList
		System.out.println(s.containsAll(s2)); // true
		
		// copy an ArrayList to an array
		Employee [] copyArray = new Employee[s2.size()];
		s2.toArray(copyArray);
		System.out.println(copyArray);
		
		// get sublist from ArrayList
		List<Employee> subList = s2.subList(2, 4);
		System.out.println(subList); // 
		
		// to replace the element at index with new Object e and returns old object.
		Employee obj = new Employee("Paul", 900);
		System.out.println(s2.set(2, obj));// Name : 'Chris -- salary 300
		System.out.println(s2);
		// clear ArrayList
		s2.clear();
		System.out.println(s2); // []
	}

}
