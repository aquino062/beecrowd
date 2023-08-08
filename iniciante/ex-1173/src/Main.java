import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = new int[10];
        int v = scanner.nextInt();

        for (int i = 0; i < n.length; i++) {
            n[i] = v;
            v += v;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "] = " + n[i]);
        }
        scanner.close();

    }
}