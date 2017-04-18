package set;

import java.util.Comparator;
import java.util.TreeSet;

// User's class
public class CompCompDemo{
	public static void main(String[] args){
		
		TreeSet<Employee> ts1 = new TreeSet<Employee>(); // DNSO
		ts1.add(new Employee("N", 100));
		ts1.add(new Employee("B", 200)); // e1.compareTo(e2)
		ts1.add(new Employee("C", 50));
		ts1.add(new Employee("V", 150));
		ts1.add(new Employee("B", 100));
		System.out.println("ts1 = " + ts1); // ts1 = [C -- 50, N -- 100, V -- 150, B -- 200]
				
		// customized sorting order for String Object
		TreeSet<Employee> ts2 = new TreeSet<Employee>(new MyComparator4());
		ts2.add(new Employee("N", 100));
		ts2.add(new Employee("B", 200)); // e1.compareTo(e2)
		ts2.add(new Employee("C", 50));
		ts2.add(new Employee("V", 150));
		ts2.add(new Employee("B", 100));
		System.out.println("ts2 = " +  ts2); // ts2 = [B -- 200, C -- 50, N -- 100, V -- 150]
		
		// customized sorting order for Integer Object
		TreeSet<Employee> ts3 = new TreeSet<Employee>(new MyComparator5());
		ts3.add(new Employee("N", 100));
		ts3.add(new Employee("B", 200)); // e1.compareTo(e2)
		ts3.add(new Employee("C", 50));
		ts3.add(new Employee("V", 150));
		ts3.add(new Employee("B", 100));
		System.out.println("ts3 = " +  ts3); // ts3 = [C -- 50, N -- 100, V -- 150, B -- 200]
		}
	}

class MyComparator4 implements Comparator<Employee>{
	public int compare(Employee obj1, Employee obj2){
		Employee e1 = (Employee)obj1;
		Employee e2 = (Employee)obj2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2); // DNSO for String Object.
		}
	}
		
class MyComparator5 implements Comparator<Employee>{
	public int compare(Employee obj1, Employee obj2){
		Employee e1 = (Employee)obj1;
		Employee e2 = (Employee)obj2;
		Integer s1 = e1.eid;
		Integer s2 = e2.eid;
		return s1.compareTo(s2); // DNSO for Integer Object.
		}
	}
		
// Owner's class
class Employee implements Comparable<Employee>{ 
	String name;
	int eid;
	
	Employee(String name, int eid){
		this.name = name;
		this.eid = eid;
		}
	
	public String toString(){
		return name + " -- " + eid;
		}
	public int compareTo(Employee obj){
		/*int eid1 = this.eid; // current employee id
		Employee e = (Employee)obj;
		int eid2 = e.eid;*/
		
		//for(p = 0; p < 1; p++){
		//	System.out.println("eid1 = " + eid1 + " eid2 =  " + eid2);
		//}

		Integer eid1 = this.eid; // current employee id
		Employee e = (Employee)obj;
		Integer  eid2 = e.eid;
		//return eid1.compareTo(eid2);
		return -eid1.compareTo(eid2);
		/*if (eid1 < eid2)
			return -1;
		else if (eid1 > eid2)
			return +1;
		else
			return 0;*/
	}
	
	/*public int compareTo(Object obj){
		String eid1 = this.name; // current employee id
		Employee e = (Employee)obj;
		String eid2 = e.name;
		return eid1.compareTo(eid2);
	    }*/
}