import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p = scanner.nextInt();//quantidade de produtos

        double total = 0;
        double valor = 0;

        String produto;

        for (int i = 0; i < p; i++) {
            produto = scanner.next();
            switch (produto) {
                case "1001":
                    valor = 1.50;
                    break;
                case "1002":
                    valor = 2.50;
                    break;
                case "1003":
                    valor = 3.50;
                    break;
                case "1004":
                    valor = 4.50;
                    break;
                case "1005":
                    valor = 5.50;
                    break;

            }
            int qntd = scanner.nextInt();
            total += valor * qntd;

        }
        System.out.printf("%.2f\n", total);
        scanner.close();
    }
}