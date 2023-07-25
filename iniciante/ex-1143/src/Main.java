import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int resultado = 0;

        int j = 1;
        for (int i = 1; i <= n; i++) {
            resultado = j * j; //ao quadrado

            System.out.print(j + " ");
            System.out.print(resultado + " ");
            System.out.println(resultado * j); // ao cubo
            j += 1;
        }
        scanner.close();
    }
}