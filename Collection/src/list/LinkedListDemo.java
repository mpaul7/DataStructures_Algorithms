package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("A");
		ll.add(10); // heterogeneous objects allowed
		ll.add("A"); // duplicate object allowed
		ll.add(null);
		ll.add(null);
		ll.add(null); // null insertion any number times is allowed
		System.out.println(ll); // [A, 10, A, null, null, null]
		
		// How to get synchronized ArrayList
		List sll = Collections.synchronizedList(ll);
		
		// LinkedList used as Stack
		System.out.println("inkedList used as Stack");
		System.out.println(ll.element());// A
		System.out.println(ll.peek()); // A
		System.out.println(ll.peekFirst()); // A
		System.out.println(ll.getFirst()); // A
		ll.push("top1");// push(): Pushes an element onto the stack represented by this list.
		System.out.println(ll);
		
		ll.pop(); // pop(): Pops an element from the stack represented by this list.
		System.out.println(ll);

		//read last element in the list
		System.out.println("inkedList used as Queue");
		System.out.println(ll.getLast()); // null
		System.out.println(ll.peekLast()); // null
		
		// Adding at an index and removing 
		ll.add(0, "X");
		System.out.println(ll);// [X, A, 10, A, null, null, null]
		ll.remove(0);
		System.out.println(ll);// [A, 10, A, null, null, null]
		// Initial capacity 
		System.out.println(ll.size()); // 6
		ll.add("X"); // adding after fill-ratio
		ll.add("X");
		ll.add("X");
		ll.add("X");
		System.out.println(ll.size()); // 10
		ll.add("X");
		System.out.println(ll.size()); // 11
		
		// ==== remove operation =====
		System.out.print("Remove() method: " + ll.remove());
		System.out.println(ll);
		System.out.print("remove(index) method: " + ll.remove(2));
		System.out.println(ll);
		System.out.print("Remov(object) method: " + ll.remove("C")); //removes and returns boolean
		System.out.println(ll);
		System.out.print("removeFirst() method: " + ll.removeFirst());
		System.out.println(ll);
		System.out.print("removeFirstOccurrence() method: " + ll.removeFirstOccurrence("A")); // removes and returns boolean
		System.out.println(ll);
		System.out.print("removeLast() method: " + ll.removeLast());
		System.out.println(ll);
		System.out.println("removeLastOccurrence() method: " + ll.removeLastOccurrence("D")); // removes and returns boolean
		System.out.println(ll);
				
		// ======== sorting =============
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
		LinkedList<Employee> ll2 = new LinkedList<Employee>();
		ll2.add(new Employee("Alice", 100));
		ll2.add(new Employee("Bob", 200));
		ll2.add(new Employee("Chris", 300));
		ll2.add(new Employee("Jhon", 400));
		ll2.add(new Employee("Alex", 500));
		
		Iterator itr = ll2.iterator(); 
		while(itr.hasNext()){
			System.out.println(itr.next());
			}
			
		// ====== Sorting =========
		System.out.println("== Sorted List on name");
		Collections.sort(ll2, new MyNameComparator());
		
		Iterator itr2 = ll2.iterator(); 
		while(itr2.hasNext()){
			System.out.println(itr2.next());
			}
		
		System.out.println("== Sorted List on salary");
		Collections.sort(ll2, new MySalaryComparator());
		
		Iterator itr3 = ll2.iterator(); 
		while(itr3.hasNext()){
			System.out.println(itr3.next());
			}
		
		// copy or clone a ArrayList
		LinkedList<Employee> alCopy= (LinkedList<Employee>) ll2.clone();
		System.out.println(alCopy); 
		
		// add elements of a List to another ArrayList
		ll.addAll(ll2);
		System.out.println(ll); 
		
		// Does tis arrayList contains elements of another arrayList
		System.out.println(ll.containsAll(ll2)); // true
		
		// copy an ArrayList to an array
		Employee [] copyArray = new Employee[ll2.size()];
		ll2.toArray(copyArray);
		System.out.println(copyArray);
		
		// get sublist from ArrayList
		List<Employee> subList = ll2.subList(2, 4);
		System.out.println(subList); // 
		
		// to replace the element at index with new Object e and returns old object.
		Employee obj = new Employee("Paul", 900);
		System.out.println(ll2.set(2, obj));// Name : 'Chris -- salary 300
		System.out.println(ll2);
		
		// clear ArrayList
		ll2.clear();
		System.out.println(ll2); // []
	}

}
