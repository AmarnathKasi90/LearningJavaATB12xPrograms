package interviewJuly26;

import java.util.LinkedHashSet;

public class IQ019_LinkedHashSet_RemoveDuplicates {
    public static void main(String[] args) {
        String input = "Remove Duplicates Now";
        String output = removeDuplicates(input);

        System.out.println(output);
    }
    private static String removeDuplicates(String input){

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c : input.toCharArray()){
            set.add(c);
        }

      StringBuilder sb = new StringBuilder();
      for(char c : set){
          sb.append(c);
      }

        return sb.toString();
    }
}
