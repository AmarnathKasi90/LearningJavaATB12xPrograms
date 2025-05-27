package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab154_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {

        // String - 90%
        String s0 = "Amarnath";
        String s1 = new String("Amarnath");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Amarnath");
        StringBuilder stringBuilder = new StringBuilder("Amarnath");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);





    }
}