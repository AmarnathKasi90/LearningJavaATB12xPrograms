package Task_Interview.Interview.interviewAprilRevision;

import java.util.Scanner;

class PrimeChecker {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check for Prime");
        int number = scanner.nextInt();

        boolean result = isPrime(number);

        System.out.println( number + " is a Prime number: " + result );
    }

    private static boolean isPrime(int number) {

        if(number<=1) return false;

        if(number == 2 || number == 3) return true;

        if(number % 2 ==0 || number % 3 == 0) return false;

        for(int i =5  ; i * i <= number ; i= i+5  ){

            if (number % i == 0 || number %(i+2) == 0){
                return false;
            }
        }
        return true;
    }
}



