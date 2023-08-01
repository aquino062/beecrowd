import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int soma;
        int cont;

        for (int i = 1; i <= n; i++) {
            soma = 0;
            cont = 0;

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for (; cont < y; x++) {

                if (x % 2 != 0) {
                    soma += x;
                    cont++;
                }
            }
            System.out.println(soma);
        }
            scanner.close();
    }
}