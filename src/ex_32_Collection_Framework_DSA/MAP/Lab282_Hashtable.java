package ex_32_Collection_Framework_DSA.MAP;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab282_Hashtable {
    public static void main(String[] args) {
        // Map - K, V,  null values allows

        // Hashtable - Synchronised, Slow and Legacy Class - Thread Safe
        // T1, T2 - they will use one by one.

        Hashtable<String, Integer> ht1 = new Hashtable<>();
        ht1.put("id", 0);
        ht1.put("id1", 1);
        ht1.put("id2", 2);
        ht1.put("id3", 3);
        ht1.put("id4", 4);
//        ht1.put(null,null); // NullPointerException
//        ht1.put("id5",null);  // NullPointerException
        System.out.println(ht1);
        System.out.println(ht1.get("id2"));
        System.out.println(ht1.size());
        System.out.println(ht1.containsKey("id3"));
        System.out.println(ht1.containsValue(3));
        System.out.println(ht1.contains(2));
        System.out.println(ht1.keySet());
        System.out.println(ht1.values());
//        ht1.clear();
//        System.out.println(ht1);
//        Enumeration enumeration = (Enumeration) ht1.values(); //ClassCastException

        Enumeration enumeration = ht1.keys();
        while (enumeration.hasMoreElements()) {
            System.out.println("enumeration.nextElement\t" + enumeration.nextElement());
        }

    }
}