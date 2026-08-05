package interviewJuly26;

import java.util.Scanner;

public class IQ012_PrimeChecker {
    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean prime = isPrime(num);
        if(prime)
        {
            System.out.println(num + "is Prime Number");
        }
        else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}
