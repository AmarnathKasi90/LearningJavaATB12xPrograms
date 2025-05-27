package ex_09_Switch;

public class Lab101_Interview {
    public static void main(String[] args) {
        long a11 = 30l;
        int b = (int) a11;
        System.out.println(b);
        switch ((int) a11) {
            case 1 : System.out.println("case1"); break;
            case 30 :System.out.println("Type Casting is Working");
            default : System.out.println("Explicit Type Casting");

        }
    }
}