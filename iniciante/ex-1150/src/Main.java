import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int z, x;

        x = scanner.nextInt();
        z = scanner.nextInt();


        while (z <= x) {
            z = scanner.nextInt();
        }

        int soma = 0;
        int contador = 0;

        while (soma < z) {
            soma += x;
            contador++;
            x++;
        }

        System.out.println(contador);
        scanner.close();

    }
}