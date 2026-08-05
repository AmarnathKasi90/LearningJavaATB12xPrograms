package interviewJuly26;

public class IQ009_LeftTriangleStarPattern {
    public static void main(String[] args) {
        int num = 5;
        for(int i = 5; i>=1;i-- ){
            for(int j=i; j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
