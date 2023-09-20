import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m2 = 0, m3 = 0, m4 = 0, m5 = 0;

        int n = scanner.nextInt();
        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            vet[i] = scanner.nextInt();
        }

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                m2++;
            }
        }
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 3 == 0) {
                m3++;
            }
        }
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 4 == 0) {
                m4++;
            }
        }
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 5 == 0) {
                m5++;
            }
        }

        System.out.println(m2 + " Multiplo(s) de 2");
        System.out.println(m3 + " Multiplo(s) de 3");
        System.out.println(m4 + " Multiplo(s) de 4");
        System.out.println(m5 + " Multiplo(s) de 5");
        scanner.close();
    }
}