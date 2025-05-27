package Task;

public class Task002_CountVowelsandConsonents {
    public static void main(String[] args) {
        String input = "Task002_CountVowelsandConsonents";

        input = input.toLowerCase();

        System.out.println(input);
        int countVowel = 0, countConsonent = 0,countOther=0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 97 && ch <= 122) {
                if (ch == 'a' || ch == 'e' || ch == 'e' || ch == 'o' || ch == 'u') {
                    countVowel++;
                } else {
                    countConsonent++;

                }
            }
            else {
                countOther++;
            }
            }
        System.out.println("countVowel " + countVowel+"\tcountConsonent " + countConsonent) ;
        System.out.println("countOther " + countOther);

    }
}