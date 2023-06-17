import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor, troco, cem, cinquenta, vinte, dez, cinco, dois;
        valor = scanner.nextInt();

        cem = valor / 100;
        troco = valor % 100;

        cinquenta = troco / 50;
        troco %= 50;

        vinte = troco / 20;
        troco %= 20;

        dez = troco / 10;
        troco %= 10;

        cinco = troco / 5;
        troco = troco % 5;

        dois = troco / 2;
        troco = troco % 2;

        System.out.println(valor);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(troco + " nota(s) de R$ 1,00");

        scanner.close();

    }
}