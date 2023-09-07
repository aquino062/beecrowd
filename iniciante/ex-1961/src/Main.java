import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p = scanner.nextInt();
        int n = scanner.nextInt();
        int diferenca;
        boolean condicao = true;

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }

        for (int i = 0; i < array.length - 1; i++) {
            diferenca = Math.abs(array[i] - array[i + 1]);

            if (diferenca > p) {
                System.out.println("GAME OVER");
                condicao = false;
                break;
            }

        }
        if (condicao) {
            System.out.println("YOU WIN");
        }
        scanner.close();

    }
}