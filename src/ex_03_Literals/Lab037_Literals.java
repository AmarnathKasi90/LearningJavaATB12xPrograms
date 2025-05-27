package ex_03_Literals;

import static ex_02_Java_Basics_Part2.Lab029_Constants.SECONDS_IN_MINUTE;

public class Lab037_Literals {
    public static void main(String[] args) {
        int age = 65; // Decimal System - base wil 10

        // Binary Literal
        int binary_num = 0b1010; // Decimal System - 10


        // Octal base? -> 8
        int octal = 0101;

        // Hexadecimal Literals - 16
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745


        System.out.println(age);
        System.out.println(binary_num);
        System.out.println(octal);
        System.out.println(hex);
        System.out.println(SECONDS_IN_MINUTE);

    }
}