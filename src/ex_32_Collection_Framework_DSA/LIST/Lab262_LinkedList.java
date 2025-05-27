package ex_32_Collection_Framework_DSA.LIST;

import java.util.LinkedList;
import java.util.List;

public class Lab262_LinkedList {

    public static void main(String[] args) {
        List l = new LinkedList();

        l.add(1);
        l.add('a');
        l.add("abc");
        System.out.println(l);
        List l2 = new LinkedList();
        l2.add(true);
        l2.addLast("Last");
        System.out.println(l2);
        l2.addAll(l);
        l2.addFirst("first");
        System.out.println(l2);
    }
}