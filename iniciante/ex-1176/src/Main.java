import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int a = 0,b = 1,c;

        for (int i = 0; i < t; i++) {

            int n = scanner.nextInt();

            System.out.print(a + " ");
           c = a + b;
           a = b;
           b = c;

        }
    }
}