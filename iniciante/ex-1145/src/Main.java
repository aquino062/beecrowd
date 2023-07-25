import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int contador = 0;

        for (int i = 1; i <= y; i++) {
            System.out.print(i);
            contador++;

            if (contador < x && i < y) {
                System.out.print(" ");

            }else{
                System.out.println();
                contador = 0;
            }
        }
        scanner.close();
    }
}