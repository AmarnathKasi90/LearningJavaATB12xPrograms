package Interview;

import java.util.Scanner;

public class IQ005_GradeCalculator {
  /*  ✅ Grade Calculator:
    Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

    A: 90-100
    B: 80-89
    C: 70-79
    D: 60-69
    F: 0-59
*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Student percentage");
        int percentage = scanner.nextInt();

        if(percentage>=90 && percentage <=100){
            System.out.println("A - Grade");
        }
        else if(percentage>=80 && percentage <=89){
            System.out.println("B - Grade");
        }
        else if(percentage>=70 && percentage <=79){
            System.out.println("C - Grade");
        }
        else if(percentage>=60 && percentage <=69){
            System.out.println("D - Grade");}
        else if(percentage>=0 && percentage <=59){
                System.out.println("F - Grade");

        }
    }
}
