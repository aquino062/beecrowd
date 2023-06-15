import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = scanner.nextInt();
        int workedHours = scanner.nextInt();
        double receivedPerHour = scanner.nextDouble();

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", (receivedPerHour * workedHours));
        scanner.close();
    }
}