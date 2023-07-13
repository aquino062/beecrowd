import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] diaInicial = scanner.nextLine().split(" ");
        String[] tempoInicial = scanner.nextLine().split(" ");
        String[] diaFinal = scanner.nextLine().split(" ");
        String[] tempoFinal = scanner.nextLine().split(" ");

        /*
        Dia 5
        08 : 12 : 23
        Dia 9
        06 : 13 : 23
         */

        int dia1 = Integer.parseInt(diaInicial[1]);
        int dia2 = Integer.parseInt(diaFinal[1]);


        int hora1 = Integer.parseInt(tempoInicial[0]);
        int minuto1 = Integer.parseInt(tempoInicial[2]);
        int segundo1 = Integer.parseInt(tempoInicial[4]);

        int hora2 = Integer.parseInt(tempoFinal[0]);
        int minuto2 = Integer.parseInt(tempoFinal[2]);
        int segundo2 = Integer.parseInt(tempoFinal[4]);

        int totalSegundos1 = segundo1 + minuto1 * 60 + hora1 * 3600 + dia1 * 24 * 3600;
        int totalSegundos2 = segundo2 + minuto2 * 60 + hora2 * 3600 + dia2 * 24 * 3600;

        int diferencaSegundos = totalSegundos2 - totalSegundos1;

        int dias = diferencaSegundos / (24 * 3600);
        diferencaSegundos %= (24 * 3600);
        int horas = diferencaSegundos / 3600;
        diferencaSegundos %= 3600;
        int minutes = diferencaSegundos / 60;
        diferencaSegundos %= 60;
        int segundos = diferencaSegundos;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutes + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        scanner.close();

    }


}
