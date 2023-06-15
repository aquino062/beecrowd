import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoProduto01 = scanner.nextInt();
        int unidadesProduto01 = scanner.nextInt();
        double precoProduto01 = scanner.nextDouble();

        int codigoProduto02 = scanner.nextInt();
        int unidadesProduto02 = scanner.nextInt();
        double precoProduto02 = scanner.nextDouble();


        double valorPagarProduto01 = precoProduto01 * unidadesProduto01;
        double valorPagarProduto02 = precoProduto02 * unidadesProduto02;

        double valorFinal = valorPagarProduto01 + valorPagarProduto02;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorFinal);
        scanner.close();

    }
}