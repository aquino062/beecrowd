import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DecimalFormat formatador = new DecimalFormat("0.00000");
        Scanner scanner = new Scanner(System.in);

        double valor1 = scanner.nextDouble();
        double valor2 = scanner.nextDouble();

        valor1 *= 3.5;
        valor2 *= 7.5;

        double media = (valor1 + valor2) / 11;

        String mediaFormatada = formatador.format(media);

        System.out.println("MEDIA = " + mediaFormatada);

        scanner.close();
    }
}