import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        while (true) {

            a = scanner.nextInt();
            if (a == 0) {
                break;
            }
            b = scanner.nextInt();
            c = scanner.nextInt();

            int area = a * b;

            int tamanhoTerreno = (int) Math.sqrt((double) (area * 100) / c);
            // ou raiz quadrada de (Área da casa / (C / 100))

            System.out.println(tamanhoTerreno);
            scanner.close();

        }
    }
}