package ex_32_Collection_Framework_DSA.LIST;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Lab269_Vector_ListIterator {
    public static void main(String[] args) {

        Vector vector = new Vector();
        vector.add(1);
        vector.add("1");
        vector.addFirst('0');
        vector.addLast("Last");
        vector.addElement('e');
        vector.add(null);
        vector.add("null");
        vector.add(null);
        System.out.println("vector" + vector);

        ListIterator listIterator = vector.listIterator();
        while (listIterator.hasNext()){
            System.out.println("listIterator.next\t"+listIterator.next());
        }
        while(listIterator.hasPrevious()){
            System.out.println("listIterator.previous\t" +listIterator.previous());
        }

        Enumeration enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println("vectorElements" + enumeration.nextElement());

        }
    }
    }