package work;

import java.util.Arrays;

public class ArrayHomework {
    public static void main(String[] args) {

        int[] numbers = {5, 88, 74, 954, 88, 6, 5, 74, 6, 84, 5, 3, 10, 10, 10, 10};
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};

        System.out.println("Խնդիր 1");
        int n = 6;
        int nCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                nCount++;
            }
        }
        if (nCount == 0) {
            System.out.println(n + "թիվը չկա մասիվում");
        } else {
            System.out.println(n + " թիվից մացիվում կա " + nCount + " հատ");
        }

        System.out.println("Խնդիր 2");

        int firstValue = 0;
        int lastValue = 0;

        for (int i = 0; i < numbers.length / 2; i++) {
            firstValue = numbers[i];
            lastValue = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = firstValue;
            numbers[i] = lastValue;
        }
        System.out.println("Մասիվի արժեքների հակառակ դասավորվածությունը \n" + Arrays.toString(numbers));

        System.out.println("Խնդիր 3");

        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (numbers[k] == numbers[i]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (!alreadyCounted) {
                for (int j = 1 + i; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println("Մասիվում կրկնվող արժեքներները " + count + "-ն են");

        System.out.println("Խնդիր 4");

        char[] vowel = {'ա', 'ե', 'է', 'ի', 'ո', ('ո' + 'ւ'), 'և', 'օ',};
        int too = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (chars[i] == vowel[j]) {
                    too++;
                }
            }
        }
        System.out.println("Մասիվի մեջ կա " + too + " ձայնավոր");

    }
}
