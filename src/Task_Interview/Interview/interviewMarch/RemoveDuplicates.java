package Task_Interview.Interview.interviewMarch;

import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sentence to reduce");
        String input = scanner.nextLine();

        String result = "";
        for(int i=0; i<input.length();i++){

            char word = input.charAt(i);
            if(result.indexOf(word) == -1){
                result = result + word;
            }


        }
        System.out.println(result);
    }
}