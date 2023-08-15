import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetPar = new int[5];
        int[] vetImpar = new int[5];

        int x;
        int contPar = 0, contImpar = 0;


        for (int i = 0; i < 15; i++) {
            x = scanner.nextInt();

            if (x % 2 == 0) {
                vetPar[contPar] = x;
                contPar++;
                if (contPar == 5) {
                    contPar = 0;
                    for (int j = 0; j < vetPar.length; j++) {
                        System.out.println("par[" + j + "] = " + vetPar[j]);
                    }
                }


            } else {
                vetImpar[contImpar] = x;
                contImpar++;
                if (contImpar == 5) {
                    contImpar = 0;
                    for (int j = 0; j < vetImpar.length; j++) {
                        System.out.println("impar[" + j + "] = " + vetImpar[j]);
                    }
                }

            }
        }
        for (int j = 0; j < contImpar; j++) {
            System.out.println("impar[" + j + "] = " + vetImpar[j]);
        }

        for (int j = 0; j < contPar; j++) {
            System.out.println("par[" + j + "] = " + vetPar[j]);
        }
        scanner.close();
    }
}

