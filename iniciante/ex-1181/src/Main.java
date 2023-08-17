import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] m = new double[12][12];
        double soma = 0, media;

        int l = scanner.nextInt();

        char t = scanner.next().toUpperCase().charAt(0);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = scanner.nextDouble();
            }
        }

        for (int j = 0; j < m.length; j++) {
            soma += m[l][j];
        }

        if (t == 'S') {
            System.out.printf("%.1f%n", soma);
        } else if (t == 'M') {
            media = soma / m.length;
            System.out.printf("%.1f%n", media);
        }
        scanner.close();
    }
}