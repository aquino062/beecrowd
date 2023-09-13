
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numero = scanner.next();
        String novoNumero = "";


        for (int i = numero.length() - 1; i >= 0; i--) {
            novoNumero += numero.charAt(i);
        }

        System.out.println(novoNumero);
        scanner.close();
    }
}