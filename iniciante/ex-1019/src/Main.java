import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoSegundosEvento = scanner.nextInt();

        int tempoHoras = (tempoSegundosEvento / 3600);
        int tempoMinutos = (tempoSegundosEvento % 3600) / 60;
        int segundos = tempoSegundosEvento % 60;
        System.out.println(tempoHoras + ":" + tempoMinutos + ":" + segundos);
        scanner.close();

    }
}


