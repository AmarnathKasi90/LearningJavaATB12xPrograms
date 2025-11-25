package Task;

import java.math.BigInteger;

public class Task008_Factorial {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;
       // BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
          //  factorial = factorial.multiply(BigInteger.valueOf(i));
            }
        System.out.println(factorial);


    }
}
