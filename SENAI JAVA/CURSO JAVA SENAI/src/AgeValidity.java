import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        System.out.println("Entre com sua idade: ");
       Scanner teclado = new Scanner(System.in);
       int idade = teclado.nextInt();

       boolean maiorDeIdade = false;

       maiorDeIdade = idade >= 18;
        System.out.println("Você pode dirigir com a idade que tem?" + maiorDeIdade);


    }
}
