import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal, resultado;
        int total01, total02, minutosdeumdia24hrs = 24 * 60;


        horaInicial = scanner.nextInt();
        minutoInicial = scanner.nextInt();
        horaFinal = scanner.nextInt();
        minutoFinal = scanner.nextInt();


        //converti as horas em minutos e armazena os minutos totais do inicio e do fim.
        total01 = (horaInicial * 60) + minutoInicial;
        total02 = (horaFinal * 60) + minutoFinal;

        if (total02 > total01) {
            resultado = total02 - total01;
            System.out.println("O JOGO DUROU " + (resultado / 60) + " HORA(S) E " + (resultado % 60) + " MINUTO(S)");
        } else if (total01 > total02) {
            resultado = (minutosdeumdia24hrs - total01) + total02;
            System.out.println("O JOGO DUROU " + (resultado / 60) + " HORA(S) E " + (resultado % 60) + " MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU " + 24 + " HORA(S) E " + 0 + " MINUTO(S)");
        }


        scanner.close();
    }
}