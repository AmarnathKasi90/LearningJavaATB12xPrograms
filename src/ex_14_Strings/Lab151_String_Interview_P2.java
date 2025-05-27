
package ex_14_Strings;

public class Lab151_String_Interview_P2 {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello"; // SCP -> 1

        String s2 = new String("Hello"); // OA
        String s3 = new String("Hello");
        String s5 = new String("hello"); //  OA = 3

        // == -> Comparsion -> String -> this check the locations ref.
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1 == s4);
        System.out.println(s3 == s5);

        // equals ( content) -> value

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));

        //  equalsIgnoreCase -> amarnath. Amarnath, AMARNATH , AmaRnath . AmarNATH -> amarnath
        //  == - check for the ref
        // = assignment the value

//https://chatgpt.com/c/682eeb60-60cc-8002-b2b6-8e31eb7a8975







    }
}
