package ex_32_Collection_Framework_DSA.SET;

import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab275_SET_P1 {
    public static void main(String[] args) {

        Set hs = new HashSet();
        Set ls = new LinkedHashSet();
        Set ts = new TreeSet();

        // Hashing mechanism to store the element
        // no order.
        // no duplicates

        hs.add(1);
        hs.add(1);
        hs.add(null);
        hs.add("null");
        hs.add(true);
        hs.add(null);
        hs.add("Hi");
        System.out.println("HashSet\t" + hs);

        Set lhs = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates
        ls.add(1);
        ls.add(1);
        ls.add(null);
        ls.add("NULL");
        ls.add("Hi");
        ls.add(null);
        ls.add("Hi");
        System.out.println("LinkedHashSet" + ls);

        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.
        ts.add(1);
        ts.add(1);
        ts.add(2);

        System.out.println("treeSet\t" + ts);
//        ts.add('a');
//        System.out.println("atreeSet\t"+ts);//ClassCastException
//
//        ts.add("Hi");
//        System.out.println("HItreeSet\t"+ts);//ClassCastException
//
//        ts.add(true);
//        System.out.println("BooleantreeSet\t"+ts);//ClassCastException
//
//        ts.add(null);
//        System.out.println("nulltreeSet\t"+ts); //NullPointerException

    }
}