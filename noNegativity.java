// This program runs a loop as long as the user types in number >= 0.
import java.util.Scanner;
import static java.lang.System.out;

public class noNegativity {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);

        out.println(" ************ ");
        out.println("Don't Be Negative!");
        out.println(" ************ ");
        out.println();

        out.print("Whatever you do, don't type a negative number: ");
        int inputNumber = keyboard.nextInt();

        while ( inputNumber >= 0 ) {
            out.println();
            out.print("Great Job! You typed " + inputNumber + ". Type another number greater or equal to zero to keep going: ");
            inputNumber = keyboard.nextInt();

        }
        out.println();
        out.println("YOU TYPED A NEGATIVE NUMBER! YOU LOSE!");
        keyboard.close();
    }
}
