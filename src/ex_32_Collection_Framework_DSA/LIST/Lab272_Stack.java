package ex_32_Collection_Framework_DSA.LIST;

import java.util.Stack;

public class Lab272_Stack {
    public static void main(String[] args) {

        // Stack
        // List In -> First Out ( LIFO)
        Stack stack = new Stack();
        stack.add(1);
        stack.add(1);
        stack.push(1);
        stack.push('a');
        stack.push(null);
        stack.push("null");
        stack.addLast("last");
        stack.addFirst("First");

        System.out.println(stack);
        System.out.println("stack.peek\t"+ stack.peek());
        System.out.println("stack.pop\t" +stack.pop());
        System.out.println(stack);
        System.out.println("stack.removeLast\t" +stack.removeLast());
        System.out.println("stack.removeFirst\t"+ stack.removeFirst());
        System.out.println(stack);

    }
}