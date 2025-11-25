package novInterview;

import java.util.Scanner;

public class IQ004_Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word to check palindrome");
        String word = scanner.next();
        String reversed = isPalindrome(word);

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(reversed + " is palindrome ");
        } else {
            System.out.println(reversed + " is not palindrome ");
        }
    }

    static String isPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return reversed;
    }

}









