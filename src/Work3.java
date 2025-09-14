public class Work3 {

    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        System.out.print("1)");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("2)" + numbers[0]);
        System.out.println("3)" + numbers[8]);
        System.out.println("4)" + numbers.length);

        int min = 0;
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("5)" + min);
        System.out.println("6)" + max);

        int middle = 0;
        if (numbers.length <= 2) {
            System.out.println("7) Can't print middle values");
        }
        if (numbers.length > 2) {
            middle = (numbers.length - 1) / 2;
            System.out.println("7)" + numbers[middle]);
        }

        int couple = 0;
        System.out.print("8)");
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) == 0) {
                couple = numbers[i];
                System.out.print(couple + " ");
            }
        }
        System.out.println();

        int odd = 0;
        System.out.print("9)");
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) != 0) {
                odd = numbers[i];
                System.out.print(odd + " ");
            }
        }
        System.out.println();

        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        System.out.println("10)" + result);
        System.out.println("11)" + result / numbers.length);

    }
}
