package Task_Interview.Interview.interviewNov;

public class IQ023_LargestWord {
    public static void main(String[] args) {
        String input = "Find the largest word in the sentence";

        String[] words = input.split("\\s+");
        String largestWord = "";
        for(String word : words){
            if(word.length() > largestWord.length()){
                largestWord = word;
            }
        }
        System.out.println(largestWord);
    }
}
