package Interview;

import java.util.Scanner;

public class IQ006_LeapYearChecker {
    /*✅ Leap Year Checker:
Create a program that determines whether a given year is a leap year.
A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
Use an if-else statement to make this determination.
*/
    /* The leap year rule was introduced to fix calendar drift — over time, our calendar would drift away from the actual solar year (which is about 365.2422 days long).
Just using year % 4 == 0 (like the old Julian calendar did) makes the average year too long (365.25 days).
Over hundreds of years, this causes noticeable drift in seasons and dates (e.g., spring starts in February).
So, the Gregorian calendar added the century rule: years divisible by 100 are NOT leap years, unless they are also divisible by 400.
It’s the exception to the "divisible by 100" rule.
This makes sure that:
Years like 1600, 2000, and 2400 are leap years ✅
But 1700, 1800, 1900, 2100 are not ❌
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap year");
        } else {
            System.out.println(year + " not a leap year");
        }
        scanner.close();
    }
}
