
package ex_05_TypeCasting;

public class Lab067_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid - > Implicit Casting- Automatically
        int a1 = (int)b; // Explicit Casting - Widening( doesn't require)

        System.out.println(a1);
    }
}
