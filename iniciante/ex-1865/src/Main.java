import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();


        for (int i = 0; i < c; i++) {
            String nickName = scanner.next();
            int n = scanner.nextInt();

            if (nickName.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
        scanner.close();

    }
}