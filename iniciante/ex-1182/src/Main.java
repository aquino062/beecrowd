import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] m = new double[12][12];

        int c = scanner.nextInt();
        char t = scanner.next().toUpperCase().charAt(0);
        double soma = 0.0, media;


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = scanner.nextDouble();

            }
        }

        for (int i = 0; i < m.length; i++) {
            soma += m[i][c];
        }

        media = soma / m.length;
        if (t == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (t == 'M') {
            System.out.printf("%.1f\n", media);
        }
        scanner.close();

    }
}