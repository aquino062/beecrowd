import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();

        int result = s + t + f;

        if (result == 24) {
            result = 0;
        } else if (result > 24) {
            result %= 24;
        } else if (result < 0) {
            result += 24;
        }
        System.out.println(result);

    }
}