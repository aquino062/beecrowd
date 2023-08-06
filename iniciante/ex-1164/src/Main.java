import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int soma;

        for (int i = 0; i < n; i++) {

            int x = scanner.nextInt();

            soma = 0;
            for (int j = 1; j < x; j++) {
                if (x % j == 0) {
                    soma += j;
                }
            }
            if (soma == x) {
                System.out.println(x + " eh perfeito");
            } else {
                System.out.println(x + " nao eh perfeito");
            }
        }
        scanner.close();
    }
}