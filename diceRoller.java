import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class diceRoller {
    public static void main(String[] args) {
        // Taking inputs and generating a dice roll. I don't know loops or try statements yet :(
        Scanner keyboard = new Scanner(System.in);
        out.print("Enter an int for how many dice you are rolling: ");
        int diceNumber = keyboard.nextInt(); // Next input stores an in as the number of dice being rolled.

        out.print("Enter an int for how sides your die has: ");
        int sideNumber = keyboard.nextInt(); // Next input stores how many sides our dice have.
        int randomNumber = new Random().nextInt(sideNumber) + 1; // This generates our random number.

        out.println("Your total dice roll for " + diceNumber + " d " + sideNumber + " is "
                + diceNumber * randomNumber); // this is our output result.
        out.println("Thank you for rolling!");

        keyboard.close();  // You need this code to turn off Java's connection to the keyboard.
    }
}
