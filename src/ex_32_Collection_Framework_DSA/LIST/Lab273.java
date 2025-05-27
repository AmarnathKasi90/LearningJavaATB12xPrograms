package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab273 {
    public static void main(String[] args) {
        List al = new ArrayList();
        al.add(51);
        al.add(97);
        al.add(64);
        al.add(36);
        al.add(99);
        al.add(67);
        System.out.println("ArrayList" + al);
        Collections.sort(al);
        System.out.println("Sorted ArrayList" + al);
        Collections.reverse(al);
        System.out.println("Revered ArrayList" + al);

    }
}
