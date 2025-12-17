import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Entre com um número:");
        num = in.nextInt();

        if ((num % 2) == 0){
            System.out.println("O nÚMERO digitado é: " + num + "(par)");
        }
        if((num % 2) != 0){
            System.out.println("O número digitado é: " + num + "(ímpar)");
        }
    }
}
