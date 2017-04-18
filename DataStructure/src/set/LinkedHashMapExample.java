package set;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String a[]){
	         
	        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
	        lhm.put("one", "first ele");
	        lhm.put("two", "second ele");
	        lhm.put("four", "inserted at 3rd pos");
	        System.out.println(lhm);
	        System.out.println("Getting value for key 'one': "+lhm.get("one"));
	        System.out.println("Size of the map: "+lhm.size());
	        System.out.println("Is map empty? "+lhm.isEmpty());
	        System.out.println("Contains key 'two'? "+lhm.containsKey("two"));
	        System.out.println("Contains value 'This is first element'? "
	                            +lhm.containsValue("This is first element"));
	        System.out.println("delete element 'one': "+lhm.remove("one"));
	        System.out.println(lhm);
	    }
	}