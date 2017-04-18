package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		
		Vector vct = new Vector();
		vct.add("A");
		vct.add(10); // heterogeneous objects allowed
		vct.add("A"); // duplicate object allowed
		vct.add(null);
		vct.add(null);
		vct.add(null); // null insertion any number times is allowed
		System.out.println(vct); // [A, 10, A, null, null, null]
		
		vct.add(2, "Random");
		System.out.println(vct); // [Frist, Second, Random, Third]
		
		// Reading Vector using Iterator
		Iterator vecItr = vct.iterator();
		while(vecItr.hasNext()){
			System.out.println(vecItr.next());
		}
		
		// Reading Vector using Enumeration
		Enumeration vecEnu = vct.elements();
		while(vecEnu.hasMoreElements()){
			System.out.println(vecEnu.nextElement());
		}
		
		//==============================================
		// Adding at an index and removing 
		vct.add(0, "X");
		System.out.println(vct);// [X, A, 10, A, null, null, null]
		vct.remove(0);
		System.out.println(vct);// [A, 10, A, null, null, null]
		// Initial capacity 
		System.out.println(vct.size()); // 6
		vct.add("X"); // adding after fill-ratio
		vct.add("X");
		vct.add("X");
		vct.add("X");
		System.out.println(vct.size()); // 6
		vct.add("X");
		System.out.println(vct.size()); // 6
		
		// sorting
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
		Vector<Employee> vct2 = new Vector<Employee>();
		vct2.add(new Employee("Alice", 100));
		vct2.add(new Employee("Bob", 200));
		vct2.add(new Employee("Chris", 300));
		vct2.add(new Employee("Jhon", 400));
		vct2.add(new Employee("Alex", 500));
		
		Iterator itr = vct2.iterator(); 
		while(itr.hasNext()){
			System.out.println(itr.next());
			}
		
		System.out.println("== Sorted List on name");
		Collections.sort(vct2, new MyNameComparator());
		
		Iterator itr2 = vct2.iterator(); 
		while(itr2.hasNext()){
			System.out.println(itr2.next());
			}
		
		System.out.println("== Sorted List on salary");
		Collections.sort(vct2, new MySalaryComparator());
		
		Iterator itr3 = vct2.iterator(); 
		while(itr3.hasNext()){
			System.out.println(itr3.next());
			}
		
		// copy or clone a Vector
		List<Employee> alCopy= (Vector<Employee>) vct2.clone();
		System.out.println(alCopy); 
					
				
		// add elements of a List to another Vector
		vct2.addAll(vct);
		System.out.println(vct2); 
		
		// Does tis arrayList contains elements of another arrayList
		System.out.println(vct2.containsAll(vct)); // true
		
		/*// copy an ArrayList to a Vector
		Employee [] copyArray = new Employee[vct2.size()];
		vct2.copyInto(copyArray);
		System.out.println(copyArray);*/
		
		
		// get sublist from Vector
		List<Employee> subList = vct2.subList(2, 4);
		System.out.println(subList); // 
		
		// to replace the element at index with new Object e and returns old object.
		Employee obj = new Employee("Paul", 900);
		System.out.println(vct2.set(2, obj));//
		System.out.println(vct2);
		
		// clear Vector
		vct2.clear();
		System.out.println(vct2); // []
		//==============================================
		}

}
