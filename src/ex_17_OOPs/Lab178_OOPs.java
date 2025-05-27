
package ex_17_OOPs;

public class Lab178_OOPs {

    public static void main(String[] args) {
        Person reddy;
        Person p2 = new Person();
        // Person - Class
        // p2 - Object Ref
        // new Person() -> Object

        p2.name = "Amar";
        System.out.println(p2.name);

        Person p3  = new Person();
        p3.name = "kasi";
        System.out.println(p3.name);


        new Person().name = "Not Ref name";
        System.out.println(p2.greet(" Amar"));
        p2.sleep();
            p2.talk();
        System.out.println("your Remaining Salary "+ p2.remaining_amount_sal(100,10));

        System.out.println();

    }


}

class Person{
    // Attribute | Properties |  Data Members | Instance variables
    String name;
    String phone;
    String color_eyes;
    int legs;
    double salary;
    byte age;
    double weight;
    boolean isMale;

    // Behaviour | Function | Method
    void sleep(){
        System.out.println("I am sleeping");
    }

    String greet(String name){
        return "Hello" +name;
    }

    void talk(){
        System.out.println("you are Talking about ");
    }
    int remaining_amount_sal(int salary,int tax){
        return salary-tax;
    }
}
