package ex_04_Operators;

public class Lab058_Compound_Assignment_Arithmetic {
    public static void main(String[] args) {
        // Compound Assignment Operators
        //     // +=, -=, /=, *=
        int age = 10;
        age += 10;
        System.out.println(age);
        age /= 10;
        System.out.println(age);
        int b = age /10 ;
        age %= 10;
        System.out.println(b);
        System.out.println(age);

//         10 |2 |  0 - Quoinet
//           | 0 |
//           -------
//             2 - Remainder
//           ----





    }
}