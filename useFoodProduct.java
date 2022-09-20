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
        peach.foodWeight = 55;

        apple.foodName = "Apple";
        apple.foodType = "Fruit";
        apple.foodPrice = 0.69;
        apple.foodCalories = 25;
        apple.foodServing = 1;
        apple.foodWeight = 45;

        pizza.foodName = "Pizza";
        pizza.foodType = "Pie";
        pizza.foodPrice = 5.99;
        pizza.foodCalories = 2400;
        pizza.foodServing = 8;
        pizza.foodWeight = 300;

        peach.display(); // This calls the display method and makes our code nice and neat.
        out.printf("Price per Gram: $%4.2f\n", peach.priceByWeight(peach.foodPrice, peach.foodWeight));
        out.println("Calories per Serving: " + peach.caloriesPerServing(peach.foodCalories, peach.foodServing));
        out.println();

        apple.display();
        out.printf("Price per Gram: $%4.2f\n", apple.priceByWeight(apple.foodPrice, apple.foodWeight));
        out.println("Calories per Serving: " + apple.caloriesPerServing(apple.foodCalories, apple.foodServing));
        out.println();

        pizza.display();
        out.printf("Price per Gram: $%4.2f\n", pizza.priceByWeight(pizza.foodPrice, pizza.foodWeight));
        out.println("Calories per Serving: " + pizza.caloriesPerServing(pizza.foodCalories, pizza.foodServing));
        out.println();

    }

}
