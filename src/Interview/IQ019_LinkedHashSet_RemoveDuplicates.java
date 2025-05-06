package Interview;

import java.util.LinkedHashSet;

public class IQ019_LinkedHashSet_RemoveDuplicates {
    public static void main(String[] args) {
     String input = "Hello World";
     String Output = removeDuplicate(input);
        System.out.println(Output);
    }

    private static String removeDuplicate(String str) {

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);

        }

    return sb.toString();
    }
}
