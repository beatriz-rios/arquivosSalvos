import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(24);
        numeros.add(78);
        numeros.add(95);
        numeros.add(84);

        Iterator<Integer> ianSesiano = numeros.iterator();
        while (ianSesiano.hasNext()){
            int n = ianSesiano.next();
            if (n % 2 == 0){
                ianSesiano.remove();
            }

        }


        System.out.println("Números " + numeros);
    }
}
