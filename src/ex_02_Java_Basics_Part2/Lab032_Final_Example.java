package ex_02_Java_Basics_Part2;

public class Lab032_Final_Example {
    public static void main(String[] args) {
        int local;
        local = 10;
        System.out.println(local);

        final float PI;
        PI = 3.13f;
        // PI = 3.14F; //This is final in nature.
        System.out.println(PI);
    }
}