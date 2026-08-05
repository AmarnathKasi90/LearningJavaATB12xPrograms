package Task_Interview.Interview.interviewNov;

class Triangle {
    public static void main(String[] args) {

//        int angle1 = 120;
//        int angle2 = 40;
//        int angle3 = 10;

        int angle1 = Integer.parseInt(args[0]);
        int angle2 = Integer.parseInt(args[1]);
        int angle3 = Integer.parseInt(args[2]);


        if(angle1+angle2 >= angle3 || angle2 +angle3 >= angle1 || angle1+angle3 >= angle2 ) {
            System.out.println("Its not valid Triangle");
        }

        if(angle1+angle2+angle3 <= 180) {
            System.out.println("Its a valid Triangle");
        }

        if(angle1 == angle2 &&  angle2== angle3) {
            System.out.println("Its a equilateral Triangle" );
        }
        else if (angle1 == angle2 || angle2== angle3 || angle1 == angle3){
            System.out.println("Its a Scalene Triangle");
        }
        else{
            System.out.println("Its a isosceles Triangle");
        }
    }

}




