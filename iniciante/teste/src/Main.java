import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caso = 1;

        while (scanner.hasNext()) {
            String n1 = scanner.next();
            String n2 = scanner.next();

            int count = 0;
            int pos = -1;

            for (int i = 0; i <= n2.length() - n1.length(); i++) {
                if (n1.equals(n2.substring(i, i + n1.length()))) {
                    count++;
                    pos = i + 1;
                }
            }

            System.out.println("Caso #" + caso + ":");
            if (count > 0) {
                System.out.println("Qtd.Subsequencias: " + count);
                System.out.println("Pos: " + pos);
            } else {
                System.out.println("Nao existe subsequencia");
            }

            caso++;
        }

        scanner.close();
    }
}
