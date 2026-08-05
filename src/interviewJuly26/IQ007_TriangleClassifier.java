package interviewJuly26;

import static java.lang.Integer.parseInt;

public class IQ007_TriangleClassifier {
    public static void main(String[] args) {
        int angle1 = parseInt(args[0]);
        int angle2 = parseInt(args[1]);
        int angle3 = parseInt(args[2]);

        if((angle1<=0 ||angle2<=0 ||angle3<=0)||(angle1+angle2+angle3!=180)){
            System.out.println("Not a triangle");
            return;
        };

        if(angle1==angle2 && angle2==angle3){
            System.out.println("Equilateral Triangle");
        }
        else if ((angle1 == angle2) || (angle2 ==angle3) ||(angle3==angle1)){
            System.out.println("Isosceles triangle");
        }
        else{
            System.out.println("Scalene Triangle");
        }



    }
}
