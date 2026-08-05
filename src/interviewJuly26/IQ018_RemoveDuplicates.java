package interviewJuly26;

public class IQ018_RemoveDuplicates {
    public static void main(String[] args) {
        String sentence = "Remove Duplicates  Now";
//        char[] words = sentence.toCharArray();
        String result = "";
        for(int i =0; i<sentence.length();i++) {
            char ch = sentence.charAt(i);

            if(result.indexOf(ch)==-1){
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
