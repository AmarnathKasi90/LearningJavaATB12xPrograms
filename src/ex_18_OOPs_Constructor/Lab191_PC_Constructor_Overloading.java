package ex_18_OOPs_Constructor;

public class Lab191_PC_Constructor_Overloading {
    public static void main(String[] args) {
        Person1 p1 = new Person1("AMAR", 97654321);
        Person p2 = new Person("KASI", 98989898, "XYZ");

        Person1 p3 = new Person1();
        p3.name = "REDDY";
        System.out.println(p3.name);

        Person1 p4 = new Person1("RK", 823424242);
        System.out.println(p4.address);

        System.out.println(p1);
        System.out.println(p2);
        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }
}


class Person1 {

    String name;
    long phone;
    String address;

    Person1() {
    }

    Person1(String name_arg, long phone_arg, String address_arg) {
        this.name = name_arg;
        this.address = address_arg;
        this.phone = phone_arg;

    }

    Person1(String name_arg, long phone_arg) {
        this.name = name_arg;
        this.phone = phone_arg;

    }

    void eat() {
        System.out.println(this.name + " is eating a lot!");
    }

//    @Override
//    public String toString() {
//        return "Person1{name='" + name + "', phone=" + phone + ", address='" + address + "'}";
//    }

}