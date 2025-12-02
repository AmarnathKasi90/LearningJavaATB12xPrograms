package novInterview;

import java.util.Scanner;

public class IQ012_PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
       if(isPrime(number)){
           System.out.println(number +" is Prime number");
       }else {
           System.out.println(number+ " is not a prime number");
       }
    }
    static Boolean isPrime(int number){

        if(number<=1){
            return false;
        } else if (number<=3) {
            return true;
        } else if (number % 2 == 0 || number%3==0) {
            return false;
        } else {
            for(int i=5;i*i<=number;i=i+6){
                if(number%i==0 || number%(i+2)==0){
                    return false;
                }
            }
            return true;
        }
    }
}
