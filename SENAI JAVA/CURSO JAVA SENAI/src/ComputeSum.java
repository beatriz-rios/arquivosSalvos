import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        int sum = 0;
       Scanner digitado = new Scanner(System.in);
        System.out.println("Por favor digite 10 números: ");
        System.out.println("Digite 0 para SAIR");

        for (int i = 0; i < 10; i++) {
            int xis = digitado.nextInt();
            sum += xis;

            if (xis == 0) {
                break;
            }
        }
        System.out.println("A soma dos números digitados é: " + sum);

    }
}
