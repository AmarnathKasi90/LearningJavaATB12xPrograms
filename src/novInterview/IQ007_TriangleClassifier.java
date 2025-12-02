package novInterview;

public class IQ007_TriangleClassifier {
    public static void main(String[] args) {
        int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int side3 = Integer.parseInt(args[2]);
        if(side1+side2<=side3 || side2+side3<=side1 || side1+side3<=side2)
        {
            System.out.println("Not a valid Triangle");
            return;
        }

        if (side1 == side2 && side2 ==  side3) {
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
