import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int somaImpar = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();


            if (x < y) {
                x += 1;
                for (int j; x < y; x++) {

                    if (x % 2 != 0) {
                        somaImpar += x;
                    }
                }
                System.out.println(somaImpar);
                somaImpar = 0;

            } else {
                y += 1;
                for (int j; y < x; y++) {

                    if (y % 2 != 0) {
                        somaImpar += y;
                    }
                }
                System.out.println(somaImpar);
                somaImpar = 0;

            }

        }
        scanner.close();
    }
}