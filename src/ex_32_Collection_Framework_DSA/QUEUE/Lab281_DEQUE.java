package ex_32_Collection_Framework_DSA.QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Lab281_DEQUE {
    public static void main(String[] args) {
        Deque dq = new ArrayDeque();

        dq.add(1);
        dq.add("1");
        dq.add("Hi");
        dq.push(123);
        dq.push(432);
        dq.add(567);
        System.out.println("peek " +dq.peek());

        //   dq.add(null);
        System.out.println(dq);
        System.out.println(dq.pop());
        System.out.println(dq);
    }
}
