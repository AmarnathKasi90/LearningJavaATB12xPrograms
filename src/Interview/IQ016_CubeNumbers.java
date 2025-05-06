package Interview;

public class IQ016_CubeNumbers {
    public static void main(String[] args) {
        int limit = 10;
        System.out.println("Cubes of number 1 to " + limit + ":");

        for(int i=1; i<=limit;i++){
            int cube = i * i * i;
            System.out.println("cube of " + i +": " +cube);
        }
    }
}
