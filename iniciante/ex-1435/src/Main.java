import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;
        int n = scanner.nextInt();
        while (n != 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    x = i;
                    if (j < x) x = j;
                    if (n - i + 1 < x) x = n - i + 1;
                    if (n - j + 1 < x) x = n - j + 1;
                    System.out.printf("%3d", x);
                    if (j < n) System.out.print(" ");
                    else System.out.print("\n");
                }
            }
            System.out.print("\n");
            n = scanner.nextInt();
        }
    }
}