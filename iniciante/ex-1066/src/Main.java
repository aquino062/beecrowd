import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int valores, pares = 0, impar = 0, positivo = 0, negativo = 0;

        for (int i = 0; i <= 4; i++) {
            valores = scanner.nextInt();
            if (valores < 0) {
                negativo += 1;
            }
            if (valores % 2 == 0) {
                pares += 1;
            } else {
                impar += 1;
            }
            if (valores > 0) {
                positivo += 1;
            }
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");

        scanner.close();

    }
}