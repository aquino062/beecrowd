import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int temp = 0;

        while (contador < 3) {
            String a = scanner.nextLine();

            if (a.charAt(0) == '*') {
                temp += 4;
            }
            if (a.charAt(1) == '*') {
                temp += 2;
            }
            if (a.charAt(2) == '*') {
                temp += 1;
            }

            if (a.equals("caw caw")) {
                System.out.println(temp);
                temp = 0;
                contador++;
            }
        }
    }
}