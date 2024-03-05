/*******
 * Name: Neil Oza
 * Date 3/4/2024
 * Program: Display results of an election
 */
<<<<<<< HEAD

/* imports  */
/* scanner class for user input */
import java.util.Scanner;
import java.text.NumberFormat;

public class Election {
    public static void main(String[] args) {
        //create scanner object for asking user input
        Scanner userInput;
        userInput = new Scanner(System.in);

        //get information for Awbrey
        System.out.println("Please enter number of votes Awbrey received in New York, New Jersey and Connecticut");

        //Get the number of votes for NY, NJ, CT from the user input
        double votesNYAwbrey = userInput.nextDouble();
        double votesNJAwbrey = userInput.nextDouble();
        double votesCTAwbrey = userInput.nextDouble();

        System.out.println("Awbrey votes are: "+ votesNYAwbrey + "," + votesNJAwbrey + "," + votesCTAwbrey);
    
        //release the scanner
        //userInput.close();

        //Get information for Martinez
       // Scanner userInput2 = new Scanner(System.in);
        System.out.println("Please enter number of votes Martinez received in New York, New Jersey and Connecticut");

        //Get the number of votes for NY, NJ, CT from the user input
        double votesNYMartinez = userInput.nextDouble();
        double votesNJMartinez = userInput.nextDouble();
        double votesCTMartinez = userInput.nextDouble();

        System.out.println("Martinez votes are: "+ votesNYMartinez + "," + votesNJMartinez + "," + votesCTMartinez);
         
        //release the scanner
         userInput.close();

=======
// Importing 
import java.text.NumberFormat;
import java.util.Scanner;
public class Election {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of votes Awbrey recieved in NY, NJ, and CT:");
        double votesNYA = userInput.nextDouble();
        double votesNJA = userInput.nextDouble();
        double votesCTA = userInput.nextDouble();
        System.out.println("Enter the number of votes Martinez recieved in NY, NJ, and CT:");
        double votesNYM = userInput.nextDouble();
        double votesNJM = userInput.nextDouble();
        double votesCTM = userInput.nextDouble();
        
        userInput.close();
       
>>>>>>> ed300d3819d1a87b9a67ac426d4d980de13a2902
    }

} 