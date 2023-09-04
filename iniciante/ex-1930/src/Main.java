import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] T = new int[4];
        int soma = 0;

        for (int i = 0; i < T.length; i++) {
            T[i] = scanner.nextInt();
        }

        for (int x : T) {
            soma += x;
        }

        System.out.println(soma - 3);
        scanner.close();
    }
}