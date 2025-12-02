package novInterview;

import java.util.Scanner;

public class IQ016_StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String input = scanner.nextLine();
        scanner.close();
        char[] sentence = input.toCharArray();
        reverseWords(sentence);
        System.out.println(new String(sentence));
    }

    public static void reverseWords(char[] sentence) {
        reverse(sentence, 0, sentence.length - 1);

        int start = 0;

        for (int end = 0; end < sentence.length; end++) {
            if (sentence[end] == ' ') {
                reverse(sentence, start, end - 1);
                start = end + 1;
            }
        }
        reverse(sentence, start, sentence.length - 1);

    }

    public static void reverse(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
