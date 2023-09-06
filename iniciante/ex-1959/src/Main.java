import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextInt();
        long l = scanner.nextInt();

        long p = l * n;
        System.out.println(p);
        scanner.close();
    }
}