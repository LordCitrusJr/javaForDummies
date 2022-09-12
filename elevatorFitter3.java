import javax.swing.JOptionPane;

// This is a riff off of Dr. Burd's Elevator code from 4-5. I created a pop-up for the input.
public class elevatorFitter3 {

    public static void main(String[] args) {
        int elevatorWeightLimit = 1400; // Constant weight
        int weightOfAPerson = Integer.parseInt(JOptionPane.showInputDialog("Enter The Dectuplet Individual's Weight"));
        // Input box for an integer, yeah baby!
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
