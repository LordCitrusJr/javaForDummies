import static java.lang.System.out;

public class foodProduct {
    String foodName;
    String foodType;
    Double foodPrice;
    Integer foodServing;
    Integer foodCalories;

    public void display() { // creating a void method doesn't return anything. It's just called and ran.
        out.println("~Food Data~");
        out.println("Food: " + foodName);
        out.println("Type: " + foodType);
        out.println("Price: $" + foodPrice);
        out.println("Servings Per: " + foodServing);
        out.println("Calories Per Serving: " + foodCalories / foodServing);
        out.println();
    }
}
