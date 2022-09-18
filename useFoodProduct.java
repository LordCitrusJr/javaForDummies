import static java.lang.System.out;

public class useFoodProduct {
    public static void main(String[] args) {
        foodProduct peach;
        foodProduct apple;
        foodProduct pizza;

        peach = new foodProduct();
        apple = new foodProduct();
        pizza = new foodProduct();

        peach.foodName = "Peach";
        peach.foodType = "Fruit";
        peach.foodPrice = 1.09;
        peach.foodCalories = 69;
        peach.foodServing = 1;

        out.println("~Food Data~");
        out.println("Food: " + peach.foodName);
        out.println("Type: " + peach.foodType);
        out.println("Price: $" + peach.foodPrice);
        out.println("Servings Per: " + peach.foodServing);
        out.println("Calories Per Serving: " + peach.foodCalories / peach.foodServing);
        out.println();

        apple.foodName = "Apple";
        apple.foodType = "Fruit";
        apple.foodPrice = 0.69;
        apple.foodCalories = 25;
        apple.foodServing = 1;

        out.println("~Food Data~");
        out.println("Food: " + apple.foodName);
        out.println("Type: " + apple.foodType);
        out.println("Price: $" + apple.foodPrice);
        out.println("Servings Per: " + apple.foodServing);
        out.println("Calories Per Serving: " + apple.foodCalories / apple.foodServing);
        out.println();

        pizza.foodName = "Pizza";
        pizza.foodType = "Pie";
        pizza.foodPrice = 5.99;
        pizza.foodCalories = 2400;
        pizza.foodServing = 8;

        out.println("~Food Data~");
        out.println("Food: " + pizza.foodName);
        out.println("Type: " + pizza.foodType);
        out.println("Price: $" + pizza.foodPrice);
        out.println("Servings Per: " + pizza.foodServing);
        out.println("Calories Per Serving: " + pizza.foodCalories / pizza.foodServing);
        out.println();
    }
}
