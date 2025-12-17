import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // Cria um novo objeto da classe CheckingAccount
        CheckingAccount minhaConta = new CheckingAccount();
        Scanner sei = new Scanner(System.in);
        //Atribui valores aos campos
        System.out.println("Digite o seu nome");
        minhaConta.name = sei.next();
        minhaConta.balance = 1000;

        //Exibe os valores
        System.out.println("Titula: " + minhaConta.name);
        System.out.println("Saldo: R$ " + minhaConta.balance);

        int saque ;
       for(int i = 0; i < 3; i++){
           System.out.println("Deseja sacar ou depositar?");
           saque = sei.nextInt();
           if (saque == 1){
               System.out.println("Qual o valor deseja retirar?");
               double dindin = sei.nextInt();
              minhaConta.withdraw(dindin);

           }else if (saque == 2){
               System.out.println("Qual o valor deseja depositar? ");
               double dindin = sei.nextInt();
               minhaConta.balance += dindin;
               System.out.println(minhaConta.balance);

           }else{
               System.out.println("Opção inválida!");
           }
       }
    }

}


