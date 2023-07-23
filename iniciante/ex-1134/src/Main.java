import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao, alcool = 0, gasolina = 0, diesel = 0;

        do {
            opcao = scanner.nextInt();

            if (opcao == 1) {
                alcool += 1;
            } else if (opcao == 2) {
                gasolina += 1;
            } else if (opcao == 3) {
                diesel += 1;
            }


        } while (opcao != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        scanner.close();
    }
}