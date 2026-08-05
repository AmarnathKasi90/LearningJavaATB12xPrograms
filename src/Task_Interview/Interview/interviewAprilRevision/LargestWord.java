package Task_Interview.Interview.interviewAprilRevision;

import java.util.Arrays;

class LargestWord {
    public static void main(String[] args) {
        String text = "Find the Largest Word in the Sentence";

        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
        String largestWord = "";

        for( String word: words ) {
            if(largestWord.length() < word.length() ) {
                largestWord = word;
            }
            else {
                System.out.println("Else Loop " +word);
            }
        }

        System.out.println("LargestWord is " + largestWord);
    }
}

