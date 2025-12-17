public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's individual total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        double tax = 0.05;
        double comissao = 0.15;

        double Person1 = 10.00;
        double Person2 = 12.00;
        double Person3 = 9.00;
        double Person4 = 8.00;
        double Person5 = 7.00;
        double Person6 = 15.00;
        double Person7 = 11.00;
        double Person8 = 30.00;

        System.out.println("Person1: $" + Person1 * (1 + tax + comissao ));
        System.out.println("Person2: $" + Person2 * (1 + tax + comissao ));
        System.out.println("Person3: $" + Person3 * (1 + tax + comissao ));
        System.out.println("Person4: $" + Person4 * (1 + tax + comissao ));
        System.out.println("Person5: $" + Person5 * (1 + tax + comissao ));
        System.out.println("Person6: $" + Person6 * (1 + tax + comissao ));
        System.out.println("Person7: $" + Person7 * (1 + tax + comissao ));
        System.out.println("Person8: $" + Person8 * (1 + tax + comissao ));


        
    }    
}
