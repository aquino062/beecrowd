import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c;

        if (a == b) {
            c = a;
        } else if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
        scanner.close();
    }
}