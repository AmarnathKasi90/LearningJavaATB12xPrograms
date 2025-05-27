package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab259_LIST_I {
    public static void main(String[] args) {

//        List fruits = new List();
        List fruits = List.of("orange","apple","banana","mango","watermelon");
        System.out.println(fruits);
//        fruits.add("chiku"); // java.lang.UnsupportedOperationException
        //fruits.remove("apple"); // Not possible

        List l = new ArrayList(); // Dynamic Dispatch
        ArrayList l2 = new ArrayList();
        l.add("hello");
        l.add(123);
        l.add(true);
        l.add("Blah Blah");


List vehicle = List.of("cycle", "bike","car");
        System.out.println(vehicle);
//vecihle.add
   //     vehicle.remove("cycle");


    }
}