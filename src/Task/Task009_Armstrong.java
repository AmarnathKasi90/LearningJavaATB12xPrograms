package Task;

public class Task009_Armstrong
{
    public static void main(String[] args) {
        //int number = 9474;
        for(int number = 0; number<=10000; number++)
        isArmstrong(number);


    }
    static double  isArmstrong(int number){
        int original_number = number;

        int n = 0;
        int temp = number;
        while (temp != 0) {
            temp = temp / 10;
            n++;
        }

        temp = number;
        double result = 0;
        while (temp != 0) {
            double digit = temp % 10;
            result = result + Math.pow(digit, n);
            temp = temp / 10;
        }

        if (result == original_number) {
            System.out.println(original_number + " Armstrong");
            return result;
        }
return -1;
    }

}
