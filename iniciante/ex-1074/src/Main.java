import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int valor;

        for (int i = 0; i < n; i++) {
            valor = scanner.nextInt();
            if (valor == 0) {
                System.out.println("NULL");
            }
            if (valor < 0) {
                if (valor % 2 == 0) {
                    System.out.println("EVEN NEGATIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }

            if (valor > 0) {
                if (valor % 2 == 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("ODD POSITIVE");
                }
            }
        }
        scanner.close();
    }
}