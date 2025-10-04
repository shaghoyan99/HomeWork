package work.dynamicArray;

import java.util.Arrays;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value){
        if (size == array.length-1){
            extend();
        }else {
            array[size++] = value;
        }
    }

    private void extend() {
        int [] longArray = new int[array.length+10];
        for (int i = 0; i <= size; i++) {
            longArray[i] = array[i];
        }
        array = longArray;
    }

    public int getByIndex(int index){
        for (int i = 0; i < size; i++) {
            if (index == array[i]){
                return array[i];
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
