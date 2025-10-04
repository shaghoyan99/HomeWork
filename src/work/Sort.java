package work;

import java.util.Arrays;

public class Sort {

    public static void main(String[] ars) {

        int[] array = {4, 71, 3, 9, 0, 2};
        System.out.println(Arrays.toString(array));

        int temp;
        int count;
        do {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);
        System.out.println(Arrays.toString(array));
    }
}
