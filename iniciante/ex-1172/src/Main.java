import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();

        }


        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] <= 0) {
                vetor[i] = 1;
            }
            System.out.println("X[" + i + "] = " + vetor[i]);
        }
        scanner.close();

    }
}