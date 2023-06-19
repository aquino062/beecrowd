import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double delta, x1, x2;

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();


        delta = (b * b) - (4 * a) * (c);

        if (a != 0 && delta >= 0) {

            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);


        } else { //caso haja uma divisão por 0 ou raiz de numero negativo cai nesse else.
            System.out.println("Impossivel calcular");
        }

        scanner.close();

    }
}