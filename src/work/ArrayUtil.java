package work;

import java.util.Arrays;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 15, 7, 52, -3, 8};

        System.out.println("Տպել մասիվի բոլոր էլեմենտները");
        System.out.print("Foreach - ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Arrays toString method - " + Arrays.toString(numbers));
        System.out.print("For - ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("Մասիվի առաջին էլեմենտը - " + numbers[0]);
        System.out.println("Մասիվի վերջին էլեմենտը - " + numbers[numbers.length - 1]);
        System.out.println("Մասիվի երկարությունը - " + numbers.length);

        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Մասիվի ամենափոքր էլեմենտը - " + min);
        System.out.println("Մասիվի ամենամեծ էլեմենտը - " + max);


        if (numbers.length < 2) {
            System.out.println("Մասիվը երկարությունը փոքր կամ հավասար է 2-ի ");
        } else if (numbers.length % 2 != 0) {
            System.out.println("Մասիվի էլեմենտների քանակը կենտ է․");
            System.out.println("Մասիվի մեջտեղի էլեմենտը - " + numbers[numbers.length / 2]);
        } else {
            System.out.println("Մասիվի էլեմենտների քանակը զույգ է․");
            System.out.println("Մասիվի մեջտեղի երկու էլեմենտները - " + numbers[numbers.length / 2 - 1] + " , " + numbers[numbers.length / 2]);
        }

        int couple = 0;
        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2) == 0) {
                couple++;
            } else {
                odd++;
            }
        }
        System.out.println("Մասիվում զույգ թվերի քանակը - " + couple);
        System.out.println("Մասիվում կենտ թվերի քանակը - " + odd);

        int result = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            result = result + numbers[i];
//        }
        for (int number : numbers) {
            result += number;
        }
        System.out.println("Մասիվի էլեմենտների գումարը - " + result);
        System.out.println("Մասիվի էլեմենտների միջին թվաբանականը - " + result / numbers.length);

    }
}
