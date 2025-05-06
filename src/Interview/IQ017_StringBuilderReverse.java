package Interview;

import java.util.Scanner;

public class IQ017_StringBuilderReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to check palindrome");
        String input = scanner.nextLine().toLowerCase();

        String reversed = new StringBuilder(input).reverse().toString();

        if(input.equals(reversed)){
            System.out.println("Enter String is palindrome");
        }else {
            System.out.println("Entered String is not Palindrome");
        }

    }
}
