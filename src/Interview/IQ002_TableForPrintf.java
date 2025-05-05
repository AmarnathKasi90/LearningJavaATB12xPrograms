package Interview;

import java.util.Scanner;

public class IQ002_TableForPrintf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the table name");
        int table = scanner.nextInt();

        System.out.println("Enter the end number");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d X %d = %d \n", table, i, table * i);
        }
    }
}
