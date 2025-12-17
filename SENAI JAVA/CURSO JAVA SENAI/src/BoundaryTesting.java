import org.w3c.dom.ls.LSOutput;

import java.time.format.TextStyle;

public class BoundaryTesting {

    public static void main(String args[]) {
        int CALENDAR_START = 1583;

        // validate input 
        int[][] testCases = {
            {1582, 2},
            {1583, 0},
            {1583, 13},
            {1583, 1},
            {1583, 12},
        };
        /*if ((year < CALENDAR_START) || (month < 1) || (month > 12)) {
            System.out.println("Testando ano: " + year + " mês " + month);
        }*/
        for (int[] testCase : testCases){
            int year = testCase[0];
            int month = testCase[1];

        System.out.println("Testando ano: " + year + "mês: " + month + "->");
        if ((year < CALENDAR_START) || (month < 1) || (month > 12)){
            System.out.println("Entrada inválida");
        }else{
            System.out.println("Entrada válida");
        }
        }




    }

}
