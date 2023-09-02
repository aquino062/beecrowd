import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();
        int contador = 0;

        for (int i = 0; i < c; i++) {
            int n = scanner.nextInt();

            for (int j = 0; j < n; j++) {
                contador++;
            }

            if (contador % 2 == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
            contador = 0;
        }
        scanner.close();
    }
}