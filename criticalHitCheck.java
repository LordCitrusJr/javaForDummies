import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;
// This is a riff off of Dr. Burd's Guessing Game in section 5.1

public class criticalHitCheck {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Turn on connection to keyboard.
        out.println("To roll a critical hit, your roll must equal the highest number of the sides of your die.");
        out.print("Enter an int for the number of sides your die has: ");

        int inputNumber = keyboard.nextInt(); // Here's our input
        int randomNumber = new Random().nextInt(inputNumber) + 1; // Here's our random dice roll

        if (inputNumber == randomNumber) { // The max number is the number of sides, so if the random no.
            // matches the input number, then it's a critical hit.
            out.println("  ***********");
            out.println("*Critical Hit!*");
            out.println("  ***********");
        } else {
            out.println("Not a critical hit."); // If it's not a critical hit, the dice roll is diplayed.
            out.print("You rolled a ");
            out.println(randomNumber + ".");
        }

        out.println("Thank you for rolling.");

        keyboard.close(); // Turns off connection to keyboard.
    }

}
