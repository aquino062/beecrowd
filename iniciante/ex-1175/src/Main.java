import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet = new int[20];
        int aux;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = scanner.nextInt();
        }

        for (int i = 0; i < vet.length / 2; i++) {

            aux = vet[i];
            vet[i] = vet[vet.length - 1 - i];
            vet[vet.length - 1 - i] = aux;

        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println("N[" + i + "] = " + vet[i]);
        }
        scanner.close();

    }
}