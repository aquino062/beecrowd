import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senhaCorreta = 2002;
        int senha;

        while (true){
            senha = scanner.nextInt();
            if (senha == senhaCorreta){
                System.out.println("Acesso Permitido");
                break;
            }else{
                System.out.println("Senha Invalida");
            }
        }
        scanner.close();




    }
}