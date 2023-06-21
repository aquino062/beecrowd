import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();

        double media, exame, mediaFinal;

        media = (n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1);
        media = (double) (int) media / 10; // truncamento para corrigir erro de arredondamento.
        //ou pode usar o decimal format também que ele nao arredonda.

        System.out.printf("Media: %.1f\n", media);

        if (media >= 7) {

            System.out.println("Aluno aprovado.");

        } else if (media < 5) {

            System.out.println("Aluno reprovado.");

        } else if (media >= 5 && media <= 6.9) {

            System.out.println("Aluno em exame.");

            exame = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", exame);

            mediaFinal = (media + exame) / 2;


            if (mediaFinal >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);
            }
            scanner.close();

        }
    }
}