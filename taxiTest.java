// Neil Oza
// Program: Taxi Test
// Date: 3/13/2024

//Imports
import java.util.Scanner;

public class taxiTest {
   public static void main(String[] args){
       //Initializing the scanner
       Scanner userInput = new Scanner(System.in);
       //Asking user to input number of passengers
       System.out.print("Enter the number of passengers: ");
       int numPassengers = userInput.nextInt();
       //Closing scanner to avoid wasteage of resources
       userInput.close();
       int numPassengerLeftOver = numPassengers%4;
       int numCabs = (numPassengers - numPassengerLeftOver)/4;
       //Printing to console
       System.out.println(numCabs + " are required");
       System.out.print(numPassengerLeftOver + " passenger(s) will be left over");

   }
}
