package Interview;

import java.util.Scanner;

public class IQ012_PrimeChecker {
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i+2) == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check prime");
        int number = scanner.nextInt();
        scanner.close();

        if(isPrime(number))
        {
            System.out.println(number + "is prime number");
        }
        else {
            System.out.println(number + "is not prime number");
        }
    }


}
