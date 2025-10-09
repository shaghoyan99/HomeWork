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
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println(index + " ինդեքսով էլեմենտ չկա մասիվում․ ");
            return;
        }
        if (size == array.length) {
            extend();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }


    public void deleteByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println(index + " ինդեքսով էլեմենտ չկա մասիվում․ ");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }


    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println(index + " ինդեքսով էլեմենտ չկա մասիվում․ ");
            return;
        }
        array[index] = value;
    }

    private void extend() {
        int[] longArray = new int[array.length + 10];
        System.arraycopy(array, 0, longArray, 0, array.length);
        array = longArray;
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size) {
            return -1;
        }
        return array[index];
    }

    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
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
