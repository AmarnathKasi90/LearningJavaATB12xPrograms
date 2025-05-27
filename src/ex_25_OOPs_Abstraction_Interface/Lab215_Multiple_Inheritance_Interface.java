package ex_25_OOPs_Abstraction_Interface;

public class Lab215_Multiple_Inheritance_Interface {

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.money();
    }
}

interface Mother{
    void money();
}
interface Father{
    void money();
}

class Child implements Mother,Father{


    @Override
    public void money() {
        System.out.println("Child Money!");
    }
}