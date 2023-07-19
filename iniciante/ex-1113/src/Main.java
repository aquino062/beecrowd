import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if( x == y ){
                break;
            }

            if(y < x){
                System.out.println("Decrescente");
            }else {
                System.out.println("Crescente");
            }
        }
        scanner.close();
    }
}