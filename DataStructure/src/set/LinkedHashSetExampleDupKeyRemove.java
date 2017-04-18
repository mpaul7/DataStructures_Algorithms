package set;

import java.util.*;

public class LinkedHashSetExampleDupKeyRemove {
	public static void main(String[] args) {
		LinkedHashSet<Price> lhs2 = new LinkedHashSet<Price>();
		lhs2.add(new Price("Banana", 20));
		lhs2.add(new Price("Apple", 40));
		lhs2.add(new Price("Orange", 30));
		System.out.println(lhs2);
		Price duplicate = new Price("Banana", 20);
		System.out.println("inserting duplicate object...");
		lhs2.add(duplicate);
		System.out.println(lhs2);
		}
	//In hashcode
	//In hashcode
	//In hashcode
	//[item: Banana price: 20, item: Apple price: 40, item: Orange price: 30]
	//inserting duplicate object...
	//In hashcode
	//In equals
	//[item: Banana price: 20, item: Apple price: 40, item: Orange price: 30]

	}