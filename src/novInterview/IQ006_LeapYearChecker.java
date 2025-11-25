package novInterview;

public class IQ006_LeapYearChecker {
    public static void main(String[] args) {
        String years = args[0];
        int year = Integer.parseInt(years);
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year is " + year);
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
