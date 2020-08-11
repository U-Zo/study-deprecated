public class Main {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            if (i <= n / 2) {
                for (int j = 1; j <= (n - (i * 2 - 1)) / 2; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= (n - (2 * (n - i) + 1)) / 2; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
