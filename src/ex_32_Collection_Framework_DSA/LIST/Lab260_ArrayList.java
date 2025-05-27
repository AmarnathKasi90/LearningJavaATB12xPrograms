package ex_32_Collection_Framework_DSA.LIST;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Lab260_ArrayList {
    public static void main(String[] args) {
        List l3 = new ArrayList();
        l3.add(1);
        l3.add(null);
        l3.add(true);
        l3.add("Hi");
        l3.add(null);
        l3.add("null");
        l3.add("Hi");
        l3.addFirst(0);
        l3.addLast("Last");

        System.out.println(l3);
        l3.contains(null);
        l3.remove(null);
        System.out.println(l3);
        System.out.println(l3.isEmpty());
        System.out.println(l3.size());
        System.out.println(l3.contains(null));
        System.out.println(l3.getFirst());
        System.out.println(l3.getLast());
        System.out.println(l3.get(4));
        System.out.println(l3.indexOf(2));
        System.out.println(l3.lastIndexOf("null"));
        System.out.println("---------------");

        for (int i = 0; i < l3.size(); i++) {
            System.out.println("For iLoop\t" + l3.get(i));
        }

        for (Object o : l3) {
            System.out.println("For EachLoop\t" + o);
        }
        Iterator iterator = l3.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator\t" + iterator.next());
        }

        ListIterator listIterator = l3.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("listIteratornext\t" + listIterator.next());
        }

        System.out.println("\nBackward Direction:");
        while (listIterator.hasPrevious()) {
            System.out.println("listIterator1Previous\t" + listIterator.previous());
        }




        System.out.println("-------");

        ArrayList al = new ArrayList();

        al.add("cycle");
        al.add("bike");
        al.add("car");
        al.add("Flight");
        al.add("Scooty");
        al.add("Tricycle");
        al.add("Van");
        System.out.println(al);
        al.remove(1);
        al.remove("car");
        System.out.println(al);
        System.out.println(al.getFirst());
        System.out.println(al.getLast());
        System.out.println(al.getClass());
        al.removeFirst();
        al.removeLast();
        System.out.println(al);
        al.clear();
        System.out.println(al);

        List l4 = new ArrayList();
        System.out.println(l4.isEmpty());

    }
}