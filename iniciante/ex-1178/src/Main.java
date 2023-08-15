import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        double[] vet = new double[100];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = x;
            x = x / 2;
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println("N[" + i + "] = " + String.format("%.4f", vet[i]));
        }
        scanner.close();
    }
}