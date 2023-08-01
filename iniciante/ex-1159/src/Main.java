import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int soma = 0;
            int cont = 0;

            int x = scanner.nextInt();

            if (x == 0) {
                break;
            } else {

                for (; cont < 5; x++) {

                    if (x % 2 == 0) {
                        soma += x;
                        cont++;
                    }
                }
                System.out.println(soma);
            }
        }
        scanner.close();
    }
}