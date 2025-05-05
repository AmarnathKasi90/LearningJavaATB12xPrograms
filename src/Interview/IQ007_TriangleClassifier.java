package Interview;

public class IQ007_TriangleClassifier {
    /* ✅ Triangle Classifier:

Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides,
determine if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or scalene (no sides are equal).
Use an if-else statement to classify the triangle. */
    public static void main(String[] args) {

        int angle1 = Integer.parseInt(args[0]);
        int angle2 = Integer.parseInt(args[1]);
        int angle3 = Integer.parseInt(args[2]);

        if(angle1 <=0 || angle2 <= 0 || angle3 <=0){
            System.out.println("Its not a Triangle");
        }
        if (angle1 + angle2 <= angle3 ||angle2 + angle3 <= angle1 || angle1 + angle3 <= angle2)
        {
            System.out.println("Its not a Triangle");
        }

       else if (angle1==angle2 && angle2==angle3){
            System.out.println("Its a Triangle");
        }
        else if ((angle1==angle2) || (angle2 ==angle3) || (angle3 == angle1)){
            System.out.println("Its a Isosceles");
        } else {
            System.out.println("its a scalene");
        }
    }


}
