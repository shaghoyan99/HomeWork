package work.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        boolean resultValue;
        int indexByValue;
        dynamicArray.add(5);
        dynamicArray.add(9);
        dynamicArray.add(8);
        dynamicArray.add(78);
        dynamicArray.add(7);
        dynamicArray.add(7);
        dynamicArray.print();
        dynamicArray.deleteByIndex(0);
        dynamicArray.print();
        dynamicArray.set(1,1);
        System.out.println(dynamicArray.getByIndex(4));
        resultValue = dynamicArray.exists(7);
        System.out.println(resultValue);

        indexByValue = dynamicArray.getIndexByValue(7);
        System.out.println(indexByValue);
        dynamicArray.print();


    }
}
