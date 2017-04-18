import java.util.*;


public class ListIteratorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
     List<Integer> li = new ArrayList<Integer>();
     li.add(23);
     li.add(98);
     li.add(29);
     li.add(71);
     
     ListIterator<Integer> Litr = li.listIterator();
     
     System.out.println("Elements in forward directiton");
     while(Litr.hasNext()){
    	 System.out.println(Litr.next());
     }
     System.out.println("Elements in backward directiton");
     while (Litr.hasPrevious()){
    	 System.out.println(Litr.previous());
     }
     

	}

}
