import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;
        while (scanner.hasNext()) {
            double volume = scanner.nextDouble();
            double diametro = scanner.nextDouble();


            double raio = diametro / 2.0;
            double area = pi * Math.pow(raio, 2.0);
            double altura = volume / area;


            System.out.printf("ALTURA = %.2f\n", altura);
            System.out.printf("AREA = %.2f\n", area);

        }
        scanner.close();
    }

}