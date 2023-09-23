import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] diasPorMes = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (scanner.hasNext()) {
            int mes = scanner.nextInt();
            int dia = scanner.nextInt();


            if (mes < 12) {
                int diasRestante = diasPorMes[mes] - dia;

                for (int i = mes + 1; i < 12; i++) {
                    diasRestante += diasPorMes[i];
                }
                diasRestante += 25;
                System.out.println("Faltam " + diasRestante + " dias para o natal!");
            } else {
                //mes é igual a 12
                if (dia < 24) {
                    System.out.println("Faltam " + (25 - dia) + " dias para o natal!");
                } else if (dia == 24) {
                    System.out.println("E vespera de natal!");
                } else if (dia == 25) {
                    System.out.println("E natal!");
                } else {
                    System.out.println("Ja passou!");
                }
            }
        }
        scanner.close();
    }
}