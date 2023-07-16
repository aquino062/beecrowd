
public class Main {
    public static void main(String[] args) {

        int i = 1;
        int j = 7;

        while (i <= 9) {
            System.out.println("I=" + i + " J=" + j);
            if (j == 5) {
                j += 2;
                i+=2;
            } else {
                j -= 1;
            }
        }
    }
}