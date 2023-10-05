import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int resultado = 1;

        int[] alturas = new int[n];

        for (int i = 0; i < n; i++) {
            alturas[i] = scanner.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if (alturas[i] > alturas[i - 1]) {
                // é um pico
                if (i > 1 && alturas[i] == alturas[i - 1]) {
                    resultado = 0;
                    break;
                }
            } else if (alturas[i] < alturas[i - 1]) {
                // é um vale
                if (i > 1 && alturas[i] == alturas[i - 1]) {
                    resultado = 0;
                    break;
                }
            } else {
                // medida atual é igual a anterior
                resultado = 0;
                break;
            }
        }

        System.out.println(resultado);


    }
}