package ex_30_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab252_Throw extends Object {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!");
        try {
            int age = sc.nextInt();
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




    }

    private static void validateAge(int age) throws ArithmeticException,NullPointerException,Exception {
        if(age < 18){
            throw new Exception("You can't go, else you will be out of the house");
            // throw new NotValidAgeException("Not a Valid age");
        }

    }


}