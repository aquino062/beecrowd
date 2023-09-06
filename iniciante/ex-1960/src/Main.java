import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String numeroRomano = "";

        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < valores.length; i++) {
            while (n >= valores[i]) {
                n -= valores[i];
                numeroRomano += simbolos[i];
            }
        }
        System.out.println(numeroRomano);
        scanner.close();

    }
}