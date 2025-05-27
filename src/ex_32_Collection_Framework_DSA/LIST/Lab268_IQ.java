package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab268_IQ {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(1);
        l.add("1");
        l.add("Hi");
        l.add(true);
        l.add(null);
        l.addFirst(0);
        l.addLast("Last");

        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.getClass());
        System.out.println(l);
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
    }
}
