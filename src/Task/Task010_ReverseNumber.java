package Task;

public class Task010_ReverseNumber {
    public static void main(String[] args) {
        int number = 123;

        int lower = number - 1;
        int higher = number + 1;

        while (!isPalindromes(lower)) {
            lower--;
        }
        while (!isPalindromes(higher)) {
            higher++;
        }

        if ((number - lower) <= (higher - number)) {
            System.out.println("Nearest lower number" + lower);
        } else {
            System.out.println("Highest Number" + higher);
        }
    }
    private static boolean isPalindromes(int number) {
        int originalNumber = number;
        int reversed = 0;

        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        return reversed == originalNumber;

    }
}



