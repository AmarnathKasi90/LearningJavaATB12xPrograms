package ex_30_Exceptions;

public class Lab239_Try_Catch_Multiple_IQ {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (Exception e){
            System.out.println("Exception");
        }
        // Not possible as Big Exception is used before
//        catch (ArithmeticException e){
//            System.out.println("ArithmeticException");
//        }
        System.out.println("2");




    }
}