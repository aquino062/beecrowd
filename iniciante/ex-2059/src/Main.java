import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p = scanner.nextInt();
        int j1 = scanner.nextInt();
        int j2 = scanner.nextInt();
        int r = scanner.nextInt();
        int a = scanner.nextInt();

        boolean roubou = false;
        boolean vitoriaJ1 = false;

        int result = j1 + j2;

        if (p == 1) {
            //jogador 1 escolheu par
            if (result % 2 == 0) {
                //par ganhou
                vitoriaJ1 = true;
                if (r == 1) {
                    roubou = true;
                }
            } else {
                //impar ganhou
                if (r == 1) {
                    roubou = true;
                    vitoriaJ1 = true;
                }
            }
        } else {
            //jogador 1 escolheu impar
            if (result % 2 != 0) {
                //impar ganho
                vitoriaJ1 = true;
                if (r == 1) {
                    roubou = true;
                }
            } else {
                if (r == 1) {
                    roubou = true;
                    vitoriaJ1 = true;
                }
            }
        }

        if (vitoriaJ1) {
            if (a == 1) {
                if (roubou) {
                    System.out.println("Jogador 2 ganha!");
                } else {
                    System.out.println("Jogador 1 ganha!");
                }
            } else {
                System.out.println("Jogador 1 ganha!");
            }
        } else {
            System.out.println("Jogador 2 ganha!");
        }
        scanner.close();
    }
}