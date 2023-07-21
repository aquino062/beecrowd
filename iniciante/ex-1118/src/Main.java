import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int x = 0;
        while (x < 2) {

            double nota1, nota2;
            while (true) {
                x = 0;

                nota1 = scanner.nextDouble();

                if (nota1 >= 0 && nota1 <= 10) {
                    break;
                } else {
                    System.out.println("nota invalida");
                }

            }

            while (true) {
                nota2 = scanner.nextDouble();
                if (nota2 >= 0 && nota2 <= 10) {
                    double media = (nota1 + nota2) / 2;
                    System.out.printf("media = %.2f\n", media);

                    while (x < 1 || x > 2) {
                        System.out.println("novo calculo (1-sim 2-nao)");
                        x = scanner.nextInt();
                    }
                    if (x == 2) {
                        break;
                    }

                    break;

                } else {
                    System.out.println("nota invalida");
                }
            }
        }
        scanner.close();
    }
}
