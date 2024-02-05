import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //I'm back

        while (true){


        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if( x == 0 && y == 0 ){
            break;
        }else{

            int e = y * x;

            System.out.println(e);
        }


        }


    }
}