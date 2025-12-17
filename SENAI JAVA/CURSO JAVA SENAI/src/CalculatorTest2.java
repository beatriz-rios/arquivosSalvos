public class CalculatorTest2 {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        //Instantiate a Calculator2 object
        
        
        //Access the Calculator2 object's fields and methods
        //to find the total for each member of the birthday party

        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */
        calc.originalPrice = 10.00;
        System.out.print("Person1: $");
        calc.findTotal();

        calc.originalPrice= 12.00;
        System.out.print("Person2: $");
        calc.findTotal();

        calc.originalPrice = 9.00;
        System.out.print("Person3: $");
        calc.findTotal();

        calc.originalPrice = 8.00;
        System.out.print("Person4: $");
        calc.findTotal();

        calc.originalPrice = 7.00;
        System.out.print("Person5: $");
        calc.findTotal();

        calc.originalPrice = 15.00;
        System.out.print("Person6: $");
        calc.findTotal();

        calc.originalPrice = 11.00;
        System.out.print("Person7: $");
        calc.findTotal();

        calc.originalPrice = 30.00;
        System.out.print("Person8: $");
        calc.findTotal();





    }
}
