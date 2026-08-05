package interviewJuly26;
import java.util.Scanner;

public class IQ001_Input_name_age {
    public static void main(String []args){
        // Name with Age
        System.out.println("Enter Name");
       Scanner  scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter Age");
        byte age = scanner.nextByte();
        scanner.close();

        System.out.println("Hi " + name +" your Age : " + age);


    }

}
