import java.util.*;

public class MealDriver{
    public static void main(String[] args) {
        Random range = new Random();

        List<Customer> customers = List.of(
            new Customer("Anna", DietPlan.VEGAN),
            new Customer("Pete", DietPlan.NO_RESTRICTION),
            new Customer("Heidy", DietPlan.NUT_ALLERGY),
            new Customer("Mei", DietPlan.VEGAN),
            new Customer("Frank", DietPlan.PALEO),
            new Customer("Kyle", DietPlan.NUT_ALLERGY)
        );

        MacroNutrientAbstractFactory factory = MacroNutrientFactoryProvider.getInstance();
        for (Customer c : customers) {
            Meal meal = factory.makeMeal(c.getPlan(), range);
            System.out.println(c.getName() + "'s meal"+ " (" + c.getPlan() + "): " + meal.toString());
        }
    }
}