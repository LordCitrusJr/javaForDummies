import static java.lang.System.out;

public class foodProduct {
    String foodName;
    String foodType;
    Double foodPrice;
    Integer foodServing;
    Integer foodCalories;
    Integer foodWeight;

    public void display() { // creating a void method doesn't return anything. It's just called and ran.
        out.println("~Food Data~");
        out.println("Food: " + foodName);
        out.println("Type: " + foodType);
        out.println("Price: $" + foodPrice);
        out.println("Total Calories: " + foodCalories);
        out.println("Number of Servings: " + foodServing);
        out.println("Weight of food (grams): " + foodWeight);
    }

    public double priceByWeight(double price, int weight) {return price / weight; } // method to pass along parameters
    public int caloriesPerServing(int cals, int servs) {return cals / servs; } // method to pass along parameters
}
