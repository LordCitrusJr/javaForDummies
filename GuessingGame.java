import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class GuessingGame { // Adapted from Dr. Burd's 6-1 program in the book, GuessAgain

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);

        int numGuesses = 0; // counter for our guesses
        int ceilingNumber = 100; // constant for our max random number
        int randomNumber = new Random().nextInt(ceilingNumber) + 1; // generates a random number to guess
        int newFloor = 1; // This will update in the loop so the player knows the new min
        int newCeiling = ceilingNumber; // This will update in the loop so the player knows the new max

        out.println(" ************ ");
        out.println("Welcome to the Guessing Game");
        out.println(" ************ ");
        out.println();

        out.print("Enter an int from 1 to " + ceilingNumber + ": ");
        int inputNumber = keyboard.nextInt(); // creates the guess variable from keyboard input
        numGuesses++; // Intial guess is tallied

        while (inputNumber != randomNumber) { // while loop on the condition the guess is not the random number
            out.println();
            out.print("Try again...");

            if (inputNumber < randomNumber) { // updates the floor if player guesses too high
                newFloor = inputNumber;
                out.println("the number is higher than your guess");
            } else { // updates the ceiling if player guesses too low
                newCeiling = inputNumber;
                out.println("the number is lower than your guess");
            }

            out.print("Enter an int from " + newFloor + " to " + newCeiling +": "); // gives player new range to guess
            inputNumber = keyboard.nextInt();
            numGuesses++;
        }
        out.print("You win after "); // displays number of guesses it took to wing
        out.println(numGuesses + " guesses.");

        keyboard.close(); // closes keyboard
    }
}
