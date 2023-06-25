import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double maior, a2, bc;

        if (b > a) {
            maior = b;
            b = a;
            a = maior;
        }
        if (c > a) {
            maior = c;
            c = a;
            a = maior;
        }

        a2 = Math.pow(a, 2);
        bc = Math.pow(b, 2) + Math.pow(c, 2);

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a2 > bc) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (a2 < bc) {
                System.out.println("TRIANGULO ACUTANGULO");
            } else {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c || c == a) {
                System.out.println("TRIANGULO ISOSCELES");
            }
            scanner.close();
        }
    }
}