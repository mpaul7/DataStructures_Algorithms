import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
// hashset : SEt : has no duplicates
// hashmap : Stores key=Value pairs
// video : https://www.youtube.com/watch?v=jwtx6GVPdyw
// video : https://www.youtube.com/watch?v=9a0wZNI9bQE
public class hashSet {

	
	public static void main(String[] args) {
		HashSet<Integer> phones = new HashSet<Integer>();
		phones.add(613228074);
		phones.add(613000329);
		phones.add(613000329); // ignores multiples 
		phones.add(613000329); // ignores multiples
		//phones.remove(613000329);
		System.out.println(phones);
		
		HashMap<String, Integer> directory = new HashMap<String, Integer>();
		directory.put("Money", 613000329);
		directory.put("Puneet", 613228074);
		System.out.println(directory);
		System.out.println(directory.get("Money"));
		
		HashMap<String, HashSet<String>> people = new HashMap<String, HashSet<String>>();
		HashSet<String> friends =  new HashSet<String>();
		friends.add("Bob"); 
		friends.add("Carl");
		people.put("Money", friends);
		System.out.println(people);
		
		HashSet h = new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z")); // false
		System.out.println(h); // [null, D, C, Z, B] -- insertion order not preserved.
		
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("B");
		lh.add("C");
		lh.add("D");
		lh.add("Z");
		lh.add(null);
		lh.add(10);
		System.out.println(lh.add("Z")); // false
		System.out.println(lh); // [B, C, D, Z, null, 10] -- insertion order preserved.
		
	}

}
