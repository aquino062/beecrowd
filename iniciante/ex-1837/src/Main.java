import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int r = a % b;


        if (r < 0) {
            r += Math.abs(b);
        }

        int q = (a - r) / b;

        System.out.print(q + " " + r + "\n");
    }
}