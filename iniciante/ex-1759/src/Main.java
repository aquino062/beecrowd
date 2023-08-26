import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.println("Ho!");
            } else {
                System.out.print("Ho ");

            }
        }
        scanner.close();

    }
}