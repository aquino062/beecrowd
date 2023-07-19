import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0, m, n;


        while (true) {
            m = scanner.nextInt();
            n = scanner.nextInt();

            if (m <= 0 || n <= 0) {
                break;
            }
            if (m < n) {
                for (; m <= n; m++) {
                    System.out.print(m + " ");
                    soma += m;
                }
            } else {
                for (; n <= m; n++) {
                    System.out.print(n + " ");
                    soma += n;
                }
            }
            System.out.println("Sum=" + soma);
            soma = 0;

        }

        scanner.close();

    }
}