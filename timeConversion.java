import java.util.Scanner;
public class timeConversion {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the time in minutes:");
        int timeInMinutes = userInput.nextInt();
        int onesMinute = timeInMinutes % 60;
        int tensMinute = onesMinute/10;
        int timeInHours = (timeInMinutes-onesMinute)/60;
        userInput.close();
        System.out.println("The time in hours is " + timeInHours +":" + tensMinute + onesMinute);
    }
}
