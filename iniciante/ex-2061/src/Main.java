import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String acao;

        for (int i = 0; i < m; i++) {
            acao = scanner.next();
            if (acao.equals("fechou")) {
                n += 1;
            } else {
                n -= 1;
            }
        }
        scanner.close();

        System.out.println(n);
    }
}