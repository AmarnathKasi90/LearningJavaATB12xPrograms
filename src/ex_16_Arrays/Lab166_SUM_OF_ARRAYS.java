package ex_16_Arrays;

public class Lab166_SUM_OF_ARRAYS {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 10};

        System.out.println();

        int sum = addValues(numbers);

        System.out.println(sum);
    }

    private static int addValues(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}