package interviewJuly26;

import java.util.Scanner;
public class IQ002_TableForPrintf {
    public static void main(String []args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the required Table");
    int number = scanner.nextInt();
    for(int i=1; i<=10;i++) {
        System.out.printf("%d x %d = %d \n",number,i,number*i);
    }
    }
}
