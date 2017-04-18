package set;

import java.util.Comparator;
import java.util.TreeSet;

public class CompCompDemo2{
	public static void main(String[] args){
		
		TreeSet<Employee2> ts1 = new TreeSet<Employee2>(); // DNSO
		ts1.add(new Employee2("N", 100));
		ts1.add(new Employee2("B", 200)); // e1.compareTo(e2)
		ts1.add(new Employee2("C", 50));
		ts1.add(new Employee2("V", 150));
		ts1.add(new Employee2("B", 100));
		System.out.println("ts1 = " + ts1); // ts1 = [C -- 50, N -- 100, V -- 150, B -- 200]
				
		// customized sorting order for String Object
		TreeSet<Employee2> ts2 = new TreeSet<Employee2>(new MyComparator6());
		ts2.add(new Employee2("N", 100));
		ts2.add(new Employee2("B", 200)); // e1.compareTo(e2)
		ts2.add(new Employee2("C", 50));
		ts2.add(new Employee2("V", 150));
		ts2.add(new Employee2("B", 100));
		System.out.println("ts2 = " +  ts2); // ts2 = [B -- 200, C -- 50, N -- 100, V -- 150]
		
		// customized sorting order for Integer Object
		TreeSet<Employee2> ts3 = new TreeSet<Employee2>(new MyComparator7());
		ts3.add(new Employee2("N", 100));
		ts3.add(new Employee2("B", 200)); // e1.compareTo(e2)
		ts3.add(new Employee2("C", 50));
		ts3.add(new Employee2("V", 150));
		ts3.add(new Employee2("B", 100));
		System.out.println("ts3 = " +  ts3); // ts3 = [C -- 50, N -- 100, V -- 150, B -- 200]
		}
	}

class MyComparator6 implements Comparator<Employee2>{
	public int compare(Employee2 e1, Employee2 e2){
		return e1.name.compareTo(e2.name); // DNSO for String Object.
		}
	}
		
class MyComparator7 implements Comparator<Employee2>{
	public int compare(Employee2 e1, Employee2 e2){
		Integer s1 = e1.eid;
		Integer s2 = e2.eid;
		return s1.compareTo(s2); // DNSO for Integer Object.
		
		// another way 
		/*if(e1.eid > e2.eid){
            return 1;
        } else {
            return -1;
        }*/
		}
	}
		
// Owner's class
class Employee2 implements Comparable<Employee2>{ 
	String name;
	int eid;
	
	Employee2(String name, int eid){
		this.name = name;
		this.eid = eid;
		}
	
	public String toString(){
		return name + " -- " + eid;
		}
	public int compareTo(Employee2 obj){
		Integer eid1 = this.eid; // current employee id
		Employee2 e = (Employee2)obj;
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