import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int rest;
        ArrayList<Integer> list = new ArrayList<>();

        while (num > 0) {
            rest = num % 16;

            list.add(rest);
            num = num / 16;
        }
        Collections.reverse(list);

        for (int x : list) {
            if (x > 9) {
                if (x == 10) {
                    String aux = "A";
                    System.out.print(aux);
                } else if (x == 11) {
                    String aux = "B";
                    System.out.print(aux);
                } else if (x == 12) {
                    String aux = "C";
                    System.out.print(aux);
                } else if (x == 13) {
                    String aux = "D";
                    System.out.print(aux);
                } else if (x == 14) {
                    String aux = "E";
                    System.out.print(aux);
                } else if (x == 15) {
                    String aux = "F";
                    System.out.print(aux);
                }
            } else {
                System.out.print(x);
            }
        }
        System.out.println();
    }
}
