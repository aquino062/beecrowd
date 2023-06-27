import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inicio, fim, duracao;

        inicio = scanner.nextInt();
        fim = scanner.nextInt();


        if (inicio >= fim) {
            duracao = (24 + fim) - inicio;
        } else {
            duracao = fim - inicio;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        scanner.close();
    }
}