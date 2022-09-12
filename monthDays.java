import java.util.Scanner;

import static java.lang.System.out;

public class monthDays { // Using the switch function to tell us how many days are in a month.

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        out.print("Enter the month number (1 for Jan, 2 for Feb, etc): ");
        int month = keyboard.nextInt();
        String line;

        line = switch (month) {
            case 1 -> "There are 31 days in January.";
            case 2 -> "There are 28 days in February.";
            case 3 -> "There are 31 days in March.";
            case 4 -> "There are 30 days in April.";
            case 5 -> "There are 31 days in May.";
            case 6 -> "There are 30 days in June.";
            case 7 -> "There are 31 days in July.";
            case 8 -> "There are 31 days in August.";
            case 9 -> "There are 30 days in September.";
            case 10 -> "There are 31 days in October.";
            case 11 -> "There are 30 days in November.";
            case 12 -> "There are 31 days in December.";
            default -> "No such month. Please try again.";
        };

        out.print(line);

        keyboard.close();
    }
}
