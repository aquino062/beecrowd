import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] x = new int[n];

        int posicao = 0;

        for (int i = 0; i < x.length; i++) {
            x[i] = scanner.nextInt();
        }

        int i = 0;
        int menorValor = x[i];
        for (; i < x.length; i++) {

            if (x[i] < menorValor) {
                menorValor = x[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicao);
        scanner.close();
    }
}