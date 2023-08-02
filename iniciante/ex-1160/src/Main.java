import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int cont;
        for (int i = 1; i <= t; i++) {

            cont = 0;
            int pa = scanner.nextInt();
            int pb = scanner.nextInt();
            double g1 = scanner.nextDouble();
            double g2 = scanner.nextDouble();

            for (; pa <= pb; ) {
                pa += (pa * (g1 / 100));
                pb += (pb * (g2 / 100));
                cont++;
                if (cont > 100) {
                    break;
                }
            }
            if (cont > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(cont + " anos.");
            }
        }
        scanner.close();
    }
}