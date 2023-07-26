import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        while (true) {
            x = scanner.nextInt();

            if (x == 0) {
                break;
            }
            for (int i = 1; i <= x; i++) {
                if (i == x) {
                    System.out.print(i + "\n");

                } else {
                    System.out.print(i + " ");
                }
            }
        }
        scanner.close();
    }
}