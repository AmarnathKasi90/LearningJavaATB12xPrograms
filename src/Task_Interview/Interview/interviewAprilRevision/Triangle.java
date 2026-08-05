package Task_Interview.Interview.interviewAprilRevision;

class Triangle {
    public static void main(String[] args) {
        int angle1 = Integer.parseInt(args[0]);
        int angle2 = Integer.parseInt(args[1]);
        int angle3 = Integer.parseInt(args[2]);

        if(args.length == 3){
            System.out.println("Entered 3 Arguments");
        }
        else{
            System.out.println("Enter three Angles");
            return;
        }

        if(angle1<=0 || angle2<=0 || angle3<=0 || angle1 + angle2 >=angle3 || angle2+angle3 >= angle1 || angle1+angle3 >= angle2){
            System.out.println("Not a valid Triangle");
            return ;
        }

        if(angle1+angle2+angle3 <= 180){
            System.out.println("Its a valid Triangle");
        }

        if(angle1 == angle2 && angle2==angle3){
            System.out.println("Equilateral Triangle");
        }
        else if(angle1==angle2 || angle2==angle3){
            System.out.println("Scalene Triangle");
        }
        else{
            System.out.println("Isosceles Triangle");
        }
    }
}

