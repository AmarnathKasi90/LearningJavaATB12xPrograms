package Interview;

public class IQ024_NearestPalindrome {
    public static void main(String[] args) {


        int number = 1;
        int lower = number - 1;
        int higher = number + 1;
        while (!isPalindrome(lower)) {
            lower--;
        }
        while(!isPalindrome(higher)){
            higher++;
        }

        if((number-lower)<=(higher-number)){
            System.out.println("Nearest palindrome is " + lower);
        }
        else {
            System.out.println("Nearest palindrome is " + higher);
        }
    }

    private static boolean isPalindrome(int number) {
        int reversed = 0;
        int original = number;
//        for(;number>0; number/=10){
//            reversed = reversed * 10 + number %10;
//        }
//return original == reversed;
//
        while(number>0){
            reversed = reversed*10 + number %10;
            number/=10;
        }
        return original == reversed;
    }


}
