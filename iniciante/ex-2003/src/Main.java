
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String entrada = scanner.next();
            String[] partes = entrada.split(":");

            int horas = Integer.parseInt(partes[0]);
            int minutos = Integer.parseInt(partes[1]);

            horas += 1;

            int atraso = ((horas - 8) * 60) + minutos;

            if (atraso > 0) {
                System.out.println("Atraso maximo: " + atraso);
            } else {
                System.out.println("Atraso maximo: " + 0);
            }

        }
        scanner.close();

    }
}
