import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            int x = scanner.nextInt();
            int divisores = 0;

            for (int j = 1; j <= x; j++) {
                if (x % j == 0) {
                    divisores++;
                }
            }

            if (divisores > 2) {
                System.out.println(x + " nao eh primo");


            } else {
                System.out.println(x + " eh primo");
            }

        }
        scanner.close();
    }
}