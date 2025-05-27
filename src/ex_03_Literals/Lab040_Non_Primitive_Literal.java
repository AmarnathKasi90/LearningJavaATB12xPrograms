
package ex_03_Literals;

public class Lab040_Non_Primitive_Literal {

    public static void main(String[] args) {

        // Primitive Data Type - Defined by Java Guys
        // Max, Min, Size defined

        byte b = 10; // 1 Byte -> 8 Bits
        int age = 65; // 4 Byte -> 32 Bits
        long l = 10l; // 8 Byte, 64 Bits

        // Non Primitive ( Defined by users) , Reference Data Types
        // No Size, max, min
        // Byte - 8 , Bits - 64

        String name = "Amar"; // String is bunch of char.
        int[] arrays_of_items = new int[10];
        System.out.println(arrays_of_items);
        System.out.println(arrays_of_items[6]);

        int[] newArray = {1,2,3,4,5};
        System.out.println(newArray[0]);
        System.out.println(newArray[1]);
        System.out.println(newArray[4]);
     //   System.out.println(newArray[5]); // java.lang.ArrayIndexOutOfBoundsException:
                                            // Index 5 out of bounds for length 5





    }
}
