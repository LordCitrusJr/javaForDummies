import javax.swing.JOptionPane;

// This is a riff off of Dr. Burd's Elevator code from 4-5. I converted it to all pop-ups
public class elevatorCapacityCheck {

    public static void main(String[] args) {
        int elevatorWeightLimit = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter the max weight capacity for the elevator.",
                "Elevator Capacity Check", JOptionPane.INFORMATION_MESSAGE));
        int numberOfPassengers = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter number of passengers riding in the elevator.",
                "Elevator Capacity Check", JOptionPane.INFORMATION_MESSAGE));
        int weightOfAPerson = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter The average weight of the passenger",
                "Elevator Capacity Check", JOptionPane.INFORMATION_MESSAGE));
        int passengerWeight = weightOfAPerson * numberOfPassengers;
        boolean capacityCheck = elevatorWeightLimit >= passengerWeight;

        if (capacityCheck == true) { // If statement to check boolean status. IMO it's nice to have the bool var
            JOptionPane.showMessageDialog(null,"You can fit all " + numberOfPassengers +
                    " passengers in the elevator!", "Elevator Capacity Check", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"You can't fit all " + numberOfPassengers +
                    " passengers in the elevator! \nThe max weight capacity is: " + elevatorWeightLimit +
                    ". Your total weight is: " + passengerWeight + "."
                    , "Elevator Capacity Check", JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
