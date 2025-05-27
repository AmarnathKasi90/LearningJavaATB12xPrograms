package ex_32_Collection_Framework_DSA.LIST;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab271_UserInput_AL {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        ArrayList ages = new ArrayList();

        Scanner scanner = new Scanner(System.in);
       String continueInput = "Y";

       while(continueInput.equalsIgnoreCase("Y")){
           System.out.println("Enter the name of the Student");
           names.add(scanner.next());

           System.out.println("Enter the Age of the Student");
           ages.add(scanner.nextInt());

           scanner.nextLine();
           System.out.println("Do you still want to add Students");
           continueInput = scanner.nextLine();

       }

       for(Object o : names){
           System.out.println(o);
       }

       for(Object o : ages){
           System.out.println(o);
       }
    }

}
