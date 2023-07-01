import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double imposto = 0.0;

        if (salario <= 2000) {
            imposto = 0.0;
        } else if (salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
        } else if (salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + (1000 * 0.08);
        } else {
            imposto = (salario - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08);
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f\n", imposto);
        }
        scanner.close();
    }
}