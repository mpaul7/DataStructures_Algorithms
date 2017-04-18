package set;
	import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
	 
	public class TreeMapExampleSortingUsingComparator2 {
		public static void main(String a[]){
			//By using name comparator (String comparison)
			TreeMap<Empl5,String> tm = new TreeMap<Empl5, String>(new MyNameComp4());
			tm.put(new Empl5("A",3000), "101");
			tm.put(new Empl5("B",6000), "102");
	        tm.put(new Empl5("C",2000), "103");
	        tm.put(new Empl5("D",2400), "104");
	       //System.out.println(tm);
	        Set<Empl5> keys = tm.keySet();
	        for(Empl5 key:keys){
	        	System.out.println(key+" ==> "+ tm.get(key));
	        	}
	          
	        System.out.println("===================================");
	        //By using salary comparator (int comparison)
	        TreeMap<Empl5,String> trmap = new TreeMap<Empl5, String>(new MySalaryComp4());
	        trmap.put(new Empl5("A",3000), "101");
	        trmap.put(new Empl5("B",6000), "102");
	        trmap.put(new Empl5("C",2000), "103");
	        trmap.put(new Empl5("D",2400), "104");
	        //System.out.println(trmap);
	        Set<Empl5> ks = trmap.keySet();
	
	        for(Empl5 key:ks){
	        	System.out.println(key + " ==> " + trmap.get(key)); 
	        	}
	        }
		}
	
	class MyNameComp4 implements Comparator<Empl5>{
	    @Override
	    public int compare(Empl5 e1, Empl5 e2) {
	        return e1.name.compareTo(e2.name); 
	        }
	    }

	class MySalaryComp4 implements Comparator<Empl5>{
	    @Override
	    public int compare(Empl5 e1, Empl5 e2) {
	    	//stem.out.println(e1.salary);
	    	Integer I1 = (Integer) e1.salary;
	    	Integer I2 = (Integer) e2.salary;
	    	return -I1.compareTo(I2);
	    	
	       /* if(e1.salary > e2.salary){
	        	return -1;
	        	} else {
	        		return 1;
	        		}*/
	        }
	    }
	
	class Empl5{
	    public String name;
	    public int salary;
	    
	    public Empl5(String n, int s){
	        this.name = n;
	        this.salary = s;  
	        }
	    
	public String toString(){
	        return "Name: "+this.name+"-- Salary: "+  this.salary;   
	        }
	}

