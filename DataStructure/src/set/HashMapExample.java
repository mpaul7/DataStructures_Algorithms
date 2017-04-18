package set;

import java.util.*;
public class HashMapExample {
	public static void main(String[] args) {
	HashMap<String, String> hm = new HashMap<String, String>();
	// add key-value pair to hashmap
	hm.put("first", "FIRST INSERTED");
	hm.put("second", "SECOND INSERTED");
	hm.put("third", "THIRD INSERTED");
	System.out.println(hm);
	// getting value for the given kay from hashmap
	System.out.println("Value of second: " + hm.get("second"));
	System.out.println("Is HashMap empty?  " + hm.isEmpty());
	hm.remove("third");
	System.out.println(hm);
	System.out.println("Size of the HashMap: " + hm.size());
	// adding duplicate key, but not added
	System.out.println(hm.put("first", "FIRST INSERTED"));
	System.out.println(hm);
	
	Set s = hm.keySet();
	System.out.println("Key set = " + s);
	
	Collection c = hm.values();
	System.out.println("Collection c = hm.values() == " + c);
	
	Set s1 = hm.entrySet();
	Iterator itr = s1.iterator();
	while(itr.hasNext()){
		Map.Entry m1 = (Map.Entry) itr.next();
		System.out.println(m1.getKey() + "----" + m1.getValue());
		if(m1.getKey().equals("first")){
			m1.setValue("10000");
			}
		}
	System.out.println(hm);
	
	//{second=SECOND INSERTED, third=THIRD INSERTED, first=FIRST INSERTED}
	//Value of second: SECOND INSERTED
	//Is HashMap empty?  false
	//{second=SECOND INSERTED, first=FIRST INSERTED}
	//Size of the HashMap: 2
	//FIRST INSERTED
	//{second=SECOND INSERTED, first=FIRST INSERTED}
	//Key set = [second, first]
	//Collection c = hm.values() == [SECOND INSERTED, FIRST INSERTED]
	//second----SECOND INSERTED
	//first----FIRST INSERTED
	//{second=SECOND INSERTED, first=10000}
	}

}
