// Neil Oza
// Program: Order (fast food restaurant) for test
// Date: 3/13/2024

//Imports
import java.util.Scanner;
import java.text.NumberFormat;

public class Order {
    public static void main(String[] args){
        //Initializing the scanner
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your name:");
        System.out.print("\nEnter the number of burgers:");
        int numBurgers = userInput.nextInt();
        System.out.print("\nEnter the number of fries:");
        int numFries = userInput.nextInt();
        System.out.print("\nEnter the number of sodas:");
        int numSodas = userInput.nextInt();
        // Calculating the price of each food item and the total
        double priceBurgers = (numBurgers * 1.69);
        double priceFries = (numFries * 1.09);
        double priceSodas = (numSodas * 0.99);
        double totalBeforeTax = (priceBurgers + priceFries + priceSodas);
        double tax = ((8.5)/100);
        double amountTax = ((8.5)/100) * totalBeforeTax;
        double totalAfterTax = (totalBeforeTax *((8.5)/100)) + totalBeforeTax;

        // For number format
        NumberFormat money = NumberFormat.getCurrencyInstance();
        //Printing message
        System.out.println("Total before tax: " + money.format(totalBeforeTax));
        System.out.println("Tax: " + money.format(amountTax));
        System.out.println("Final Total: " + money.format(totalAfterTax));
        //Asking for amount paid
        System.out.print("Enter the amount tendered: $");
        double changeRendered = userInput.nextDouble();
        //Closing scanner to avoid waste of resources
       
        //Printing the change
        double changeReturned = (changeRendered - totalAfterTax);
        System.out.print("Change: " + money.format(changeReturned));

        
        
    }

    
}
