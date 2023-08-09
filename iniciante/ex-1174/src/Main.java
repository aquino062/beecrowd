import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vet = new double[100];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = scanner.nextDouble();

        }

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] <= 10) {
                System.out.printf("A[" + i + "] = %.1f\n" , vet[i]);

            }
        }
        scanner.close();
    }
}