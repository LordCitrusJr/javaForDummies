import java.util.Scanner;

// This is a riff off of Dr. Burd's Elevator code from 4-5.
public class ElevatorFitter2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Turn on connection to keyboard.
        int elevatorWeightLimit = 1400; // Constant weight
        System.out.println("WOW! The Brickenchicker dectuplets are identical in every way, including " +
                "their weight.");
        System.out.print("Enter an int for their individual weight and see if they can all " +
                "fit on an elevator with a max capacity of " + elevatorWeightLimit + " pounds: ");
        int weightOfAPerson = keyboard.nextInt();
        int numberOfPeople = elevatorWeightLimit / weightOfAPerson;
        boolean allTenOkay = numberOfPeople >= 10;

        if (allTenOkay == true) { // If statement to check boolean status. IMO it's nice to have the bool var
            System.out.print("You can fit all ten of the"); // Using print to get output on one line.
        } else {
            System.out.print("You can't fit all ten of the");

        }
        System.out.print(" Brickenchicker dectuplets on the elevator!");
        System.out.println();

    }
}
