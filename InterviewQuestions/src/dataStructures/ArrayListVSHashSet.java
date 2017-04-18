package dataStructures;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListVSHashSet {
		
	public static void arrayListVSHashSet(){
		ArrayList al = new ArrayList ();
		al.add("A");
		al.add(10);    // heterogeneous allowed
		al.add(10);    // duplicates allowed 
		al.add(null);  // multiple null allowed
		al.add(null); 
		System.out.println(al); // insertion order preserved.
		al.remove(1); // remove at index term 	
		
		HashSet hs = new HashSet ();
		hs.add("A");
		hs.add(10);    // heterogeneous allowed
		hs.add(10);    // duplicates NOT allowed 
		al.add(null);  // null only allowed at the begining
		hs.add(null);  // multiple null not allowed
		System.out.println(hs); // insertion NOT order preserved.
	}

	
	
	public static void main(String[] args) {
		arrayListVSHashSet();
	}
}
