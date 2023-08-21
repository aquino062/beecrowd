import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] m = new double[12][12];

        char o = scanner.next().toUpperCase().charAt(0);
        double soma = 0, media;
        int cont = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = scanner.nextDouble();

            }
        }


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i + j >= m.length) {
                    soma += m[i][j];
                    cont++;
                }

            }
        }


        media = soma / cont;

        if (o == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (o == 'M') {
            System.out.printf("%.1f\n", media);

        }
        scanner.close();

    }
}