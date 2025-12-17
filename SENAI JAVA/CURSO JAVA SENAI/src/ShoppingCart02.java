public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 25.00;
        double tax = 0.07;
        int quantity = 2;
        
        
        // Declare and assign a calculated totalPrice
        double totalPrice = price * quantity + tax * price * quantity;
        
        // Modify message to include quantity 
        message = custName + " quer comprar " + quantity + " " + itemDesc;
         System.out.println(message);
        System.out.println("Total com as taxas é: " + totalPrice);
        // Print another message with the total cost

    }    
}
