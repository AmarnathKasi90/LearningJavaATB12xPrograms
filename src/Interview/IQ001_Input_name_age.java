package Interview;

import java.util.Scanner;

public class IQ001_Input_name_age {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = scanner.nextLine();

        System.out.println("Enter your age ");
        byte age = scanner.nextByte();

        System.out.println("Hello " + name + "! You are " + age + " years old.");

        scanner.close();

    }


}
