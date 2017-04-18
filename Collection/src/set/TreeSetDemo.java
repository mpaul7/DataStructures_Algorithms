package set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import list.Employee;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(); // DNSO
		ts.add(10); // first element no comparison
		ts.add(0); // 0.compareTo(10) - +ve
		ts.add(15); // 15.compareTo(10)
		ts.add(20); // 20.compareTo(20, 10)- 20.compareTo(15)
		ts.add(20); // 20.compareTo(10)- 20.compareTo(15) - 20.compareTo(20, 20) (duplicate and remove)
		System.out.println("ts =  " + ts); //[0, 10, 15, 20]
		
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
		
		Employee obj = new Employee("Alex", 500);
		ts2.add(obj);// duplicate not allowed
		System.out.println(ts2.add(obj)); // returns false, when adding duplicates
		Iterator itr = ts2.iterator(); 
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		/*Name : 'Alex -- salary 500
		  Name : 'Alice -- salary 100
		  Name : 'Bob -- salary 200
		  Name : 'Chris -- salary 300
		  Name : 'Jhon -- salary 400*/	
		
		System.out.println("=== Sorting by salary ====");
		TreeSet<Employee> ts3 = new TreeSet<Employee>(new MySalaryComparator());
		ts3.add(new Employee("Alice", 100));
		ts3.add(new Employee("Bob", 200));
		ts3.add(new Employee("Chris", 300));
		ts3.add(new Employee("Jhon", 400));
		ts3.add(new Employee("Alex", 500));
		
		Iterator<Employee> itr2 = ts3.iterator(); 
		while(itr2.hasNext()){
			System.out.println(itr2.next());
			}
		}
	}
//=============================================================
class MyNameComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.name.compareTo(e2.name);
		}
	}
//=============================================================
class MySalaryComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		Integer I1 = (Integer)e1.salary;
		Integer I2 = (Integer)e2.salary;
		return I1.compareTo(I2);
		}
	}
//=============================================================
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
