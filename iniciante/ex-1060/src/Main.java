import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valores;
        int positivo = 0;

        for (int i = 1; i <= 6; i++) {
            valores = scanner.nextDouble();
            if (valores > 0) {
                positivo += 1;
            }
        }

        System.out.println(positivo + " valores positivos");
        scanner.close();

    }
}