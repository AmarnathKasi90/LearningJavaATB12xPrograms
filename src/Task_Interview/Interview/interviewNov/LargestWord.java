package Task_Interview.Interview.interviewNov;

class LargestWord {
    public static void main(String[] args){

        String text = "Find the Largest word among the Biggest on the Finale";

        String[] words = text.split(" ");

        String largestWord = " ";

        for(String word : words){
            if(largestWord.length() < word.length()) {
                largestWord = word;
            }
            else
                System.out.println("Word:" +word);
        }
        System.out.println("largest word is " + largestWord);
    }}

