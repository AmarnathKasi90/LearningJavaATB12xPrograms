package interviewJuly26;

public class IQ011_CountVowelsAndConsonants {
    public static void main(String[] args) {
        String sentence = "CountVowelsAndConsonants";
        String words = sentence.toLowerCase();
        System.out.println(words);
        int vowelCount = 0;
        int consonantsCount = 0;
        for (int i = 0; i <= words.length() - 1; i++) {
            char ch = words.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantsCount++;
            } else {
                System.out.println(ch);
            }
        }
        System.out.println(vowelCount + " -vowelCount " + consonantsCount + " -consonantsCount");
    }
}
