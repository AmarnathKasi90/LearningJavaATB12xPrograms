package interviewJuly26;

public class IQ026_FibonacciSeries {
    public static void main(String[] args) {
        int number = 10;
        int first = 0,  second = 1 , next;
        for(int i = 1; i<=number;i++){
            System.out.println(first);
            next = first+second;
            first = second;
            second = next;

        }
    }
}
