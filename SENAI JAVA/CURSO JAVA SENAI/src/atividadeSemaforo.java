import java.util.Scanner;

public class atividadeSemaforo {
    public static void main(String[] args) {
        int cores;
        Scanner semaforo = new Scanner(System.in);
        System.out.println("Entre com um número para ver o semáforo!");
        cores = semaforo.nextInt();
        switch (cores){
            case 1:
                System.out.println("O semáforo está verde!");
                break;
            case 2:
                System.out.println("O semáforo está amarelo!");
                break;
            case 3:
                System.out.println("O semáforo está vermelho!");
                break;
            default:
                System.out.println("Esse número não é válido! ");
                break;
        }
    }
}
