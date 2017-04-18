import java.util.List;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;


public class EnumerationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		List<String> list = new ArrayList<String>();
//		list.add("Java");
//		list.add("C");
//		list.add("C++");
//		list.add("Pearl");
//		
//		Enumeration<String> lis = list.elements();
		
		Vector<String> lang = new Vector<String> ();
		
		lang.add("Java");
		lang.add("C");
		lang.add("C++");
		lang.add("Pearl");
		
		System.out.println(lang);
		Enumeration<String> vec = lang.elements();
		while(vec.hasMoreElements()){
			System.out.println(vec.nextElement());
		}

	}

}
