package ex_32_Collection_Framework_DSA.SET;

import java.util.*;

public class Lab276_SET_P2 {
    public static void main(String[] args) {

        Set hs = new HashSet<>();
        hs.add("apple");
        hs.add("banana");
        hs.add("cheery");
        hs.add(1);
        hs.add(null);
        hs.add(true);
        System.out.println("HashSet" + hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains("apple"));
        System.out.println(hs.size());


        for (Object o : hs) {
            System.out.println("HashSet ForLoop \t" +o);
        }

        Iterator iterator = hs.iterator();
        while (iterator.hasNext()) {
            System.out.println("HashSet iterator \t" +iterator.next());
        }

        Set ls = new LinkedHashSet();
        ls.add("apple");
        ls.add("banana");
        ls.add("cheery");
        ls.add(1);
        ls.add(null);
        ls.add(true);
        System.out.println("LinkedHashSet" +ls);
        System.out.println(ls.isEmpty());
        System.out.println(ls.contains("apple"));
        System.out.println(ls.size());

        for(Object e : ls){
            System.out.println("LinkedHashSet ForLoop \t"+ e);
        }

        Iterator iterator1 = ls.iterator();
        while (iterator1.hasNext()){
            System.out.println("LinkedHashSet iterator \t" + iterator1.next());
        }

//        ListIterator listIterator = ls.iterator

    Set ts = new TreeSet();
        ts.add("apple");
        ts.add("banana");
        ts.add("cheery");

        System.out.println(ts);
        System.out.println(ts.isEmpty());
        System.out.println(ts.contains("apple"));
        System.out.println(ts.size());
        System.out.println();
        for(Object e: ts){
            System.out.println("TreeSet ForLoop\t" + e);
        }

        Iterator iterator2 = ts.iterator();
        while(iterator2.hasNext()){
            System.out.println("TreeSet Iterator\t" + iterator2.next());
        }




    }
}
