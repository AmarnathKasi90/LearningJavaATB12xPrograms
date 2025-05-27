package Task;

public class Task001_ReverseNumber {
    public static void main(String[] args) {
        String number = "12345";
       String reversed ="";

        for(int i=number.length()-1; i>=0;i--){
            reversed = reversed + number.charAt(i);
                        }
        System.out.println(reversed);

    }
}
