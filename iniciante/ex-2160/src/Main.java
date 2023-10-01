import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String l = scanner.nextLine();

        if (l.length() > 80) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

        scanner.close();
    }
}