import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();


        for (int i = 0; i < t; i++) {
            String escolhaSheldon = scanner.next();
            String escolhaRaj = scanner.next();

            String vencedor = null;
            boolean empate = false;

            if (escolhaSheldon.equals(escolhaRaj)) {
                empate = true;
            } else {
                if (escolhaSheldon.equals("tesoura") && escolhaRaj.equals("papel")) {
                    vencedor = escolhaSheldon;
                } else if (escolhaSheldon.equals("papel") && escolhaRaj.equals("pedra")) {
                    vencedor = escolhaSheldon;
                } else if (escolhaSheldon.equals("pedra") && escolhaRaj.equals("lagarto")) {
                    vencedor = escolhaSheldon;
                } else if (escolhaSheldon.equals("lagarto") && escolhaRaj.equals("Spock")) {
                    vencedor = escolhaSheldon;
                } else if (escolhaSheldon.equals("Spock") && escolhaRaj.equals("tesoura")) {
                    vencedor = escolhaSheldon;
                } else if (escolhaSheldon.equals("tesoura") && escolhaRaj.equals("lagarto")) {
                    vencedor = escolhaSheldon;
                } else if (escolhaSheldon.equals("lagarto") && escolhaRaj.equals("papel")) {
                    vencedor = escolhaSheldon;
                } else if (escolhaSheldon.equals("papel") && escolhaRaj.equals("Spock")) {
                    vencedor = escolhaSheldon;
                } else if (escolhaSheldon.equals("Spock") && escolhaRaj.equals("pedra")) {
                    vencedor = escolhaSheldon;
                } else if (escolhaSheldon.equals("pedra") && escolhaRaj.equals("tesoura")) {
                    vencedor = escolhaSheldon;
                } else {
                    vencedor = escolhaRaj;
                }

            }


            System.out.print("Caso #" + (i + 1) + ": ");


            if (vencedor != null) {
                if (vencedor.equals(escolhaSheldon)) {
                    System.out.println("Bazinga!");
                }
                if (vencedor.equals(escolhaRaj)) {
                    System.out.println("Raj trapaceou!");
                }
            }
            if (empate) {
                System.out.println("De novo!");
            }

        }
        scanner.close();
    }
}