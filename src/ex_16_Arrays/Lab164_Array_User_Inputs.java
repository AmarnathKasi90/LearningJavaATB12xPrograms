package ex_16_Arrays;

import java.util.Scanner;

import static ex_16_Arrays.Lab163_Arrays_Max_Min.give_max;
import static ex_16_Arrays.Lab163_Arrays_Max_Min.give_min;

public class Lab164_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size");
       int  arraySize = scanner.nextInt();

       int[] array = new int[arraySize];
        int [] marks = new int[arraySize];

        for(int i=0; i< array.length;i++)
       {
           System.out.println("Enter the " + (i+1)+  "st student marks");
           marks[i]= scanner.nextInt();
       }
        System.out.println("-------------");
        for(int i=0; i< marks.length; i++){
            {
                System.out.println(marks[i]);
            }
        }

        int min_marks = give_min(marks);
        int max_marks = give_max(marks);

        System.out.println("Minimum Marks of Student " + min_marks);
        System.out.println("Maximum Marks of Student " + max_marks);

        scanner.close();



    }
}
