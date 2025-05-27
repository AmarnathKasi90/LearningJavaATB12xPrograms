package ex_27_Static;

public class Lab224_REAL {

    public static void main(String[] args) {

        System.out.println(ATB.mentorName);
        System.out.println(ATB.courseName);

        ATB.doAssignment();
        ATB.joinZoomForClass();

        System.out.println("---------");
        ATB amar = new ATB();
        amar.setName("Amar");
        amar.setPhone("976543210");
        System.out.println(amar);


        System.out.println("---------");
        ATB kasi = new ATB();
        kasi.setName("Kasi");
        kasi.setPhone("988765456");
        System.out.println(kasi);

    }


}

class ATB{
    static {
        System.out.println("Load the class?, I will execute");
    }


    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "Name: " + this.name +  "\tPhone: " + this.phone;
    }

    private String name; // non static
    private String phone;
    static String courseName = "ATB12x";
    static String mentorName = "Amarnath";


    static void doAssignment(){
        //System.out.println(phone); // Static method can't access the non static variables
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass(){
        System.out.println("Class Joined!");
    }


    void howTheyAssignment(){
        System.out.println("It is different!");
    }












}