package work;

public class HomeWork1 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int n = 3;

        System.out.println("Խնդիր 1");

        if (x < y) {
            System.out.println("X-ը փոքր է Y-ից");
        }

        x = 30;

        if (x > y) {
            System.out.println("X-ը մեծ է Y-ից");
        }

        System.out.println("Խնդիր 2");

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("Խնդիր 3");
        System.out.println("x + y = " + (x + y));

        System.out.println("Խնդիր 4");

        for (int a = 1; a < 11; a++) {
            System.out.println(n + " * " + a + " = " + (n * a));
        }

    }
}
