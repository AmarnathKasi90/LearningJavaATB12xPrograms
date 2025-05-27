
package ex_05_TypeCasting;

public class Lab069_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no; // implicit ?
        short s = (short) phone_no; // Explicit Casting - Narrowing
        // Data Loss.
        System.out.println(s);
    }
}
