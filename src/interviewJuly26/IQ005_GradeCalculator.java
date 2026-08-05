package interviewJuly26;

public class IQ005_GradeCalculator {
    public static void main(String[] args) {
        int percentage = 59;
        if(percentage >=85 && percentage <=100){
            System.out.println("Grade A");
        }
        else if (percentage>=60&& percentage<85){
            System.out.println("grade B");
        }

        else if (percentage>=35&& percentage<60){
            System.out.println("grade C");
        }

        else if (percentage>=0 && percentage<35){
            System.out.println("grade F");
        }

        else if (percentage < 0 || percentage > 100){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("check the percentage");
        }

    }
}
