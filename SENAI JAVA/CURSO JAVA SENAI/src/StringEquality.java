import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        Scanner nomeDigitado = new Scanner(System.in);
        String nome = "";
        System.out.println("Digiteo seu nome: ");
        nome = nomeDigitado.nextLine();
        if (nome.equals("Moe")){
            System.out.println("Você é o rei do Rock! ");
        }else {
            System.out.println("Você não é rei");
        }
        nomeDigitado.close();
    }

    
}

