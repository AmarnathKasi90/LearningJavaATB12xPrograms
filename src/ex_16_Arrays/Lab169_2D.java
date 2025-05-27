package ex_16_Arrays;

import java.util.Arrays;

public class Lab169_2D {
    public static void main(String[] args) {

        int[][] oneLine_2D_Array = {{1, 2, 3}, {2, 5, 4}, {6, 5, 3}};

        int[][] multiLine_2D_Array = {
                {5, 6, 8},
                {1, 2, 4},
                {7, 4, 1}
        };

        int[][] array = new int[3][3];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 8;
        array[1][1] = 4;
        array[1][2] = 7;
        array[2][0] = 8;
        array[2][1] = 9;
        array[2][2] = 10;

        System.out.println(oneLine_2D_Array.length);
        System.out.println(multiLine_2D_Array.length);
        System.out.println(array.length);

        System.out.println("oneLine_2D_Array values are is ");
        print2DArray(oneLine_2D_Array);

        System.out.println("predefinedArray values are is ");
        print2DArray(multiLine_2D_Array);

        System.out.println("array values are is ");
        print2DArray(array);

    }

    private static void print2DArray(int[][] arr){

        for(int i=0;i< arr.length;i++)
        {
            System.out.print("[ ");

            for (int j=0;j< arr[i].length;j++){
                Arrays.sort(arr[i]);
                System.out.print(arr[i][j] + " ");
            }System.out.println("]");
           }

    }


}
