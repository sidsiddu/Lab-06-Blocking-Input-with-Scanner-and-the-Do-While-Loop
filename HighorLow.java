import java.util.Random;
import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int number = rnd.nextInt(10) + 1;
        int guess = 0;
        boolean done = false;
        do {
            System.out.print("Guess the number (1-10): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                if(guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Please guess a number between 1 and 10.");
                    in.nextLine();
                }
            } else {
                System.out.println("Please enter a valid number between 1 and 10.");
                in.nextLine();
            }
        } while (!done);
        if(guess == number) {
            System.out.println("You guessed it right! The number was: " + number);
        } else if(guess < number) {
            System.out.println("Your guess was low. The number was: " + number);
        } else {
            System.out.println("Your guess was high. The number was: " + number);
        }
    }
}
