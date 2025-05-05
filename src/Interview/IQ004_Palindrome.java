package Interview;

import java.util.Scanner;

public class IQ004_Palindrome {
 /* ✅ Palindrome Checker:
Create a program that checks whether a given string is a palindrome.
A palindrome is a word or phrase that reads the same backward as forward
(ignoring spaces, punctuation, and capitalization). Use an if-else statement
to determine if the string is a palindrome.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Palindrome word");
        String word = scanner.next().toLowerCase();
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(reversed + " is a Palindrome.");
        } else {
            System.out.println(reversed + " is not a Palindrome");
        }
    scanner.close();
    }
}
