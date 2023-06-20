import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int qntd = scanner.nextInt();
        double preco = 0, total;

        switch (codigo) {
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
            default:
                System.out.println("codigo invalido");
                break;
        }
        total = preco * qntd;

        System.out.printf("Total: R$ %.2f\n", total);
        scanner.close();

    }
}