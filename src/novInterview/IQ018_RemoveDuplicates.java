package novInterview;

import java.util.Scanner;

public class IQ018_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = scanner.nextLine();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}
