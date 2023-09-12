import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long[] carneiros = new long[N];
        int[] sitio = new int[N];
        int ataques = 0;
        long numCarneiros = 0;

        for (int i = 0; i < N; i++) {
            carneiros[i] = scanner.nextLong();
        }

        int i = 0;

        do {
            if (carneiros[i] > 0) {
                carneiros[i]--;
                if (carneiros[i] % 2 == 0) {
                    sitio[i] = 1;
                    i++;
                } else {
                    sitio[i] = 1;
                    i--;
                }
            } else {
                break;
            }
        } while (i >= 0 && i < N);

        for (int j = 0; j < N; j++) {
            numCarneiros += carneiros[j];
            ataques += sitio[j];
        }
        System.out.println(ataques + " " + numCarneiros);
        scanner.close();
    }
}
