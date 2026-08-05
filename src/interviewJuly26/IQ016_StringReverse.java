package interviewJuly26;

public class IQ016_StringReverse {
    public static void main(String[] args) {
        String input = "Reverse the  Following String";
        char[] sentence = input.toCharArray();
        reverseTheWords(sentence);
        System.out.println(new String(sentence));
    }

    private static void reverseTheWords(char[] sentence) {
        int start = 0;
        reverse(sentence, start, sentence.length - 1);

        for (int end = 0; end < sentence.length; end++) {
            if (sentence[end] == ' ') {
                reverse(sentence, start, end - 1);
                start = end + 1;
            }
        }
        reverse(sentence, start, sentence.length - 1);
    }

    private static void reverse(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}