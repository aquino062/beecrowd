import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l;

        while (scanner.hasNextInt()) {

            int nivel;
            int maiorValor = 0;

            l = scanner.nextInt();

            int[] vet = new int[l];

            for (int i = 0; i < vet.length; i++) {
                vet[i] = scanner.nextInt();
            }

            for (int i = 0; i < vet.length; i++) {
                if (vet[i] > maiorValor) {
                    maiorValor = vet[i];
                }
            }

            if (maiorValor < 10) {
                nivel = 1;
            } else if (maiorValor < 20) {
                nivel = 2;
            } else {
                nivel = 3;
            }
            System.out.println(nivel);

        }
            scanner.close();
    }
}