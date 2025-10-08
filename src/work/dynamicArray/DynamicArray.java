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
        } else {
            array[index] = value;
            System.out.println("Տվյալ " + index + "-ի արժեքը փոփոխվեց․ ");
        }
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println(index + " ինդեքսով էլեմենտ չկա մասիվում․ ");
        } else {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println(index + " ինդեքսով էլեմենտ չկա մասիվում․ ");
        } else {
            array[index] = value;
        }

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

    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {
        int indexByValue = -1;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                count++;
                if (count > 1) {
                    return indexByValue;
                }
                indexByValue = i;
            }
        }
        if (indexByValue < 0 || indexByValue > size) {
            return -1;
        } else {
            return indexByValue;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
