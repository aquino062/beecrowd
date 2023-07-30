public class Main {
    public static void main(String[] args) {

        double s = 1;
        int aux = 3;

        for (int i = 2; aux < 40;) {
            s += ((double) aux / i);
            aux += 2;
            i *= 2;
        }
        System.out.printf("%.2f\n", s);
    }
}