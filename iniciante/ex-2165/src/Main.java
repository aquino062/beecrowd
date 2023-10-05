import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String t = scanner.nextLine();

        if(t.length() <= 140){
            System.out.println("TWEET");
        }else {
            System.out.println("MUTE");
        }
        scanner.close();
    }
}