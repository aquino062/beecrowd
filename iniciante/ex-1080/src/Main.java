import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0,posicao = 0;

        for (int i = 1; i <= 100; i++) {
        int valor = scanner.nextInt();

        if(valor > maior){
            maior = valor;
            posicao = i;
        }
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
}