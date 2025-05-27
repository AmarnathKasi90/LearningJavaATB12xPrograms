package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab153_String_Functions {
    public static void main(String[] args) {
        String name = "Amarnath";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10)); // StringIndexOutOfBoundsException

        // 2. concat()
        System.out.println(name.concat(" Kasi"));

        // 3. contains()
        System.out.println(name.contains("th"));

        // 4. equals()
        System.out.println(name.equals("Amarnath"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("amarnath"));

        // 6. indexOf() //  Amarnath -> ?
        System.out.println(name.indexOf('t'));
        System.out.println(name.indexOf('a'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));

        // 9. split()

        String name4 = "amar@live.com@123";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        // 10. substring( , )
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("AMARNATH".toLowerCase());

        // 12. toUpperCase()
        System.out.println("amarnath".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("A"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 16. trim()
        String name3 = "    Amarnath Kasi     ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Amarnath"));
        System.out.println(name.compareTo("Amarnatha"));
        System.out.println(name.compareTo("Amarnadh"));
        System.out.println("Amarnaeh".compareTo("Amarnadh"));

        System.out.println("--------------");
        StringBuilder stringBuilder = new StringBuilder("Amarnath");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());


        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);


        String s11 = "Amarnath";
        String s21 = s11.concat(" Kasi");
        System.out.println(s21);

//        Concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);



        String n = "Amarnath Kasi";
        System.out.println(n.indexOf("a"));
        System.out.println(n.lastIndexOf("t"));
        System.out.println(n.lastIndexOf("a"));






    }
}