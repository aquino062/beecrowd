import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeAnos, mes, dias;
        int idadeEmDias = scanner.nextInt();

        idadeAnos = idadeEmDias / 365;
        mes = (idadeEmDias % 365) / 30;
        dias = (idadeEmDias % 365) % 30;

        System.out.println(idadeAnos + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");
        scanner.close();

    }
}