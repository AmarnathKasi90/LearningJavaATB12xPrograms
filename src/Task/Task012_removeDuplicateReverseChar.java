package Task;

import java.util.*;

public class Task012_removeDuplicateReverseChar {
    public static void main(String[] args) {
        String input = "testlead";
        Set set = new TreeSet();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            set.add(ch);
        }
        System.out.println(set);

        List<Character> al = new ArrayList<>(set);
        Collections.reverse(al);

        for (char ch : al) {
            System.out.println(ch);
        }
    }
}
