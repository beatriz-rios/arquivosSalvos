public class Richie {
    public static void main(String[] args) {
        /*int num1 = 3, num2 = 5, num3 = 9;
        int max = 0;
        if (num1 > num2 && num1 > num3){
            max = num1;
        }if (num2 > num1 && num2 > num3){
            max = num2;
        }if (num3 > num1 && num3 > num2){
            max = num3;
        }
        System.out.println("O máximo de 3 números é "+ max);
    }*/
        int n = 10;
        int sum = 10;
        while (n >= 1) {
            System.out.println(n);
            System.out.println("|" + sum + "|");
            sum = sum = n;
            n--;
            //System.out.println("No início do loop n = " + n);
           // System.out.println("No início do loop:sum = " + sum);
           // n--;

            //System.out.println("No fim do loop: n = " + n);
            //System.out.println("No fim do loop: sum = " + sum);
        }
        System.out.println(sum);
    }
}
