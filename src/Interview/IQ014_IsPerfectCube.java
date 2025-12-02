package Interview;

public class IQ014_IsPerfectCube {
    public static void main(String[] args) {
        int number1 = 27;
        int number2 = 30;

        System.out.println(number1 + " is perfect cube: " + isPerfectCube(number1));
        System.out.println(number2 + " is perfect cube: " + isPerfectCube(number2));
        System.out.println(number1 + " is perfect cube: " + cubeMultiplication(number1));
    }

    public static boolean cubeMultiplication(int number) {
        for (int i = 1; i * i * i <= number; i++) {
            if (i * i * i == number) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPerfectCube(int number) {
        double cuberoot = Math.cbrt(number);
        return Math.round(cuberoot) * Math.round(cuberoot) * Math.round(cuberoot) == number;
    }



}

