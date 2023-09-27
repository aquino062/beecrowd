import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n, m;
        int[] notas = {2, 5, 10, 20, 50, 100};

        while (true) {

            n = scanner.nextInt();
            m = scanner.nextInt();

            if (n == 0 && m == 0) {
                break;
            }

            int troco = m - n;
            int contador = 0;

            for (int i = notas.length - 1; i >= 0; i--) {

                if (notas[i] <= troco) {
                    troco -= notas[i];
                    contador++;
                }
                if (troco == 0) {
                    break;
                }

            }
            if (contador == 2) {
                System.out.println("possible");
            } else {
                System.out.println("impossible");
            }

        }
        scanner.close();


    }
}