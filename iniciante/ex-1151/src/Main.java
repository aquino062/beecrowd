import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a);

            if (i < n) {
                System.out.print(" ");
            } else {
                System.out.println();
            }

            int soma = a + b;
            a = b;
            b = soma;
        }
        scanner.close();
    }
}