package work.bracceChecker;

public class Stack {

    private char[] array = new char[10];
    private int size;

    public Stack() {
        size = -1;
    }

    public void push(char value) {
        if (size == array.length) {
            extend();
        }
        array[++size] = value;
    }

    private void extend() {
        char[] tmp = new char[array.length];
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
    }

    public char pop() {
        if (size < 0) {
            System.out.println("Stack is empty ");
            return 0;
        }
        return array[size--];
    }

    public int arraySize() {
        return size;
    }
}
