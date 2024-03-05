/*******
 * Name: Neil Oza
 * Date 3/4/2024
 * Program: Display results of an election
 */
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
       
    }
} 