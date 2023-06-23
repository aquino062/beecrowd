import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c, min1, min2 = 0, min3 = 0;


        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        min1 = Math.min(a, Math.min(b, c));

        if (min1 == a) {
            min2 = Math.min(b, c);
            min3 = Math.max(b, c);
        }

        if (min1 == b) {
            min2 = Math.min(a, c);
            min3 = Math.max(a, c);
        }

        if (min1 == c) {
            min2 = Math.min(a, b);
            min3 = Math.max(a, b);
        }

        System.out.println(min1);
        System.out.println(min2);
        System.out.println(min3);
        System.out.println("");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();


    }
}