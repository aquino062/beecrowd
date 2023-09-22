import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;


        while (scanner.hasNext()) {

            String N1 = scanner.next();
            String N2 = scanner.next();
            int qntdSubSequencias = 0;
            int posicao = -1;



            for (int i = 0; i <= N2.length() - N1.length(); i++) {
                if (N1.equals(N2.substring(i, i + N1.length()))) {
                    qntdSubSequencias++;
                    posicao = i + 1;
                }
            }
            System.out.println("Caso #" + contador + ":");

            if (qntdSubSequencias > 0) {
                System.out.println("Qtd.Subsequencias: " + qntdSubSequencias);
                System.out.println("Pos: " + posicao);
                System.out.println();
            } else {
                System.out.println("Nao existe subsequencia");
                System.out.println();
            }

            contador++;
        }

        scanner.close();

    }
}
