package ex_11_While;

public class Lab126_While {
    public static void main(String[] args) {
        int i = 0; // Init
        while (i < 10) { // Condition (must be true to enter the loop)
//            System.out.println("Start the program");
            System.out.println(i);
            i++; // Updation
        }
        System.out.println("----------");
        //  I, C, U
        for (int j = 0; j < 10 ; j++) {
            System.out.println(j);
        }
    }
}