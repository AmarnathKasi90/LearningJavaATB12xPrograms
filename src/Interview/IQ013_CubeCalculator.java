package Interview;

public class IQ013_CubeCalculator {
    public static void main(String[] args) {
        int number = 5;

       int cube1 = number * number * number ;
        System.out.println("Cube with Multiplication is " + cube1);

    double cube2 = Math.pow(number,3);
        System.out.println("Cube using Math.pow is " + cube2);


    }
}
