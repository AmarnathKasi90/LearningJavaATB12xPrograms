package novInterview;

public class IQ014_SquareCalculator {
    public static void main(String[] args) {
        // Square multiplication
        int number = 5;
        int square = number * number;

        // Square Power
        double s = Math.pow(2,number);
        System.out.println("Math Square " + s);
        System.out.println("Square of number" + square);
        int number1 = 4;
        System.out.println("IsSquare " + isSquare(number));
        System.out.println("VerifySquare "+ verifySquare(number));
        System.out.println("VerifySquare "+ verifySquare(number1));

    }

    public static boolean isSquare(int number) {
        for (int i = 1; i * i <= number; i++) {
            if (i * i <= number) {
                return true;
            }
        }
        return false;
    }

    public static boolean verifySquare(int number){
        double square = Math.sqrt(number);
        return square * square == number;

    }
}
