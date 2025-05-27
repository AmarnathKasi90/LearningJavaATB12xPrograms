package Task;

public class Task004_PrimeNumber {
    public static void main(String[] args) {
       int input = 29;

       for(int i = 2; i< 100;i++){
           if (isprime(i)){
               System.out.println(i + " is the prime Number");
           }
       }
      if(isprime(input)){
          System.out.println(input + " is Prime Number");
      }
      else {
          System.out.println(input + " is not prime number");
      }
    }

    private static boolean isprime(int input) {
        if(input <=1)
        {

            return false;
        }
        if(input%2==0 || input %3 ==0){
            return false;
        }

        for(int i=5;  i * i<=input ; i+=6){
            if(input %i == 0 && input % (i+2)==0) {
                return false;
            }
        }
        return true;
    }
}
