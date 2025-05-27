package ex_16_Arrays;

public class Lab175_Left_Triangle_2D {
    public static void main(String[] args) {
        int n = 3;
    for(int i=n; i>0;i--){
        for (int j=n;j>n-i;j--){
            System.out.print("*");
        }
        System.out.println();
    }

    }}