import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int temp = 0;

        while (contador < 3) {
            String input = scanner.nextLine();

            temp += calcularValor(input);

            if (input.equals("caw caw")) {
                System.out.println(temp);
                temp = 0;
                contador++;
            }
        }
        scanner.close();
    }

    private static int calcularValor(String input) {
        int valor = 0;
        if (input.charAt(0) == '*') {
            valor += 4;
        }
        if (input.charAt(1) == '*') {
            valor += 2;
        }
        if (input.charAt(2) == '*') {
            valor += 1;
        }

        return valor;
    }
}