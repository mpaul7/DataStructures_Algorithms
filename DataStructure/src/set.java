import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class set {
	/*
	 * Java Collection Framework :  Sets
	 * Interface: Set, no dublicates, 
	 * Implementation: Hashset, TreeSet, LinkedHashSet
	 * TreeSet: Iterator list is ordered by the Comparator (CompareTo)
	 * HashSet : no predictable order
	 * LinkdedHashSet : order in which they are added.
	 */

	
	public static void main(String[] args) {
		//Hashset
		System.out.println("======= Hashset ===========");
		Set<String> set = new HashSet<String>();
		set.add("alice");
		set.add("bob");
		set.add("charlie");
		System.out.println(set);
		System.out.println("bob is there? " + set.contains("bob"));
		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String name = iterator.next();
			System.out.println(name);
			}
		
		// TreeSet
		System.out.println("======== TreeSet ==========");
		
		Set<String> set1 = new TreeSet<String>();
		set1.add("alice");
		set1.add("bob");
		set1.add("charlie");

		System.out.println("bob is there? " + set1.contains("bob"));
		for (Iterator<String> iterator = set1.iterator(); iterator.hasNext();) {
			String name = iterator.next();
			System.out.println(name); 
			}
		
		// TreeSet
		System.out.println("======== TreeSet ==========");
		Set<Person> set3 = new TreeSet<Person>();
		Person a = new Person("alice", 44);
		Person b = new Person("bob", 44);
		Person c = new Person("charlie", 44);
		set3.add(a);
		//a.name = "bob"; // Never do this!, Person should be immutable. 
		set3.add(b);
		set3.add(c);
		for (Iterator<Person> iterator = set3.iterator(); iterator.hasNext();){
			Person p = iterator.next();
			System.out.println(p.name);
			}
	
	//LinkdedHashSet
	System.out.println("========= LinkdedHashSet =========");
	Set<String> set2 = new LinkedHashSet<String>();
	set2.add("bob");
	set2.add("charlie");
	set2.add("alice");
	System.out.println("bob is there? " + set2.contains("bob"));
	for (Iterator<String> iterator = set2.iterator(); iterator.hasNext();) {
		String name = iterator.next();
		System.out.println(name);
		}
	}
	}
