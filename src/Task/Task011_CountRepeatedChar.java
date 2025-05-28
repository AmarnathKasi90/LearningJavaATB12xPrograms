package Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task011_CountRepeatedChar {
    public static void main(String[] args) {
        String input = "testlead";
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1 );
        }

        System.out.println(map);
        System.out.println("repeated Characters");
        for(Map.Entry<Character,Integer> entry: map.entrySet()){

            if(entry.getValue()>1){
                System.out.println("Map " + entry.getKey() + "=" + entry.getValue());
            }
        }
    }
}
