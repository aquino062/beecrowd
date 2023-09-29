
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();

        String palavra;
        double t;

        for (int i = 0; i < c; i++) {
            t = 0;
            palavra = scanner.next();
            for (int j = 0; j < palavra.length(); j++) {
                t += 0.01;
            }
            System.out.printf("%.2f\n", t);
        }
        scanner.close();

    }
}