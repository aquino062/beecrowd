import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        double somaTotal = 0, media;


        for (int i = 0; i <= 5; i++) {
            double valor = scanner.nextDouble();
            if (valor > 0) {
                contador += 1;
                somaTotal += valor;

            }

        }
        media = (somaTotal / contador);


        System.out.println(contador + " valores positivos");
        System.out.printf("%.1f\n",media);
        scanner.close();
    }
}