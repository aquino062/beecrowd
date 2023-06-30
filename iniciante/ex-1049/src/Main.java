import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String p1, p2, p3;

        p1 = scanner.next();
        p2 = scanner.next();
        p3 = scanner.next();


        if (p1.equals("vertebrado")) {

            if (p2.equals("ave")) {
                if (p3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {//onivero
                    System.out.println("pomba");
                }

            } else {//mamifero
                if (p3.equals("onivoro")) {
                    System.out.println("homem");
                } else {//herbivoro
                    System.out.println("vaca");
                }

            }
        } else {//invertebrado

            if (p2.equals("inseto")) {
                if (p3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {//herbivoro
                    System.out.println("lagarta");
                }

            } else {//anelideo
                if (p3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {//onivoro
                    System.out.println("minhoca");
                }
            }

        }
        scanner.close();

    }
}