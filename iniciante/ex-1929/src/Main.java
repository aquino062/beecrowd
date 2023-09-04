import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet = new int[4];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = scanner.nextInt();
        }

        Arrays.sort(vet);

        if (vet[0] + vet[1] > vet[2] || vet[1] + vet[2] > vet[3]) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
        scanner.close();
    }
}