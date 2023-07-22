import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int grenais = 0, vitoriaInter = 0, vitoriaGremio = 0, empate  = 0, golInter, golGremio, resposta;


        do {

            golInter = scanner.nextInt();
            golGremio = scanner.nextInt();

            grenais += 1;

            if (golInter == golGremio) {
                empate += 1;
            } else if (golInter > golGremio) {
                vitoriaInter += 1;
            } else {
                vitoriaGremio += 1;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            resposta = scanner.nextInt();


        } while (resposta != 2);

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vitoriaInter);
        System.out.println("Gremio:" + vitoriaGremio);
        System.out.println("Empates:" + empate);

        if (vitoriaInter == vitoriaGremio) {
            System.out.println("Nao houve vencedor");
        } else if (vitoriaInter > vitoriaGremio) {
            System.out.println("Inter venceu mais");
        } else {
            System.out.println("Gremio venceu mais");
        }
        scanner.close();

    }
}