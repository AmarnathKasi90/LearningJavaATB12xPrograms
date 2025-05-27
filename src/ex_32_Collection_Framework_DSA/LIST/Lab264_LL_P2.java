package ex_32_Collection_Framework_DSA.LIST;

import java.util.*;

public class Lab264_LL_P2 {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); // // Arrays Format - Continuous


        List mylist2 = new LinkedList(); // Doubly Linked List.

        mylist2.add("Amarnath");
        mylist2.add("Kasi");
        mylist2.add("Amit");
        mylist2.add("meenu");
        mylist2.add("ritwik");
        mylist2.add("ritwik");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Kasi"));
        System.out.println(mylist2.lastIndexOf("ritwik"));
        System.out.println(mylist2.indexOf("Kasi"));





    }
}