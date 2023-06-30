import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double valor = scanner.nextDouble();
        int percentual = 0;


        if (valor >= 0 && valor <= 400.00) {
            percentual = 15;
        } else if (valor <= 800.00) {
            percentual = 12;
        } else if (valor <=1200.00) {
            percentual = 10;
        } else if (valor <=2000.00) {
            percentual = 7;
        }else{
            percentual = 4;
        }


        double reajuste = (valor * percentual) / 100;
        double novoSalario = valor + reajuste;


        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + percentual+ " %");

        scanner.close();
    }
}