package ex_04_Operators;

public class Lab050_BODMAS {
    public static void main(String[] args) {
        System.out.println((8 / 6 + 4 * 5) - 3);
        System.out.println((12 % 6 + 4 * 5) - 3);
        // BODMAS - Bracket of Div, mul, add, sub
        // Left Side to Right Side

        // 12 / 6 - 2
        // 4 * 5 -> 20
        // 2+20 -> 22
        // 22 - 3 -> 19
    }
}