package novInterview;

public class IQ005_GradeCalculator {
    public static void main(String[] args) {
        String mark = args[0];

        int marks = Integer.parseInt(mark);
        if (marks > 75 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks > 60 && marks <= 75) {
            System.out.println("Grade B");
        } else if (marks >= 35 && marks <= 60) {
            System.out.println("Grade C");
        } else if (marks < 35) {
            System.out.println("Failed");
        } else {
            System.out.println("Enter valid marks");
        }

    }
}
