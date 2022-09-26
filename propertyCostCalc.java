import static java.lang.System.out;
import java.util.Scanner;

public class DtpTextVersion {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        PlaceToLive myPlace = new PlaceToLive();

        out.println(" ************ ");
        out.println("Welcome to the Property Calculator");
        out.println(" ************ ");
        out.println();
        out.println("Please enter your address: ");
        myPlace.setAddress(keyboard.nextLine());
        out.println("Please enter the number of bedrooms: ");
        myPlace.setNumBedrooms(keyboard.nextInt());
        out.println("Please enter the property's total area (Square Feet): ");
        myPlace.setSqFeet(keyboard.nextInt());
        out.println("Please enter the neighborhood's estimated cost per square foot (i.e 5.50): ");
        myPlace.setSqfPrice(keyboard.nextDouble());

        myPlace.setEstPropCost(myPlace.getSqFeet() * myPlace.getSqfPrice());
        myPlace.setCostPerBedroom(myPlace.getEstPropCost() / myPlace.getSqFeet());

        out.print("Property at " + myPlace.getAddress() + " (with " + myPlace.getNumBedrooms() + " bedrooms) has an " +
                "estimated property cost of ");
        out.printf("$%,.2f%n", myPlace.getEstPropCost());
        out.println();
        out.print("The cost per bedroom is ");
        out.printf("$%,.2f%n", myPlace.getCostPerBedroom());
    }
}
