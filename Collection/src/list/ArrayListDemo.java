package list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("A");
	al.add(10); // heterogeneous objects allowed
	al.add("A"); // duplicate object allowed
	al.add(null);
	al.add(null);
	al.add(null); // null insertion any number times is allowed
	System.out.println(al); // [A, 10, A, null, null, null]
	
	// Adding at an index and removing 
	al.add(0, "X");
	System.out.println(al);// [X, A, 10, A, null, null, null]
	al.remove(0);
	System.out.println(al);// [A, 10, A, null, null, null]
	// Initial capacity 
	System.out.println(al.size()); // 6
	al.add("X"); // adding after fill-ratio
	al.add("X");
	al.add("X");
	al.add("X");
	System.out.println(al.size()); // 6
	al.add("X");
	System.out.println(al.size()); // 6
	
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
	ArrayList<Employee> al2 = new ArrayList<Employee>();
	al2.add(new Employee("Alice", 100));
	al2.add(new Employee("Bob", 200));
	al2.add(new Employee("Chris", 300));
	al2.add(new Employee("Jhon", 400));
	al2.add(new Employee("Alice", 100));
	
	System.out.println("======================");
	for (int i = 0; i < al2.size(); i++){
		if (al2.get(i).salary > 200)
		System.out.println(al2.get(i));
	}
	System.out.println("======================");
	
	// How to get synchronized ArrayList
	List ll = Collections.synchronizedList(al);
	Iterator itr = al2.iterator(); 
	while(itr.hasNext()){
		
		System.out.println(itr.next());
		}
	
	System.out.println("== Sorted List on name");
	Collections.sort(al2, new MyNameComparator());
	
	Iterator itr2 = al2.iterator(); 
	while(itr2.hasNext()){
		System.out.println(itr2.next());
		}
	
	System.out.println("== Sorted List on salary");
	Collections.sort(al2, new MySalaryComparator());
	
	System.out.println("======================");
	Iterator<Employee> itr3 = al2.iterator(); 
	
	
	while(itr3.hasNext()){
		System.out.println("======");
	///	Integer i1 = itr3.next().salary;
	//if (i1 > 100 ){
		
	//System.out.println(i1);
		System.out.println(itr3.next());//}
		}
	
	// copy or clone a ArrayList
	ArrayList<Employee> alCopy= (ArrayList<Employee>) al2.clone();
	System.out.println(alCopy); 
	
	// add elements of a List to another ArrayList
	al.addAll(al2);
	System.out.println(al); 
	
	// Does tis arrayList contains elements of another arrayList
	System.out.println(al.containsAll(al2)); // true
	
	// copy an ArrayList to an array
	Employee [] copyArray = new Employee[al2.size()];
	al2.toArray(copyArray);
	System.out.println(copyArray);
	
	// get sublist from ArrayList
	List<Employee> subList = al2.subList(2, 4);
	System.out.println(subList); // 
	
	// to replace the element at index with new Object e and returns old object.
	Employee obj = new Employee("Paul", 900);
	System.out.println(al2.set(2, obj));// Name : 'Chris -- salary 300
	System.out.println(al2);
	// clear ArrayList
	al2.clear();
	System.out.println(al2); // []
	}
}

//=============================================================
class MyNameComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.name.compareTo(e2.name);
	}
}

class MySalaryComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		Integer I1 = (Integer)e1.salary;
		Integer I2 = (Integer)e2.salary;
		return I1.compareTo(I2);
	}
	// Another way 
	/*public int compare(Employee e1, Employee e2){
		if(e1.salary < e2.salary){
			return -1;
			}else {
				return 1;
				}
		}*/
	}
