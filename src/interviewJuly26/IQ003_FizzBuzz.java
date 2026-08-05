package interviewJuly26;

import java.util.Scanner;

public class IQ003_FizzBuzz {
    public static void main(String []args){
        System.out.println("enter number for Fizzbuzz");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i=1; i<number;i++){
            if(i%5==0 && i%3==0){
                System.out.println("FIZZBUZZ");
            }
            else if (i%5==0){
                System.out.println("FIZZZZZ");
            }
            else if(i%3==0){
                System.out.println("BUZZ");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
