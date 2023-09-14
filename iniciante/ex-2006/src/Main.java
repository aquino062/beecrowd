import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int contador = 0;

        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        for (int aux : array) {
            if (aux == t) {
                contador++;
            }
        }

        System.out.println(contador);
        scanner.close();
    }
}