package dataStructures;

import java.util.HashMap;

public class SortedHashMap {
	
	public static void sortedHashMap(){
		HashMap<Integer, Price> hm = new HashMap<Integer, Price>();
		hm.put(101, new Price("A", 20));
		hm.put(102, new Price("B", 40));
		hm.put(103, new Price("C", 30));
		hm.put(null, new Price("D", 50));
		hm.put(null, new Price("E", 60)); // duplicate "key" not allowed
		hm.put(105, new Price("null", 50));
		hm.put(106, new Price("null", 50)); // duplicate "value" allowed
		System.out.println("HshMap Insertion order not preserved ");
		System.out.println(hm);
	}
	public static void main(String[] args) {
		sortedHashMap();
	}

}
