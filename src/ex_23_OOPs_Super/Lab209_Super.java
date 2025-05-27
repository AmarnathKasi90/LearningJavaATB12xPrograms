package ex_23_OOPs_Super;

public class Lab209_Super {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.display();
    }
}


class GOD{
    void sound(){
        System.out.println("Om");
    }
}

class Animal extends GOD{
    protected  String color  = "white";


    void sound(){
        System.out.println("Animal Sound!");
        super.sound();
    }
    void display(){
        System.out.println("Animal Display");
    }

}

class Dog extends Animal{

    private String color  = "Black";

    Dog(){
        super();
    }

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }

}