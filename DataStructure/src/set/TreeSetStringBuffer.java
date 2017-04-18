package set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStringBuffer {
	public static void main(String[] args){
		TreeSet ts = new TreeSet(new MyComparator3());
		ts.add("A"); // first element no comparison
		ts.add(new StringBuffer("ABC")); // adding StringBuffer object
		ts.add(new StringBuffer("AA")); //
		ts.add("xx"); // STring object
		ts.add("ABCD");
		ts.add("A");
		System.out.println(ts); //[A, AA, xx, ABC, ABCD]
		}
	}
				
class MyComparator3 implements Comparator{
	public int compare(Object e1, Object e2){
		String s1 = e1.toString(); // for StringBuffer Class type cast is not allowed
		String s2 = e2.toString();
		int l1 = s1.length();
		int l2 = s2.length();
		if (l1 < l2)
			return -1;
		else if (l1> l2)
			return +1;
		else
			return s1.compareTo(s2);
		}
	}
		
		
