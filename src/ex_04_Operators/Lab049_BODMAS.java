package ex_04_Operators;

public class Lab049_BODMAS {
    public static void main(String[] args) {
        System.out.println((9 * 3 / 9 + 1) * 3);
        // BODMAS - Bracket of Div, mul, add, sub
        // Left Side to Right Side

        // 9 * 3 - 27
        // 27/9 -> 3
        // 3+1 -> 4
        // 4 * 3 -> 12
    }
}