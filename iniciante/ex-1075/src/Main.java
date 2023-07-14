import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i <= 10000; i++) {
            if (i % n == 2) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}