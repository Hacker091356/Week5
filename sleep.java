//Imports 
import java.text.NumberFormat;
import java.util.Scanner;
//Program
public class sleep{
    public static void main(String[] args){
        //Formatting 
        NumberFormat number = NumberFormat.getIntegerInstance();
        //Initializing scanner
        Scanner userInput = new Scanner(System.in);
        //Asking for input
        System.out.print("Enter your birthdate:\nYear: ");
        int year = userInput.nextInt();
        System.out.print("Month:");
        int month = userInput.nextInt();
        System.out.print("Day:");
        int day = userInput.nextInt();
        System.out.print("Enter today's date:\nYear:");
        int currentYear = userInput.nextInt();
        System.out.print("Month:");
        int currentMonth = userInput.nextInt();
        System.out.print("Day:");
        int currentDay = userInput.nextInt();
        //Closing the scanner
        userInput.close();
        //Calculating number of years alive/number of years slept
        int numberOfYearsInDays = ((currentYear - year)*365)+((currentMonth -month)*30 + (currentDay - day));
        int timeAsleep = numberOfYearsInDays * 8;
       
        //Printing the outcome
        System.out.print("You have been alive for " + numberOfYearsInDays +" days.");
        System.out.println("You have been asleep for " + (number.format(timeAsleep)) + " " +"hours");
        




    }
    
}
