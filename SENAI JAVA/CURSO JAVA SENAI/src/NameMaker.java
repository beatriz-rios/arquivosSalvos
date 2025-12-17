import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
       String primeiroNome, nomeMeio,  ultimoNome, nomeCompleto;
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com o seu primeiro nome: ");
        primeiroNome = in.next();
        System.out.println("Entre com o seu nome do meio: ");
        nomeMeio = in.next();
        System.out.println("Entre com o seu último nome: ");
        ultimoNome = in.next();

        nomeCompleto = primeiroNome + " " + nomeMeio + " " + ultimoNome;
        System.out.println("Seu nome completo é: " + nomeCompleto);
    }
    
}
