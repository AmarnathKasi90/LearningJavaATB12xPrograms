package ex_30_Exceptions;

public class Lab238_Try_Catch_Multiple {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println("2");




    }
}