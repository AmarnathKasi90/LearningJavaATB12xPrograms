package ex_16_Arrays;

public class Lab163_Arrays_Max_Min {
    public static void main(String[] args) {

        int[] array = new int[8];
        array[0] = 21;
        array[1] = 41;
        array[2] = 51;
        array[3] = 61;
        array[4] = 121;
        array[5] = 81;
        array[6] = 591;
        array[7] = 613;

        int min_value = give_min(array);
        int max_value = give_max(array);

        System.out.println(min_value);
        System.out.println(max_value);

    }

    public static int give_min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int give_max(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max  ) {
                max = array[i];
            }
        }
        return max;
    }
}
