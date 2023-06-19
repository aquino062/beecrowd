import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int a, b, c, d;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        ;
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();


        if (b > c && d > a && (c + d) > (a + b)) {
            //verifica se é a e b são positivos
            if (c > 0 && d > 0) {
                //verifica se a é par
                if (a % 2 == 0) {
                    System.out.println("Valores aceitos");

                }else {
                    System.out.println("Valores nao aceitos");
                }
            }else {
                System.out.println("Valores nao aceitos");
            }
        } else {
            System.out.println("Valores nao aceitos");
        }
        scanner.close();
    }

}