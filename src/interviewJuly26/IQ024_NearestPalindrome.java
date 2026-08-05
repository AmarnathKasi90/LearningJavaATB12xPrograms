package interviewJuly26;

public class IQ024_NearestPalindrome {
    public static void main(String[] args) {
        int number = 133;
        int lower = number - 1;
        int upper = number + 1;
        while(!isPlaindrome(lower)){
            lower--;
        }
        while(!isPlaindrome(upper)){
            upper++;
        }
        if((number-lower) <= (upper - number)){
            System.out.println(lower);
        }
        else {
            System.out.println(upper);
        }

    }
    private static boolean isPlaindrome(int number){
        int reversed = 0;
        int orginal = number;

        while(number > 0){
            reversed = reversed * 10 + number %10;
            number = number / 10;

        }
        return orginal == reversed;
    }
}
