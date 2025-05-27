package ex_04_Operators;

public class Lab051_BODMAS {
    public static void main(String[] args) {
        System.out.println((11 - 5 * 3 / 2) - (9 / 3 + (9 + 1)));
        System.out.println((8 * 7 / 4 - 1 % 5) + ((4 - 6 * 3 - 5)));
        System.out.println((8 / 7 * 4 % 2) + ((4 - 6 * 3 - 5)));
/**
 * Following Java operator precedence rules, which are:
 * Parentheses first.
 * Multiplication (*), Division (/), and Modulus (%) are evaluated left to right.
 * Addition (+) and Subtraction (-) come afterward.
 */
    }
}