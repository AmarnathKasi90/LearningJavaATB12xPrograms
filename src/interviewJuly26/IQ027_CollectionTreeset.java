package interviewJuly26;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;

public class IQ027_CollectionTreeset {
    public static void main(String[] args) {
        String input = "testlead";
        String output = "";

        Set set = new TreeSet();
        for(int i=0; i<input.length();i++){
            char ch = input.charAt(i);
            set.add(ch);
        }
        System.out.println(set);

        ArrayList<Character> al = new ArrayList(set);
        Collections.reverse(al);
        for(char ch : al){
            System.out.println(ch);
        }


    }
}
