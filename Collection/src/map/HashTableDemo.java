package map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;


public class HashTableDemo {
	public static void main(String[] args) {
		
		Hashtable ht1 = new Hashtable();
		ht1.put("A", "one");
		ht1.put(10, "two"); // heterogeneous allowed for key
		ht1.put(10, 20); // heterogeneous allowed for value
		ht1.put("C", "three");
		ht1.put("D", "four");
		ht1.put("E", "five");
		//ht.put(null, "six"); // null key not allowed
		//ht.put("G", null); // null value not allowed
		
		System.out.println("ht1 == " + ht1);
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("A", "one");
		ht.put("B", "two");
		ht.put("C", "three");
		ht.put("D", "four");
		ht.put("E", "five");
		//ht.put(null, "six"); // null key not allowed
		//ht.put("G", null); // null value not allowed
		
		System.out.println(ht);
		
		// iteration
		Set<String> keys = ht.keySet();
		for (String key : keys) {
			System.out.println("Value of " + key + " is : " + ht.get(key));
		}
		
		//find key 
		System.out.println("ht.containsKey(A) = " + ht.containsKey("A")); // returns boolean
		
		//find value
		System.out.println("ht.containsValue(one) = " + ht.containsValue("one")); // returns boolean
		
		// get allKeys
		for (String key : keys) 
			System.out.println(key + " ");
		
		Hashtable<Employee, String> ht2 = new Hashtable<Employee, String>();
		ht2.put(new Employee(134,"Ram",3000), "RAM");
        ht2.put(new Employee(235,"John",6000), "JOHN");
        ht2.put(new Employee(876,"Crish",2000), "CRISH");
        ht2.put(new Employee(512,"Tom",2400), "TOM");
        
        System.out.println(ht2);
        
    
        System.out.println("Fecthing value by creating new key:");
        ht2.put(new Employee(512,"Tom",2400), "TOM");
        ht2.put(new Employee(512,"Tom",2400), "TOM");
        ht2.put(new Employee(512,"Tom",2400), "TOM"); // duplicate allowed
        System.out.println(ht2);
		
		// clear all
		ht.clear();
		System.out.println(ht);
		}
	}
