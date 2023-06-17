import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoViagemHoras = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();

        double distanciaPercorida = (velocidadeMedia * tempoViagemHoras);

        double litrosNecessarios = (distanciaPercorida / 12);

        System.out.printf("%.3f\n", litrosNecessarios);
        scanner.close();


    }
}