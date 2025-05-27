package ex_03_Literals;

public class Lab038_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
//        char c = "A"; // "" == String = Bunch of Char

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        char c9 = 65;
        char c10 = 97;
        //  // ASCII, (limited numbers) - A -> 65 ,  a-> 97
        System.out.println(c9);
        System.out.println(c10);
        System.out.println(c10 + c9);

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println("my_laugh_smily " + my_laugh_smily);

        char c11 = '\u1F60';
        System.out.println(c11);



    }
}