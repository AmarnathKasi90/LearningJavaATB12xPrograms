package novInterview;

import java.util.Scanner;


public class IQ001_Input_name_age {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = scanner.nextLine();
        System.out.println("Enter the Age");
        int age = scanner.nextInt();
        System.out.println("Hi "+name +" your age is: " +age);
    }
}
