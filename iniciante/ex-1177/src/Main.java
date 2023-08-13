import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet = new int[1000];

        int t = scanner.nextInt();

        int contador = 0;

        for (int i = 0; i < vet.length; i++) {
            if (contador <= (t - 1)) {
                vet[i] = contador;
                contador++;

            } else {
                contador = 0;
                vet[i] = contador;
                contador++;
            }
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println("N[" + i + "] = " + vet[i]);
        }
        scanner.close();
    }
}