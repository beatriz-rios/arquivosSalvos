public class CheckingAccount {
    double balance; //Saldo da conta
    String name;// Nome do titular da conta

    //Método para realzar uma retirada de dinheiro
    public void  withdraw(double valor){

        if (valor < 0){
            System.out.println("Aviso: O valor da retirada não pode ser negativo. ");
        }else if (valor > balance) {
            System.out.println("Aviso: Saldo insuficiente para retirar.");
        }else {
            balance -= valor;
            System.out.println("Retirada de R$ " + valor + "realizada com sucesso.");
            System.out.println("Novo saldo: R$ " + balance);
        }
    }
}
