package Task_Interview.Interview.interviewAprilRevision;

class PalindromeString {
    public static void main(String[] args) {

        String input = "madam";

        String reverse = "";

        for(int i = input.length()-1 ; i>=0; i--) {

            char ch = input.charAt(i);

            reverse = reverse + ch;

        }

        System.out.println(reverse.equals(input) ? "Palindrome" : "Not Palindrome");
    }
}

