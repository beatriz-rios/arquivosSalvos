import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

         Scanner console = new Scanner(System.in); //criando scanner para ler um número
         
        System.out.print("Enter the number :  ");
        int num = console.nextInt(); //Pedindo para o usuário inserir um número

        // Imprimindo o resultado dos divisores
        System.out.print("Divisors of " + num+" "+ "="+" " );

        //O loop vai de 0 num
        //  Se o resto for 0 quando num for dividido por "i", caso contrário, pule para a próxima iteração
        for (int i = 1; i < num; i++) {
            if (num % i != 0) {
                continue;
            }
            System.out.print(i + " , ");
        }
    }
}
