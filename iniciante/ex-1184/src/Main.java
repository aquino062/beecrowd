import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] m = new double[12][12];

        char o = scanner.next().toUpperCase().charAt(0);

        double soma = 0, media;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = scanner.nextDouble();
            }
        }
/*
        for (int i = 0; i < m.length; i++) {
            System.out.println();
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j]+ " ");
            }
        }*/

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (j < i) {
                    soma += m[i][j];
                }
            }
        }

        media = soma / 66;
        if (o == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (o == 'M') {
            System.out.printf("%.1f\n", media);
        }

    }
}