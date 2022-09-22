import static java.lang.System.out;

public class useFoodProduct {
    public static void main(String[] args) {
        foodProduct peach;
        foodProduct apple;
        foodProduct pizza;

        peach = new foodProduct();
        apple = new foodProduct();
        pizza = new foodProduct();

        peach.setFoodName("Peach");
        peach.setFoodType("Fruit");
        peach.setFoodPrice(1.09);
        peach.setFoodCalories(69);
        peach.setFoodServing(1);
        peach.setFoodWeight(55);

        apple.setFoodName("Apple");
        apple.setFoodType("Fruit");
        apple.setFoodPrice(0.69);
        apple.setFoodCalories(25);
        apple.setFoodServing(1);
        apple.setFoodWeight(45);

        pizza.setFoodName("Pizza");
        pizza.setFoodType("Pie");
        pizza.setFoodPrice(5.99);
        pizza.setFoodCalories(2400);
        pizza.setFoodServing(8);
        pizza.setFoodWeight(300);

        peach.display(); // This calls the display method and makes our code nice and neat.
        out.printf("Price per Gram: $%4.2f\n", peach.priceByWeight(peach.getFoodPrice(), peach.getFoodWeight()));
        out.println("Calories per Serving: " + peach.caloriesPerServing(peach.getFoodCalories(), peach.getFoodServing()));
        out.println();

        apple.display();
        out.printf("Price per Gram: $%4.2f\n", apple.priceByWeight(apple.getFoodPrice(), apple.getFoodWeight()));
        out.println("Calories per Serving: " + apple.caloriesPerServing(apple.getFoodCalories(), apple.getFoodServing()));
        out.println();

        pizza.display();
        out.printf("Price per Gram: $%4.2f\n", pizza.priceByWeight(pizza.getFoodPrice(), pizza.getFoodWeight()));
        out.println("Calories per Serving: " + pizza.caloriesPerServing(pizza.getFoodCalories(), pizza.getFoodServing()));
        out.println();

    }

}
