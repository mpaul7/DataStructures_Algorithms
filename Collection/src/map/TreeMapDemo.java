package map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//the treemap sorts by key
		TreeMap<String, String> hm = new TreeMap<String, String>();
		//add key-value pair to TreeMap
		
		hm.put("102", "B");
		hm.put("103", "C");
		hm.put("104", "D");hm.put("101", "A");
		System.out.println(hm);
		
		TreeMap<Employee, String> tm = new TreeMap<Employee, String>(new MyNameComp4());
		tm.put(new Employee("A",3000), "101");
		tm.put(new Employee("B",6000), "102");
        tm.put(new Employee("C",2000), "103");
        tm.put(new Employee("D",2400), "104");
       //System.out.println(tm);
        Set<Employee> keys = tm.keySet();
        for(Employee key:keys){
        	System.out.println(key+" ==> "+ tm.get(key));
        	}
          
        System.out.println("===================================");
        //By using salary comparator (int comparison)
        TreeMap<Employee,String> trmap = new TreeMap<Employee, String>(new MySalaryComp4());
        trmap.put(new Employee("A",3000), "101");
        trmap.put(new Employee("B",6000), "102");
        trmap.put(new Employee("C",2000), "103");
        trmap.put(new Employee("D",2400), "104");
        //System.out.println(trmap);
        Set<Employee> ks = trmap.keySet();

        for(Employee key:ks){
        	System.out.println(key + " ==> " + trmap.get(key)); 
    	}
		}
	}

class MyNameComp4 implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name); 
        }
    }

class MySalaryComp4 implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {
    	//system.out.println(e1.salary);
    	Integer I1 = (Integer) e1.salary;
    	Integer I2 = (Integer) e2.salary;
    	return -I1.compareTo(I2);
    	
       /* if(e1.salary > e2.salary){
        	return -1;
        	} else {
        		return 1;
        		}*/
        }
    }

