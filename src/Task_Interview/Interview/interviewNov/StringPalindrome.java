package Task_Interview.Interview.interviewNov;

class StringPalindrome {
    public static void main(String[] args) {
        String input = "madam";
        String reverse = "";

        for(int i=input.length()-1; i>=0;i--){
            char ch = input.charAt(i);
            System.out.println("CH " + ch);
            reverse = reverse + ch;
        }

        System.out.println(reverse);

        System.out.println(reverse.equals(input) ? "palindrome" : "Not Palindrome");
    }}
