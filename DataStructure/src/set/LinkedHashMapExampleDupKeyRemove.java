package set;

import java.util.*;

public class LinkedHashMapExampleDupKeyRemove {
 
    public static void main(String a[]){
         
        LinkedHashMap<Price6, String> hm = new LinkedHashMap<Price6, String>();
        hm.put(new Price6("Banana", 20), "Banana");
        hm.put(new Price6("Apple", 40), "Apple");
        hm.put(new Price6("Orange", 30), "Orange");
        printMap(hm);
        Price6 key = new Price6("Banana", 20);
        System.out.println("Adding duplicate key...");
        hm.put(key, "Grape");
        System.out.println("After adding dulicate key:");
        printMap(hm);
    }
     
    public static void printMap(HashMap<Price6, String> map){
         
        Set<Price6> keys = map.keySet();
        for(Price6 p:keys){
            System.out.println(p+"==>"+map.get(p));
        }
    }
}
 
class Price6{
     
    public String item;
    public int price;
     
    public Price6(String itm, int pr){
        this.item = itm;
        this.price = pr;
    }
     
    public int hashCode(){
        int hashcode = 0;
        hashcode = price*20;
        hashcode += item.hashCode();
        return hashcode;
    }
     
    public boolean equals(Object obj){
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
            return false;
        }
    }
     
    public String toString(){
        return "item: "+item+"  price: "+price;
    }
}
