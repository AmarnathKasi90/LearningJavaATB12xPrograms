package ex_19_OOps_Inheritance.c_hierarchical;

public class Lab197_hierarchical {

    public static void main(String[] args) {
        Father f1 = new Father();
        Reddy  r1 = new Reddy();

        r1.home();
        f1.home();

        Amar a1 = new Amar();
        a1.home();

        Kasi k1 = new Kasi();
        k1.k2();
        k1.home();


    }


}

class Father{
    void home(){
        System.out.println("3BHK");
    }
}

class Amar extends Father{
    void a2(){
        System.out.println("a2 - Amar");
    }
}

class Kasi extends Father{

    void k2(){
        System.out.println("Kasi");
    }
}

class Reddy extends Father {
    void r1(){
        System.out.println("Reddy");
    }
}