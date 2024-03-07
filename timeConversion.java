import java.util.Scanner;
public class timeConversion {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the time in minutes:");
        int timeInMinutes = userInput.nextInt();
        int onesMinute = (timeInMinutes % 60)%10;
        int tensMinute = (timeInMinutes % 60)/10;
        int timeInHours = (timeInMinutes-onesMinute)/60;
        userInput.close();
        System.out.print(onesMinute);
        System.out.print(tensMinute);
        System.out.println("The time in hours is " + timeInHours +":" + tensMinute + onesMinute);
    }
}
