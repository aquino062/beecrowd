import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String tipo;
        int qntd,coelho = 0,ratos = 0,sapos = 0,total = 0;




        for (int i = 0; i < n;i++){
            qntd = scanner.nextInt();
            tipo = scanner.next();

            if(tipo.equals("C")){
                coelho+= qntd;
                total += qntd;
            } else if (tipo.equals("R")) {
                ratos += qntd;
                total += qntd;
            }else{
                sapos += qntd;
                total += qntd;
            }
        }
        double percentualRato = ((double) ratos / total) * 100;
        double percentualCoelho = ((double)coelho / total) * 100;
        double percentualSapo = ((double)sapos / total) * 100;

        System.out.println("Total: "+ total+" cobaias");
        System.out.println("Total de coelhos: "+ coelho);
        System.out.println("Total de ratos: "+ ratos);
        System.out.println("Total de sapos: "+ sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n",percentualCoelho);
        System.out.printf("Percentual de ratos: %.2f %%\n",percentualRato);
        System.out.printf("Percentual de sapos: %.2f %%\n",percentualSapo);

          scanner.close();

    }
}