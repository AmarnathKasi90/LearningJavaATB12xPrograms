package Task_Interview.Interview.interviewNov;

public class IQ024_NearestPalindrome {
    public static void main(String[] args) {
        String input = "madam";

        String reversed = "";
        for(int i=input.length()-1; i >= 0;i--) {
            char ch = input.charAt(i);
            reversed = reversed + ch;
        }
        
        System.out.println(reversed);
    }
}
