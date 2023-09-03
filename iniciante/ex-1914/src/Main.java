import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qt = scanner.nextInt();

        for (int i = 0; i < qt; i++) {

            String nome01 = scanner.next();
            String escolha01 = scanner.next();
            String nome02 = scanner.next();
            String escolha02 = scanner.next();

            int numero01 = scanner.nextInt();
            int numero2 = scanner.nextInt();

            int soma = numero01 + numero2;

            if (soma % 2 == 0) {
                if (escolha01.equals("PAR")) {
                    System.out.println(nome01);
                } else {
                    System.out.println(nome02);
                }
            } else {
                if (escolha01.equals("IMPAR")) {
                    System.out.println(nome01);
                } else {
                    System.out.println(nome02);
                }
            }
        }
        scanner.close();
    }
}