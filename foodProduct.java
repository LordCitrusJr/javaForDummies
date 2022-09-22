import static java.lang.System.out;

public class foodProduct { // Setting these to private hides the fields and makes the program more safe
    private String foodName;
    private String foodType;
    private Double foodPrice;
    private Integer foodServing;
    private Integer foodCalories;
    private Integer foodWeight;

    public void display() { // Creating a void method doesn't return anything. It's just called and ran.
        out.println("~Food Data~");
        out.println("Food: " + foodName);
        out.println("Type: " + foodType);
        out.println("Price: $" + foodPrice);
        out.println("Total Calories: " + foodCalories);
        out.println("Number of Servings: " + foodServing);
        out.println("Weight of food (grams): " + foodWeight);
    }

    protected Double priceByWeight(double price, int weight) {return price / weight; } // method to pass along parameters
    protected Integer caloriesPerServing(int cals, int servs) {return cals / servs; } // method to pass along parameters
    
    public void setFoodName(String n) { foodName = n; } // Setters and Getters start with a default value anmd will only return values to food product if set
    public String getFoodName() { return foodName; } // Once Set, it creates a public value for the foodProduct class

    public void setFoodType(String f) { foodType = f; }
    public String getFoodType() { return foodType; }

    public void setFoodPrice(double p) { foodPrice = p; }
    public Double getFoodPrice() { return foodPrice; }

    public void setFoodServing(Integer s) { foodServing = s; }
    public Integer getFoodServing() { return foodServing; }

    public void setFoodCalories(Integer c) { foodCalories = c; }
    public Integer getFoodCalories() { return foodCalories;}

    public void setFoodWeight(Integer w) { foodWeight = w;}
    public Integer getFoodWeight() { return foodWeight; }
}
