package ex_30_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab244_TryCatch_Finally_Purpose {
    public static void main(String[] args) {
        Scanner sc = null;
        System.out.println("Enter the integer");
        sc = new Scanner(System.in);
        try {
            int v = sc.nextInt();
            int b = 10 / v;
            System.out.println(b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        } finally {
            sc.close();
            System.out.println("end of program , sc closed!");
        }

    }
}