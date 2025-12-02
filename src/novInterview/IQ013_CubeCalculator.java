package novInterview;

public class IQ013_CubeCalculator {
    public static void main(String[] args) {

        //Cube of Number
        int n = 5;
        int cube = n * n * n;
        System.out.println("Cube using multiplication " + cube);

        double cube2 = Math.pow(n, 3);
        System.out.println("Cube using math power " + cube2);

        int n3 = 27;
        for(int i=1;i<=n3;i++){
            cube = i * i * i;
            System.out.println("cube of " + i+ " is " + cube );
        }

        // Perfect Cube
        int number = 30;
        System.out.println("verify perfect cube " + verifyCube(number));
        System.out.println("verify perfect cube " + verifyCube(n3));

    }



    public static boolean isPerfectCube(int number) {
        double cube = Math.cbrt(number);
        return cube * cube * cube == number;
    }

    public static boolean verifyCube(int number) {
        for (int i = 1; i * i * i <= number; i++) {
            if (i * i * i <= number) {
                return true;
            }
        }
        return false;
    }

}
