import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caso = 1;

        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int totalNumeros = 1;
            StringBuilder sequencia = new StringBuilder("0 ");

            for (int i = 0; i <= N; i++) {
                totalNumeros += i;
                for (int j = 0; j < i; j++) {
                    sequencia.append(i).append(" ");
                }
            }

            String plural;

            if (totalNumeros == 1) {
                plural = "numero";
            } else {
                plural = "numeros";
            }

            System.out.println("Caso " + caso + ": " + totalNumeros + " " + plural);
            System.out.println(sequencia.toString().trim() + "\n");
            caso++;
        }
        scanner.close();
    }
}
