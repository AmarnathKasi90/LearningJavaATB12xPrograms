package Interview;

public class IQ007_TriangleClassifier {
    /* ✅ Triangle Classifier:

Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides,
determine if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or scalene (no sides are equal).
Use an if-else statement to classify the triangle. */
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Error: Please provide exactly 3 angles.");
            return;
        }
        int angle1, angle2, angle3;
        try {
            angle1 = Integer.parseInt(args[0]);
            angle2 = Integer.parseInt(args[1]);
            angle3 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Error: All inputs must be valid integers.");
            return;
        }

        if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0 || (angle1 + angle2 + angle3 != 180)) {
            System.out.println("Its not a Triangle");
            return;
        } else if (angle1 == angle2 && angle2 == angle3) {
            System.out.println("Its a Equilateral Triangle");
        } else if ((angle1 == angle2) || (angle2 == angle3) || (angle3 == angle1)) {
            System.out.println("Its a Isosceles");
        } else {
            System.out.println("its a scalene");
        }
    }


}
