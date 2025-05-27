package Interview;

import java.util.Scanner;

public class IQ017_StringBuilderReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to check palindrome");
        String input = scanner.nextLine().toLowerCase();
        scanner.close();
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("Entered String is a palindrome");
        } else {
            System.out.println("Entered String is not Palindrome");
        }

    }
}
