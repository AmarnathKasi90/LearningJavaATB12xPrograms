package novInterview;

import java.util.Scanner;

public class IQ017_StringBuilderReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String input = scanner.nextLine();

        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println(reverse);

        if(input.equalsIgnoreCase(reverse)){
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("Its not a Palindrome");
        }
    }
}
