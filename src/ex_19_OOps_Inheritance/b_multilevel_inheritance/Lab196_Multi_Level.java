package ex_19_OOps_Inheritance.b_multilevel_inheritance;

public class Lab196_Multi_Level {
    public static void main(String[] args) {


//        Son s1 = new GrandFather();
//        Son s1 = new Father();
        Son amar = new Son();

        GrandFather g1 = new Son(); // Dynamic Dispatch
        g1.gf();
        g1.home();



        GrandFather g2 = new Father();
        g2.home();


        Father f2 = new Son();
        f2.home();
        // Father f3 = new GrandFather();







    }
}