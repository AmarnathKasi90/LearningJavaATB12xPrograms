
package ex_02_Java_Basics_Part2;

public class Lab029_Constants {
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int HOUR_IN_DAY = 24;

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        final int b = 99;
//        b =11;  // java: cannot assign a value to final variable b
        System.out.println(b);
        //b = b+1;
        System.out.println(b);
        System.out.println(b);

        final float PI = 3.14f;
        final float PI1 = 3.14f;


        final int a1 = 10;



    }
}
