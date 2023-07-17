public class Main {
    public static void main(String[] args) {
        int i = 1;
        int j = 7;


        for (int c = 1; c <= 5; c++) {
             System.out.println("I=" + i + " J=" + j);

            for (int a = 1; a < 3; a++) {
                j -= 1;
                System.out.println("I=" + i + " J=" + j);
            }
            j += 4;
            i += 2;
        }
    }
}