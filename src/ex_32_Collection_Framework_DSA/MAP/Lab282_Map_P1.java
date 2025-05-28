package ex_32_Collection_Framework_DSA.MAP;

import java.util.*;

public class Lab282_Map_P1 {
    public static void main(String[] args) {

        Map<Integer,Integer> m = new HashMap();
        m.put(8, 1);
        m.put(2, null);
//        m.put(null, null);
        m.put(7, 2);
     //   m.put(23,"Hi");
        m.put(6, 3);
        m.put(5, 4);
    //    m.put(45,"Hi");
        m.put(5, 9);
        System.out.println("HashMap\t" +m);
        System.out.println("HashMap\t" + m.get(23));
        System.out.println(m.size());
        System.out.println(m.isEmpty());
        System.out.println(m.containsKey(1));
        System.out.println(m.containsValue("Hi"));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println("-----");

        Map<Integer,Integer> l = new LinkedHashMap();
        l.put(8, 1);
        l.put(2, null);
        l.put(null, null);
        l.put(7, 2);
        l.put(6, 3);
        //l.put(56,"Hi");
        l.put(5, 4);
       // l.put(34,"Hi");
        l.put(5, 9);
        System.out.println(l.size());
        System.out.println(l.keySet());
        System.out.println(l.values());
        System.out.println(l.isEmpty());
        System.out.println(l.containsKey(34));
        System.out.println(l.containsValue("Hi"));
        System.out.println("LinkedHashMap\t" +l);
        System.out.println("LinkedHashMap\t" + m.get(5));
        System.out.println("------");
        Map<Integer,Integer> t = new TreeMap();
        t.put(8, 1);
        t.clear();
        System.out.println(t);
//        t.put(null,null);//NullPointerException
        t.put(7, 2);
  //      t.put(12,"Hi");
        t.put(6, 3);
        t.put(5, 4);
        t.put(5,9);
    //    t.put(1,"Hello");
        System.out.println();
        System.out.println(t.isEmpty());
        System.out.println(t.containsKey(5));
        System.out.println(t.containsValue("Hello"));
        System.out.println(t.keySet());
        System.out.println(t.values());
        System.out.println(t.size());
        System.out.println("TreeMap\t"+t);
        System.out.println("TreeMap\t" + t.get(6));


        for(Map.Entry<Integer,Integer> entry: m.entrySet()){
            System.out.println(entry.getKey()+ "->" + entry.getValue());
        }

        }
}