import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class GuessingGame {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);

        int numGuesses = 0; // counter for our guesses
        int ceilingNumber = 100; // constant for our max random number
        int randomNumber = new Random().nextInt(ceilingNumber) + 1;
        int newFloor = 1; // This will update the loop so the player knows the new min.
        int newCeiling = ceilingNumber; // This will update every loop so the player knows the new max.

        out.println(" ************ ");
        out.println("Welcome to the Guessing Game");
        out.println(" ************ ");
        out.println();

        out.print("Enter an int from 1 to " + ceilingNumber + ": ");
        int inputNumber = keyboard.nextInt(); // created the guess variable from keyboard input
        numGuesses++; // Intial guess tallied

        do { // do loop 
            out.println();
            out.print("Try again...");

            if (inputNumber < randomNumber) { // updates the floor if player guesses too high
                newFloor = inputNumber + 1;
                out.println("the number is higher than your guess");
            } else { // updates the ceiling if player guesses too low
                newCeiling = inputNumber - 1;
                out.println("the number is lower than your guess");
            }

            out.print("Enter an int from " + newFloor + " to " + newCeiling +": "); // gives player new range to guess
            inputNumber = keyboard.nextInt();
            numGuesses++;
        } while (inputNumber != randomNumber); // condition for loop
        out.print("You win after "); // displays number of guesses it took to wing
        out.println(numGuesses + " guesses.");

        keyboard.close(); // closes keyboard
    }
}
