import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();

        for (int i = 0; i < c; i++) {
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            int o = scanner.nextInt();

            String statusDaPorta = (o == 1) ? "A porta abriu!" : "A porta fechou!";

            System.out.println(tempoFormatado(h, m) + " - " + statusDaPorta);
        }
        scanner.close();
    }

    public static String tempoFormatado(int hora, int minutos) {
        String horaFormatada = (hora <= 9) ? "0" + hora : String.valueOf(hora);
        String minutosFormatado = (minutos <= 9) ? "0" + minutos : String.valueOf(minutos);
        return horaFormatada + ":" + minutosFormatado;
    }
}