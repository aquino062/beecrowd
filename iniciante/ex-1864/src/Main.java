import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            list.add(Character.toString(caracter));
        }

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        scanner.close();


    }
}