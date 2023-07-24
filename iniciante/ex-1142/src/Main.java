import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int j = 1;

        for (int i = 1; i <= n; i++) {
            for (int c = 1; c < 4; j += 1, c++) {
                System.out.print(j + " ");
            }
            System.out.println("PUM");
            j += 1;
        }
        scanner.close();
    }
}