import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        //ordem crescente
        if (x < y) {
            for (; x <= y; x++) {
                if (x % 13 != 0) {
                    soma += x;
                }
            }
            System.out.println(soma);
        } else {
            for (; y <= x; y++) {
                if (y % 13 != 0) {
                    soma += y;
                }
            }
            System.out.println(soma);
        }
        scanner.close();
    }
}