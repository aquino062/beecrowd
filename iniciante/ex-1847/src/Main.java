import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int diferencaAB = a - b;
        int diferencaBC = b - c;

        if (diferencaAB < 0) {
            diferencaAB = Math.abs(diferencaAB);
        }

        if (diferencaBC < 0) {
            diferencaBC = Math.abs(diferencaBC);
        }

        if (a > b && b <= c) {
            System.out.println(":)");
        } else if (a < b && b >= c) {
            System.out.println(":(");
        } else if (a < b && b < c
                && diferencaBC < diferencaAB) {
            System.out.println(":(");
        } else if (a < b && b < c
                && diferencaBC >= diferencaAB) {
            System.out.println(":)");
        } else if (a > b && b > c
                && diferencaBC < diferencaAB) {//
            System.out.println(":)");
        } else if (a > b && b > c
                && diferencaBC >= diferencaAB) {
            System.out.println(":(");
        } else if (a == b && b < c) {
            System.out.println(":)");
        } else if (a == b && b >= c) {
            System.out.println(":(");
        }
    }
}