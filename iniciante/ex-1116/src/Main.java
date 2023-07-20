import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            int x = scanner.nextInt();
            int y = scanner.nextInt();


            if(y == 0){
                System.out.println("divisao impossivel");
            }else{

                double result = (double) x / y;
                System.out.printf("%.1f\n",result);
            }

        }
        scanner.close();
    }
}