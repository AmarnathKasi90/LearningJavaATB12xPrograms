package interviewJuly26;

public class IQ023_LargestWord {
    public static void main(String[] args) {
        String sentence = "Find the Largest word";
        String [] words = sentence.split("\\s+");
        String LargestWord ="";
        for(String word: words){
            if(word.length() > LargestWord.length()){
                LargestWord = word;
            }
        }
        System.out.println(LargestWord);
    }
}
