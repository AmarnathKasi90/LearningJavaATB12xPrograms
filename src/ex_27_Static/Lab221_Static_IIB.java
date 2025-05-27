package ex_27_Static;

public class Lab221_Static_IIB {

    public static void main(String[] args) {

        System.out.println("----------");
        P p1 = new P();
        P p2 = new P();
        P p3 = new P();

        // IIB -> 3 -> Objects
        // SIB -> 1 -> Class
    }

}

class P{
    static {
        System.out.println("SIB");

    }

    {
        System.out.println("IIB");
    }
    P(){
        System.out.println("DC");
    }



}