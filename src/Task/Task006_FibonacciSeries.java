package Task;

public class Task006_FibonacciSeries {
    public static void main(String[] args) {
        int n= 10;
        int first = 0, second = 1, next;

        for(int i= 0; i<n;i++){
            System.out.println(first);

            next = first + second;
            first = second;
            second = next;
          }
       // System.out.println(first);

    }
}
