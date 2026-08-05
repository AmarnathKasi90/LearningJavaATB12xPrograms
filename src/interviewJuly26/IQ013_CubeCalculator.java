package interviewJuly26;

import static java.lang.Math.cbrt;
import static java.lang.Math.pow;

public class IQ013_CubeCalculator {
    public static void main(String[] args) {

        int num = 27;
        boolean cube = isCube(num);
        System.out.println(cube);

        double cubeValue = cbrt(num)* cbrt(num) *cbrt(num);
        System.out.println(cubeValue);
        System.out.println(cbrt(num));
        System.out.println(pow(num,3));


    }

    public static boolean isCube(int num) {
        int i;
        for (i = 1; i <= num; i++) {
            if (i * i * i == num) {
                return true;
            }
        }
        return i * i * i == num;
    }
}
