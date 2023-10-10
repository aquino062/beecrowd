import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] rpm = new int[n];
        boolean queda = false;

        for (int i = 0; i < n; i++) {
            rpm[i] = scanner.nextInt();
        }


        for (int i = 1; i < rpm.length; i++) {
            if (rpm[i] < rpm[(i - 1)]) {
                System.out.println(i + 1);
                queda = true;
                break;

            }
        }

        if(!queda){
            System.out.println("0");
        }
    }

}
