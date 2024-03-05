/** 
 * Name: Neil Oza
 * Date 3/4/2024
 * Program: Display results of an election
 */


// Importing Scanner, and tool to format 
import java.text.NumberFormat;
import java.util.Scanner;
// Start of the program
public class Election {
    public static void main(String[] args) {
        // Setting up format for percentages
        NumberFormat percent = NumberFormat.getPercentInstance();
        // Initializing scanner
        Scanner userInput = new Scanner(System.in);
        // Asking user to input number of votes for each person
        System.out.println("Enter the number of votes Awbrey recieved in NY, NJ, and CT:");
        double votesNYA = userInput.nextDouble();
        double votesNJA = userInput.nextDouble();
        double votesCTA = userInput.nextDouble();
        System.out.println("Enter the number of votes Martinez recieved in NY, NJ, and CT:");
        double votesNYM = userInput.nextDouble();
        double votesNJM = userInput.nextDouble();
        double votesCTM = userInput.nextDouble();
        // Closing scanner to avoid waste of resources
        userInput.close();
        // Finding the totals Awbrey and Martinez
        double totalAwbrey = votesNYA + votesNJA + votesCTA;
        double totalMartinez = votesNYM + votesNJM + votesCTM;
        // Finding the percents
        double percentAwbrey = (totalAwbrey / (totalAwbrey + totalMartinez)) * 100;
        double percentMartinez = (totalMartinez / (totalAwbrey + totalMartinez)) * 100;
        // Printing the outcome of the election
        System.out.println("Candidate   Votes    Percentage\nAwbrey      " + totalAwbrey + "    " + percentAwbrey +" %" + "\nMartinez    " + totalMartinez + "    " + percentMartinez + " %" + "\n\nTOTAL VOTES = " + (totalAwbrey + totalMartinez));
        
        

        // Printing message with how many votes each person recieved in each state
        
       
    }
} 
