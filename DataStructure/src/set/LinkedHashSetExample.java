package set;

import java.util.*;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("first");
		lhs.add("second");
		lhs.add("third");
		
		System.out.println(lhs); //ordered list [first, second, third]
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		
		System.out.println(hs); //un-ordered list [second, third, first]
		}
	}