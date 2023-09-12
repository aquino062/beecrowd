import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] matricula = new int[n];
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            matricula[i] = scanner.nextInt();
            notas[i] = scanner.nextDouble();

        }
        int i = 0;
        double maior = notas[i];
        int matric = matricula[i];
        for (; i < n - 1; i++) {
            if (notas[i + 1] > maior) {
                maior = notas[i + 1];
                matric = matricula[i + 1];
            }
        }
        if (maior >= 8) {
            System.out.println(matric);
        } else {
            System.out.println("Minimum note not reached");
        }

    }
}