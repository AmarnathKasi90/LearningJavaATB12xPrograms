package ex_32_Collection_Framework_DSA.LIST;

import java.util.*;

public class Lab270_NestedArrayList {
    public static void main(String[] args) {

        List fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println("fruits\t" + fruits);

        List fruits1 = new ArrayList();
        fruits1.add("Cheery");
        fruits1.add("grapes");
        System.out.println("fruits1\t" + fruits1);

        List vegetables = new ArrayList();
        vegetables.add("Tomoto");
        vegetables.add("Carrot");
        System.out.println("vegetables\t" + vegetables);

        List allFruits = new ArrayList();
        allFruits.add(fruits);
        allFruits.addAll(fruits1);
        allFruits.add(vegetables);
        allFruits.add("Beatroot");
        System.out.println("allFruits\t" + allFruits);
    }
}