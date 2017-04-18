package set;

import java.util.Hashtable;

public class HashTableExampleDupKeyRemove {

	
	public static void main(String[] args) {
		
		Hashtable<Emp, String> ht = new Hashtable<Emp, String>();
		ht.put(new Emp(134,"Ram",3000), "RAM");
        ht.put(new Emp(235,"John",6000), "JOHN");
        ht.put(new Emp(876,"Crish",2000), "CRISH");
        ht.put(new Emp(512,"Tom",2400), "TOM");
        
        System.out.println(ht);
        System.out.println("Fecthing value by creating new key:");
        ht.put(new Emp(512,"Tom",2400), "TOM");
        System.out.println(ht);
        
	}

}
