package work.dynamicArray;


public class DynamicArray {

    private int[] array;
    private int size = 0;

    public DynamicArray() {
        array = new int[10];
    }

    public DynamicArray(int defaultLength) {
        array = new int[defaultLength];
    }

    public void add(int value) {
        if (size == array.length - 1) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] longArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            longArray[i] = array[i];
        }
        array = longArray;
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size) {
            return -1;
        }
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
