public class Work2 {


    public static void main(String[] args) {

        int n = 5;

        System.out.println("Խնդիր 1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Խնդիր 2");
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Խնդիր 3");
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i - 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Խնդիր 4");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Խնդիր 5");
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n - 1 - i; s++) {
                System.out.print(" ");
            }
            for (int յ = 0; յ < i + 1; յ++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int յ = 0; յ < n - 1 - i; յ++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
