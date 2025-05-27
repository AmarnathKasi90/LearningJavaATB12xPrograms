package ex_19_OOps_Inheritance.b_multilevel_inheritance;

public class Lab195_Multi_Level {
    public static void main(String[] args) {


//        Son s1 = new GrandFather();
//        Son s1 = new Father();
        Son amar = new Son();
        amar.s();
        amar.f();
        amar.gf();
        System.out.println(amar.gold_gf);

        Father f1 = new Father();
        f1.home();

        GrandFather gf1 = new GrandFather();
        gf1.home();


        GrandFather grandFather = new Son();
        grandFather.home();




    }
}