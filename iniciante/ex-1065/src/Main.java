import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valores, pares = 0;

        for (int i = 0; i <= 4; i++) {
            valores = scanner.nextInt();

            if (valores % 2 == 0) {
                pares += 1;
            }
        }
        System.out.println(pares + " valores pares");
        scanner.close();
    }
}