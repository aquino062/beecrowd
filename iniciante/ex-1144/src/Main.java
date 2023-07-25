import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int resultado;
        int j = 1;

        for (int i = 1; i <= n; i++) {

            resultado = j * j;
            System.out.print(j + " ");
            System.out.print(resultado + " ");
            System.out.println(resultado * j);

            System.out.print(j + " ");
            System.out.print(resultado + 1 + " ");
            System.out.println(resultado * j + 1);
            j += 1;

        }
        scanner.close();
    }
}