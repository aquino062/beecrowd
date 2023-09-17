import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            String jogador1 = scanner.next();
            String jogador2 = scanner.next();


            if (jogador1.equals("papel") && jogador2.equals("papel")) {
                System.out.println("Ambos venceram");
            } else if (jogador1.equals("pedra") && jogador2.equals("pedra")) {
                System.out.println("Sem ganhador");
            } else if (jogador1.equals("ataque") && jogador2.equals("ataque")) {
                System.out.println("Aniquilacao mutua");
            } else if (jogador1.equals("ataque") && jogador2.equals("pedra")) {
                System.out.println("Jogador 1 venceu");
            } else if (jogador1.equals("pedra") && jogador2.equals("papel")) {
                System.out.println("Jogador 1 venceu");
            } else if (jogador1.equals("ataque") && jogador2.equals("papel")) {
                System.out.println("Jogador 1 venceu");
            } else {
                System.out.println("Jogador 2 venceu");
            }

        }
        scanner.close();
    }
}