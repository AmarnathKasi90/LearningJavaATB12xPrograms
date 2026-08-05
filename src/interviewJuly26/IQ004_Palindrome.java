package interviewJuly26;

import java.util.Scanner;

public class IQ004_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word for Palindrome");

        String word = scanner.next();
        String reversed ="";
        for(int i= word.length()-1; i >= 0;i--){
            char ch = word.charAt(i);
            reversed = reversed + ch;
            System.out.println(reversed);
        }
        if(reversed.equalsIgnoreCase(word)){
            System.out.println(reversed + " Palindrome");
        }
        else{
            System.out.println(reversed + " Not Pallindrome");
        }

    }

}
