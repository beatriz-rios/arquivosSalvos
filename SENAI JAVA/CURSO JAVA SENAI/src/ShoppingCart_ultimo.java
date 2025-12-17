public class ShoppingCart_ultimo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int resultado = calc.add(43,79);
        System.out.println("O resultado é: " + resultado);


        try{
            double outroResultado = calc.divide(15, 15);
            System.out.println("O resultado da divisão: " + outroResultado);
        }catch (ArithmeticException ian){
            System.out.println(ian);
        }
    }
}
