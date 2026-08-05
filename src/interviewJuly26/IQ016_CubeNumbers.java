package interviewJuly26;

public class IQ016_CubeNumbers {
    public static void main(String[] args) {
       int num = 10;

        for(int i = 1; i<=num ; i++){
           int cube = i * i * i;
            System.out.println("cube of "+  i +": "+ cube);
        }

    }
}
