package ex_32_Collection_Framework_DSA.QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab280_Queue_LinkedList {
    public static void main(String[] args) {

Queue q = new LinkedList();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(4);
        q.add(3);

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        for(Object o: q){
            System.out.println("ForLoop \t" +o);
        }

        Iterator iterator = q.iterator();
        while(iterator.hasNext()){
            System.out.println("iterator\t" +iterator.next());
        }

        q.add("Hi");
        System.out.println(q);


    }
    }