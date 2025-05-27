package ex_03_Literals;

public class Lab039_Escape_Char {
    public static void main(String[] args) {

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("AmarnathKasi");
        System.out.println("Amarnath" + new_line + "Kasi");
        System.out.println("Amarnath\nKasi");
        System.out.println("Amarnath" + tab_line + "Kasi");

        System.out.println(" ----- ");
        System.out.println("Amarnath" + back_space + "Kasi");
        System.out.println(" ----- ");

        System.out.println("Amarnath is " + carriage_return + "Kasi");

        System.out.println("Hi, This is a First line" + new_line + "This is second line\n\tThis is Third line\n\t\bThis is Forth line");

        System.out.println("Hello World");
        char c13 = '\u0009';
        char c14 = '\u0008';

        System.out.print(c13 + "Hello World"); // tab
        System.out.println(c14); // Backspace

        System.out.println(" ----- ");
        // \u000d System.out.println("Hello world");
        System.out.println(" ----- ");

        /* \u000d System.out.println("HELLO WORLD"); */  // Will not work for Multiline comment

    }
}