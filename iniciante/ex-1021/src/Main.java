import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resto;

        int notas100, notas50, notas20, notas10, notas5, notas2,
                moeda1, moeda50, moeda25, moeda10, moeda5, moeda01centavo;
        double valor = scanner.nextDouble();

        notas100 = (int) (valor / 100);
        resto = valor % 100;

        notas50 = (int) (resto / 50);
        resto %= 50;

        notas20 = (int) (resto / 20);
        resto %= 20;

        notas10 = (int) (resto / 10);
        resto %= 10;

        notas5 = (int) (resto / 5);
        resto %= 5;

        notas2 = (int) (resto / 2);
        resto %= 2;

        //operador de módulo (%) não funciona corretamente com números decimais.
        // Para resolver esse problema multipliquei o valor por 100.
        resto *= 100;

        moeda1 = (int) (resto / 100);
        resto %= 100;

        moeda50 = (int) (resto / 50);
        resto %= 50;

        moeda25 = (int) (resto / 25);
        resto %= 25;

        moeda10 = (int) (resto / 10);
        resto %= 10;

        moeda5 = (int) (resto / 5);
        resto %= 5;

        //arredonda o valor usando Math.round
        moeda01centavo = (int) Math.round(resto);


        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda01centavo + " moeda(s) de R$ 0.01");

        scanner.close();

    }
}