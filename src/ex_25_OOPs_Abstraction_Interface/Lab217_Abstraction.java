package ex_25_OOPs_Abstraction_Interface;

public class Lab217_Abstraction {
}


class ConcreateClass implements Incomplete_Interface {

    @Override
    public void display() {
        System.out.println("Hi");
    }
}

interface Incomplete_Interface {
    int a = 10; // final

    void display();

    default void display2() {
        System.out.println("Default is allowed!");
    }

    static void display3() {
        System.out.println("Default is allowed!");
    }
    //public static void display7();

//      default static void display10();
//      default static void display11(){}
    private void display4() {
    }

    private static void display5() {
    }

    private static void display6() {
    }

    public static void display7() {
    }

}

abstract class Incomplete_abstract {
    int a = 10;

    abstract void display1();

    void display2() {


    }
}