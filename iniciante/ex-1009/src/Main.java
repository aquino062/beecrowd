import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeVendedor = scanner.next();
        double salarioFixo = scanner.nextFloat();
        double totalVendaMes = scanner.nextFloat();

        double salarioFinal = (totalVendaMes * 0.15) + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f", salarioFinal);
        scanner.close();


    }
}