import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        nota1 *= 2;
        nota2 *= 3;
        nota3 *= 5;

        double media = (nota1 + nota2 + nota3) / 10;

        System.out.printf("MEDIA = %.1f\n", media);
        scanner.close();
    }
}