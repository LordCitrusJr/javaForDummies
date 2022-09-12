import java.util.Scanner;

import static java.lang.System.out;

public class monthDaysTwo { // Using the switch function with some fancy tricks to tell us how many days are in a month.

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        out.print("Enter the month number (1 for Jan, 2 for Feb, etc): ");
        int month = keyboard.nextInt();

        String line = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> "There are 31 Days are in this month";
            case 4, 6, 9, 11 -> "There are 30 days in this is month.";
            case 2 -> {
                out.print("Leap Year (true/false)?: ");
                boolean isLeapyear = keyboard.nextBoolean();
                if (isLeapyear) {
                    yield "There are 29 days in this month."; // Yield statement attempts to transfer control to the innermost enclosing switch expression;
                } else {
                    yield "There are 28 days in this month.";
                }
            }


            default -> "No such month. Please try again.";
        };

        out.print(line);

        keyboard.close();
    }
}
