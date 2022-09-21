public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal VegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        VegMeal.showItems();
        System.out.println("Total cost: " +VegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: " +nonVegMeal.getCost());
    }
}
