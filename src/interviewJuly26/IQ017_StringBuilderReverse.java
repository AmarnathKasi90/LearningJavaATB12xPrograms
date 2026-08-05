package interviewJuly26;

public  class IQ017_StringBuilderReverse{
    public static void main(String[] args) {
        String input = "madam";

        String output = new StringBuilder(input).reverse().toString();

        if(output.equalsIgnoreCase(input)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}