package Interview;

public class IQ023_LargestWord {
    public static void main(String[] args) {
        String input = "Find the largest word in the sentence";

        String [] words = input.split("\\s+");
        String largestword = "";

        for (String word :words ){
            if(word.length() > largestword.length()){
                largestword = word;
            }
          }
        System.out.println(largestword);
    }
}
