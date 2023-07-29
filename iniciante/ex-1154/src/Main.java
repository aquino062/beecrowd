import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0, contador = 0;

        while (true) {
            int idade = scanner.nextInt();

            if (idade >= 0) {
                soma += idade;
                contador++;
            } else {
                break;
            }
        }
        double media = ((double) soma / contador);

        System.out.printf("%.2f\n",media);
        scanner.close();
    }
}