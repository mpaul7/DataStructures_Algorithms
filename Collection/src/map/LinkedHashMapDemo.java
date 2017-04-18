package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,  Price> hm = new LinkedHashMap<Integer, Price>();
        hm.put(101, new Price("A", 20));
        hm.put(102, new Price("B", 40));
        hm.put(103, new Price("C", 30));
        hm.put(null, new Price("D", 50));
        hm.put(null, new Price("E", 60)); // duplicate "key" object is not allowed and discarded
        hm.put(105, new Price("null", 50));
        hm.put(106, new Price("null", 50)); // duplicate "value" object is allowed
        System.out.println("=========HashMap == Insertion order not preserved =======");
        System.out.println(hm);
        
        System.out.println("Adding duplicate key...");
        Price value = new Price("B", 40);
        hm.put(102, value);
        System.out.println("=========HashMap == Duplocate key not allowed =======");
        System.out.println(hm);
        
        hm.put(104, value);
        System.out.println("=========HashMap == Duplocate value allowed =======");
        System.out.println(hm);
        
        System.out.println("for key = 101 get value " + hm.get(101));
        
        System.out.println("========= printMap(hm) =======");
        printMap(hm);

	}
	
	 public static void printMap(HashMap<Integer, Price> map){
         
	    	Set<Integer> keys = map.keySet();
	    	System.out.println(" ========key + ==> + map.get(key)==========");
	        for(Integer key:keys){
	        	// Returns the value to which the specified key is mapped
	        	
	        	System.out.println(key + " ==>" + map.get(key));   	
	        	}
	        // Returns a Collection view of the values contained in this map
	    	Collection<Price> values = map.values();
	    	System.out.println("======= map.values() =======");
	    	System.out.println("values =  " + values);
	        } 

}
