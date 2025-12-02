package novInterview;

import java.util.LinkedHashSet;

public class IQ019_LinkedHashSet_RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Hi how are you";

        LinkedHashSet <Character> set = new LinkedHashSet<>();
        for(char c : str.toCharArray()){
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : set){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
