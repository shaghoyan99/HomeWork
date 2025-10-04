package work.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        for (int i = 1; i < 15; i++) {
            dynamicArray.add(i);
        }
        dynamicArray.print();
        System.out.println(dynamicArray.getByIndex(7));
        System.out.println(dynamicArray.getByIndex(15));


    }
}
