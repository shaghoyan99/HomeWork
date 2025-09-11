public class Work2 {


    public static void main(String[] args) {


        System.out.println("Խնդիր 1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Խնդիր 2");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Խնդիր 3");
        for (int i = 5; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Խնդիր 4");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Խնդիր 5");
        for (int i = 5; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
