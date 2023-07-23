import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();


        if (x < y) {

            for (x += 1, y -= 1; x <= y; x++) {

                if (x % 5 == 2 || x % 5 == 3) {
                    System.out.println(x);
                }
            }
        } else {
            for (x -= 1, y += 1; y <= x; y++) {

                if (y % 5 == 2 || y % 5 == 3) {
                    System.out.println(y);
                }
            }
        }

        scanner.close();
    }
}