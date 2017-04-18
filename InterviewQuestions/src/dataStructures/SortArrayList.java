package dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class SortArrayList {
	
	public static void sortArrayList(){
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Zen", 700));
		al.add(new Employee("Chirs", 800));
		al.add(new Employee("Dadson", 100));
		al.add(new Employee("Alice", 400));
		
		//ArrayList as per insertion order
		System.out.println(al);
		// ArrayList as per sorting on name
		Collections.sort(al, new MyNameComparator());
		System.out.println(al);
		
		// ArrayList as per sorting on name
		Collections.sort(al, new MySalaryComparator());
		System.out.println(al);
		}
	public static void main(String[] args) {
		sortArrayList();
		}
	}

 class MyNameComparator implements Comparator<Employee>{
	 public int compare(Employee o1, Employee o2) {
		 return o1.name.compareTo(o2.name);
		 }
	 }
 
 class MySalaryComparator implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		Integer i1 = (Integer)o1.salary;
		Integer i2 = (Integer)o2.salary;	
		return i1.compareTo(i2);
		}
	}