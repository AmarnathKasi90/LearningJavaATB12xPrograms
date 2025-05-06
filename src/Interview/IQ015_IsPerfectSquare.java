package Interview;

public class IQ015_IsPerfectSquare {
    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 5;
        System.out.println(number1 +" is perfect square:" + isPerfectSquare(number1));
        System.out.println(number2 +" is perfect square:" + isPerfectSquare(number2));

    }

    private static boolean isPerfectSquare(int number) {
        double sqrt = Math.sqrt(number);
        return Math.round(sqrt) * Math.round(sqrt) == number;
    }
}
