package Task;

public class Task005_LeapYear {

    public static void main(String[] args) {
       // int year = 2028;
        for(int year= 1889; year<=2112;year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is the leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }
}
