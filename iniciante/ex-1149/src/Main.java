import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, n, soma = 0;

        a = scanner.nextInt();
        n = scanner.nextInt();

        while (n <= 0) {
            n = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            soma += a;
            a++;
        }
        System.out.println(soma);
        scanner.close();
    }
}