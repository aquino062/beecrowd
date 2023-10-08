import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean padraEncontrado = false;

        int[][] array = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                if (array[i][j] == 42 &&
                        array[i][j + 1] == 7 &&
                        array[i][j - 1] == 7 &&
                        array[i - 1][j - 1] == 7 &&
                        array[i - 1][j] == 7 &&
                        array[i - 1][j + 1] == 7 &&
                        array[i + 1][j - 1] == 7 &&
                        array[i + 1][j] == 7 &&
                        array[i + 1][j + 1] == 7) {

                    padraEncontrado = true;
                    System.out.println((i + 1) + " " + (j + 1));
                    break;
                }
            }
        }
        if (!padraEncontrado) {
            System.out.println("0 0");
        }
        scanner.close();
    }
}
