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

        apple.foodName = "Apple";
        apple.foodType = "Fruit";
        apple.foodPrice = 0.69;
        apple.foodCalories = 25;
        apple.foodServing = 1;

        pizza.foodName = "Pizza";
        pizza.foodType = "Pie";
        pizza.foodPrice = 5.99;
        pizza.foodCalories = 2400;
        pizza.foodServing = 8;

        peach.display(); // This calls the display method and makes our code nice and neat.
        out.println();
        apple.display();
        out.println();
        pizza.display();
        out.println();

    }

}
