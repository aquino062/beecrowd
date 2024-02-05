import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int cont = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cont++;
            }
        }


        if (cont % 2 == 0) {
            //par
            s += '0';
        } else {
            //impar
            s += '1';
        }

        System.out.println(s);
    }
}