package ex_16_Arrays;

import java.util.Arrays;

public class Lab170_JaggedArrays {
    public static void main(String[] args) {
        // Java allows jagged arrays where each row can have a different length
        int[][] jaggedArray = {
                {4, 6, 3},
                {9, 3, 6, 9},
                {7}
        };
        System.out.println("jaggedArray: ");
        print2DjaggedArray(jaggedArray);
      }

    public static void print2DjaggedArray(int[][] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print("[ ");
            for (int j= 0; j < arr[i].length; j++){
                Arrays.sort(arr[i]);
                System.out.print(arr[i][j] + " ");
        }
            System.out.println("]");
        }
    }
}