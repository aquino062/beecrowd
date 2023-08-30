import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()){
            int n = scanner.nextInt();

            int[] vet = new int[n];

            int contador = 1;


            for (int i = 0; i < vet.length; i++) {
                vet[i] = scanner.nextInt();
            }

            int menor = vet[0];
            for (int i = 0; i < vet.length; i++) {
                if (vet[i] < menor) {
                    menor = vet[i];
                    contador = i + 1;
                }

            }

            System.out.println(contador);
        }


    }
}