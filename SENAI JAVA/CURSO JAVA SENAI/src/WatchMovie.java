import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        double precoIngresso = 0;
        System.out.print("Enter the movie ticket price \n");
        Scanner teclado = new Scanner(System.in);
        precoIngresso = teclado.nextDouble();

        System.out.println("Entre com a avaliação do filme!!!");
        int nota = teclado.nextInt();

        if (precoIngresso >= 12.0 && nota == 5 ){
            System.out.println("Estou interessado em assistir o filme!");
        }else{
            System.out.println("NÃO estou interessado em assistir o filme!");
        }

    }
}
